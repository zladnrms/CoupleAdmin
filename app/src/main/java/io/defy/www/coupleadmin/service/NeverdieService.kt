package io.defy.www.coupleadmin.service

import android.app.*
import android.content.Context
import android.content.Intent
import android.os.IBinder
import android.os.CountDownTimer
import android.os.SystemClock
import android.util.Log
import io.defy.www.coupleadmin.receiver.MultiReceiver

class NeverdieService : Service() {

    private val MILLISINFUTURE = 1000 * 1000L;
    private val COUNT_DOWN_INTERVAL = 1000L;

    private var countDownTimer: CountDownTimer? = null

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }

    override fun onCreate() {
        //unregisterRestartAlarm()
        super.onCreate()
        //initData()

        /*
        startForeground(this)
        stopSelf()
        */
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        /*
        startForeground(1, Notification())

        /**
         * startForeground 를 사용하면 notification 을 보여주어야 하는데 없애기 위한 코드
         */
        val nm = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        val notification: Notification

        notification = Notification.Builder(applicationContext)
                .setContentTitle("")
                .setContentText("")
                .build()

        nm.notify(startId, notification)
        nm.cancel(startId)*/

        return super.onStartCommand(intent, flags, startId)

    }

    override fun onDestroy() {
        super.onDestroy()
        //Log.i("PersistentService", "onDestroy")
        //countDownTimer?.cancel()

        /**
         * 서비스 종료 시 알람 등록을 통해 서비스 재 실행
         */
        //registerRestartAlarm()

        //stopForeground(true)
    }

    private fun initData() {
        countDownTimer()
        countDownTimer?.start()
    }

    private fun countDownTimer() {
        countDownTimer = object : CountDownTimer(MILLISINFUTURE, COUNT_DOWN_INTERVAL) {
            override fun onTick(p0: Long) {
                Log.i("PersistentService", "onTick")
            }

            override fun onFinish() {
                Log.i("PersistentService", "onFinish")
            }
        }
    }

    /**
     * 알람 매니져에 서비스 등록
     */
    private fun registerRestartAlarm() {
        Log.i("000 PersistentService", "registerRestartAlarm")
        val intent = Intent(this, MultiReceiver::class.java)
        intent.setAction("ACTION.RESTART.PersistentService")
        val sender: PendingIntent = PendingIntent.getBroadcast(this, 0, intent, 0)

        var firstTime = SystemClock.elapsedRealtime()
        firstTime += 1 * 1000;

        val alarmManager = getSystemService(ALARM_SERVICE) as AlarmManager

        /**
         * 알람 등록
         */
        alarmManager.setRepeating(AlarmManager.ELAPSED_REALTIME_WAKEUP, firstTime, 1 * 1000, sender);
    }

    private fun unregisterRestartAlarm() {
        Log.i("000 PersistentService", "unregisterRestartAlarm")
        val intent = Intent(this, MultiReceiver::class.java)
        intent.setAction("ACTION.RESTART.PersistentService")
        val sender: PendingIntent = PendingIntent.getBroadcast(this, 0, intent, 0)

        val alarmManager = getSystemService(ALARM_SERVICE) as AlarmManager
        alarmManager.cancel(sender);
    }

    /*
    fun startForeground(service: Service?) {
        if (service != null) {
            try {
                val notification = getNotification(service)
                if (notification != null) {
                    service.startForeground(1220, notification)
                }
            } catch (e: Exception) {

            }
        }
    }

    fun getNotification(paramContext: Context): Notification? {
        var smallIcon = R.mipmap.ic_launcher
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            smallIcon = R.mipmap.ic_launcher_round
        }
        val notification = NotificationCompat.Builder(paramContext)
                .setSmallIcon(smallIcon)
                .setPriority(NotificationCompat.PRIORITY_MIN)
                .setAutoCancel(true)
                .setWhen(0)
                .setTicker("").build()
        notification.flags = 16
        return notification
    }*/
}
