package io.defy.www.coupleadmin.service

import android.Manifest
import android.app.*
import android.content.Context
import android.content.Intent
import android.util.Log
import com.zeniex.www.zeniexautomarketing.network.ApiInterface
import io.defy.www.coupleadmin.network.response.UpdateLocationRes
import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.content.pm.PackageManager
import android.os.*
import android.support.annotation.RequiresApi
import android.widget.Toast
import com.zeniex.www.zeniexautomarketing.model.ContactsDataRepositoryModel
import com.zeniex.www.zeniexautomarketing.model.LocationDataRepositoryModel
import io.defy.www.coupleadmin.model.ContactsDataRepository
import io.defy.www.coupleadmin.model.LocationDataRepository
import io.defy.www.coupleadmin.receiver.AlarmRecever
import java.text.SimpleDateFormat
import java.util.*


class NeverdieService : Service() {

    val retrofitClient by lazy {
        ApiInterface.create()
    }

    val lm by lazy {
        getSystemService(Context.LOCATION_SERVICE) as LocationManager
    }

    companion object {
        var serviceIntent: Intent? = null

        fun nowPhoneCallToServer(phoneNumber : String) {
            Log.d("ㅇㅇ", phoneNumber)
        }
    }

    private var contactsRepo: ContactsDataRepositoryModel? = null
    private var locationRepo: LocationDataRepositoryModel? = null
    private var mainThread: Thread? = null

    override fun onCreate() {
        super.onCreate()
    }

    override fun onBind(intent: Intent): IBinder? {
        return null
    }

    override fun onUnbind(intent: Intent): Boolean {
        return super.onUnbind(intent)
    }

    fun showToast(application: Application, msg: String) {
        val h = Handler(application.mainLooper)
        h.post { Toast.makeText(application, msg, Toast.LENGTH_LONG).show() }
    }

    protected fun setAlarmTimer() {
        val c = Calendar.getInstance()
        c.timeInMillis = System.currentTimeMillis()
        c.add(Calendar.SECOND, 1)
        val intent = Intent(this, AlarmRecever::class.java)
        val sender = PendingIntent.getBroadcast(this, 0, intent, 0)

        val mAlarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
        mAlarmManager.set(AlarmManager.RTC_WAKEUP, c.timeInMillis, sender)
    }

    override fun onStartCommand(intent: Intent, flags: Int, startId: Int): Int {

        contactsRepo = ContactsDataRepository.getInstance()
        locationRepo = LocationDataRepository.getInstance()

        serviceIntent = intent
        /*
        showToast(application, "Start Service")

        mainThread = Thread(Runnable {
            val sdf = SimpleDateFormat("aa hh:mm")
            var run = true
            var a = 0
            while (run) {
                try {
                    Thread.sleep((1000 * 6 * 1).toLong()) // 1 minute
                    val date = Date()
                    showToast(application, sdf.format(date) + " : " + a)
                    a++
                    nowLocationToServer()
                } catch (e: InterruptedException) {
                    run = false
                    e.printStackTrace()
                }

            }
        })
        mainThread?.start()
*/
        return Service.START_NOT_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("onDestory", "service down..")
        lm?.removeUpdates(mLocationListener)

        serviceIntent = null
        setAlarmTimer()
        Thread.currentThread().interrupt()

        if (mainThread != null) {
            mainThread?.interrupt()
            mainThread = null
        }
    }

    private fun compareLocation(latitude : Double, longitude : Double, altitude : Double, accuracy : Float) {
        val recentLocation = locationRepo?.select()
        val now = Date()

        recentLocation?.let {
            /*
                최근 위치 데이터가 로컬 DB에 없다면 (초기화 되었거나 처음이라서)
                위치 데이터를 로컬 DB에 저장하고 서버로 보냄

                최근 위치 데이터가 있고 15분 이상 차이가 났다면 무조건 서버로 보냄
                아니라면 위도 혹은 경도 둘 중 하나가 달라졌을 때만
                서버로 전송하며, 같다면 보내지 않는다
            */

            if(compareDate(now, it.date) > 900000)
            {
                locationToServer(100, latitude, longitude, altitude, accuracy)
            }
            else
            {
                if(it.lat != latitude || it.lng != longitude)
                {
                    locationToServer(100, latitude, longitude, altitude, accuracy)
                }
            }
        } ?: let {
            locationRepo?.insert(latitude, longitude, altitude, accuracy, now)
            locationToServer(100, latitude, longitude, altitude, accuracy)
        }
    }

    open fun nowLocationToServer() { //return Lat, Lng

        if(isLocationPermission())
        {
            lm?.let {
                try {
                    // GPS 제공자의 정보가 바뀌면 콜백하도록 리스너 등록하기~!!!
                    it.requestLocationUpdates(LocationManager.GPS_PROVIDER, // 등록할 위치제공자
                            100L, // 통지사이의 최소 시간간격 (miliSecond)
                            1F, // 통지사이의 최소 변경거리 (m)
                            mLocationListener,
                            Looper.getMainLooper())
                    it.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, // 등록할 위치제공자
                            100L, // 통지사이의 최소 시간간격 (miliSecond)
                            1F, // 통지사이의 최소 변경거리 (m)
                            mLocationListener,
                            Looper.getMainLooper())
                } catch (ex: SecurityException) {
                }
            }
        }
    }

    private val mLocationListener: LocationListener = object : LocationListener {
        override fun onLocationChanged(location: Location) {
            val longitude = location.getLongitude() //경도
            val latitude = location.getLatitude() //위도
            val altitude = location.getAltitude() //고도
            val accuracy = location.getAccuracy() //정확도
            val provider = location.getProvider() //위치제공자

            /* 가장 최근에 로컬 DB에 저장된 위치 데이터와 비교 */
            compareLocation(latitude, longitude, altitude, accuracy)
        }

        override fun onStatusChanged(provider: String, status: Int, extras: Bundle) {
            Log.d("test", "onStatusChanged, provider:" + provider + ", status:" + status + " ,Bundle:" + extras);
        }

        override fun onProviderEnabled(provider: String) {
            Log.d("test", "onProviderEnabled, provider:" + provider);
        }

        override fun onProviderDisabled(provider: String) {
            Log.d("test", "onProviderDisabled, provider:" + provider);
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private fun isLocationPermission(): Boolean {
        var granted = false
        val coarseGranted = checkSelfPermission(Manifest.permission.ACCESS_COARSE_LOCATION)
        val fineAdminGranted = checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION)

        if (coarseGranted == PackageManager.PERMISSION_GRANTED && fineAdminGranted == PackageManager.PERMISSION_GRANTED) {
            granted = true
        }

        return granted
    }

    fun locationToServer(uid : Int, lat : Double, lng : Double, alt : Double, acc : Float) {
        retrofitClient.sendLocation(uid,  lat, lng , alt, acc)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : Observer<UpdateLocationRes> {
                    override fun onSubscribe(d: Disposable) {

                    }

                    override fun onNext(repo: UpdateLocationRes) {
                        repo?.let {
                            Log.d("Startcommand", repo.result)
                        }
                    }

                    override fun onError(e: Throwable) {
                    }

                    override fun onComplete() {
                    }
                })
    }

    private fun compareDate(dateA : Date, dateB : Date) : Long {
        //val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", java.util.Locale.getDefault())
        val diff = dateA.time - dateB.time
        val sec = diff / 1000;

        return sec
    }
}
