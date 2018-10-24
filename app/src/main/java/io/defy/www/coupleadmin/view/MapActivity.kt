package io.defy.www.coupleadmin.view

import android.content.Context
import android.content.pm.PackageManager
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.util.Log
import android.widget.Toast
import com.google.android.gms.common.ConnectionResult
import com.google.android.gms.common.api.GoogleApiClient
import com.google.android.gms.common.api.PendingResult
import com.google.android.gms.location.LocationServices
import com.google.android.gms.location.places.PlaceLikelihood
import com.google.android.gms.location.places.PlaceLikelihoodBuffer
import com.google.android.gms.location.places.Places
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.MapFragment
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.*
import io.defy.www.coupleadmin.R
import io.defy.www.coupleadmin.contract.MapContract
import io.defy.www.coupleadmin.presenter.MapPresenter
import kotlinx.android.synthetic.main.activity_map.*

class MapActivity : AppCompatActivity(), MapContract.View, OnMapReadyCallback, GoogleApiClient.OnConnectionFailedListener, GoogleApiClient.ConnectionCallbacks {

    /* Map Control */
    private val DEFAULT_LOCATION : LatLng = LatLng(37.56, 126.97)

    private var mGMap : GoogleMap? = null
    private var mGApiClient : GoogleApiClient? = null

    /* presenter */
    private var presenter: MapContract.Presenter? = null

    /* Variable of Location */
    private var mLocationPermissionGranted : Boolean = false

    private var mLastKnownLocation : Location? = null
    private var mCameraPosition : CameraPosition? = null

    private var currentMarker : Marker? = null;

    private val MAXENTRIES = 5
    private var LikelyPlaceNames = emptyArray<String>()
    private var LikelyAddresses = emptyArray<String>()
    private var LikelyAttributions = emptyArray<String>()
    private var LikelyLatLngs = emptyArray<LatLng>()

    /* 위치 정보 확인 변수 */
    var lm : LocationManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)

        presenter = MapPresenter()
        presenter?.attachView(this)

        mGApiClient = GoogleApiClient.Builder(this)
                .enableAutoManage(this /* FragmentActivity */,
                        this /* OnConnectionFailedListener */)
                .addConnectionCallbacks(this)
                .addApi(LocationServices.API)
                .addApi(Places.GEO_DATA_API)
                .addApi(Places.PLACE_DETECTION_API)
                .build()
        mGApiClient?.connect()

        btnRefresh.setOnClickListener {
            lm?.let {
                try {
                    tvLocation.setText("수신중..")
                    // GPS 제공자의 정보가 바뀌면 콜백하도록 리스너 등록하기~!!!
                    it.requestLocationUpdates(LocationManager.GPS_PROVIDER, // 등록할 위치제공자
                            100L, // 통지사이의 최소 시간간격 (miliSecond)
                            1F, // 통지사이의 최소 변경거리 (m)
                            mLocationListener)
                    it.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, // 등록할 위치제공자
                            100L, // 통지사이의 최소 시간간격 (miliSecond)
                            1F, // 통지사이의 최소 변경거리 (m)
                            mLocationListener)
                } catch (ex: SecurityException) {
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()

        lm = getSystemService(Context.LOCATION_SERVICE) as LocationManager

        isEnabledProvider()

        btnRefresh.performClick()
    }

    override fun onStop() {
        super.onStop()

        lm?.removeUpdates(mLocationListener)  //  미수신할때는 반드시 자원해체를 해주어야 한다.

        if (mGApiClient != null)
            mGApiClient?.disconnect()
    }

    override fun setLocation(lat : Double, lng : Double, alt : Double, acc : Float) {
        Toast.makeText(this, "위치가 업데이트 되었습니다", Toast.LENGTH_SHORT)

        val place = LatLng(lat, lng)

        val markerOptions = MarkerOptions()
        markerOptions.position(place)
        markerOptions.title("위치")
        markerOptions.snippet("위치 설명")
        mGMap?.addMarker(markerOptions)

        mGMap?.moveCamera(CameraUpdateFactory.newLatLng(place))
        mGMap?.animateCamera(CameraUpdateFactory.zoomTo(19F))
    }

    fun isEnabledProvider() {
        val lm = getSystemService(Context.LOCATION_SERVICE) as LocationManager
        // 위치관리자 객체를 얻어온다

//        lm.getBestProvider(criteria, enabledOnly)
        val list = lm.allProviders // 위치제공자 모두 가져오기

        var str = "" // 출력할 문자열
        for (i in list.indices) {
            str += ("위치제공자 : " + list[i] + ", 사용가능여부 -"
                    + lm.isProviderEnabled(list[i]) + "\n")
        }

        tvPassive.text = list[0] + " : " + lm.isProviderEnabled(list[0]);
        tvGps.text = list[1] + " : " + lm.isProviderEnabled(list[1]);
        tvWifi.text = list[2] + " : " + lm.isProviderEnabled(list[2]);
    }

    private val mLocationListener: LocationListener = object : LocationListener {
        override fun onLocationChanged(location: Location) {
            val longitude = location.getLongitude(); //경도
            val latitude = location.getLatitude();   //위도
            val altitude = location.getAltitude();   //고도
            val accuracy = location.getAccuracy();    //정확도
            val provider = location.getProvider();   //위치제공자
            tvLocation.text = "위치정보 : " + provider + "\n위도 : " + longitude + "\n경도 : " + latitude + "\n고도 : " + altitude + "\n정확도 : "  + accuracy;

            val SEOUL = LatLng(latitude, longitude)

            val markerOptions = MarkerOptions()
            markerOptions.position(SEOUL)
            markerOptions.title("서울")
            markerOptions.snippet("한국의 수도")
            mGMap?.addMarker(markerOptions)

            mGMap?.moveCamera(CameraUpdateFactory.newLatLng(SEOUL))
            mGMap?.animateCamera(CameraUpdateFactory.zoomTo(19F))
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

    override fun onMapReady(map: GoogleMap) {
        mGMap = map

        updateLocationUI()
        getDeviceLocation();

    }

    /*
    override fun onStatusChanged(provider: String?, status: Int, extras: Bundle?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    */

    private fun updateLocationUI() {
        if (mGMap == null) {
            return
        }

        if (ContextCompat.checkSelfPermission(this.applicationContext, android.Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
            mLocationPermissionGranted = true
        }

        if (mLocationPermissionGranted) {
            mGMap?.setMyLocationEnabled(true)
            mGMap?.getUiSettings()?.setMyLocationButtonEnabled(true)
        }
    }

    private fun getDeviceLocation() {
        /*
         * Before getting the device location, you must check location
         * permission, as described earlier in the tutorial. Then:
         * Get the best and most recent location of the device, which may be
         * null in rare cases when a location is not available.
         */
        if (mLocationPermissionGranted) {
            mLastKnownLocation = LocationServices.FusedLocationApi.getLastLocation(mGApiClient)
        }

        // Set the map's camera position to the current location of the device.
        mLastKnownLocation?.let {
            if (mCameraPosition != null) {
                mGMap?.moveCamera(CameraUpdateFactory.newCameraPosition(mCameraPosition));
            } else if (it != null) {
                mGMap?.moveCamera(CameraUpdateFactory.newLatLngZoom(LatLng(it.getLatitude(),
                        it.getLongitude()), 19F));
            } else {
                Log.d("getDEveice", "Current location is null. Using defaults.");
                mGMap?.moveCamera(CameraUpdateFactory.newLatLngZoom(DEFAULT_LOCATION, 19F));
                mGMap?.getUiSettings()?.setMyLocationButtonEnabled(false);
            }
        }
    }

    override fun onConnected(p0: Bundle?) {
        val fragmentManager = fragmentManager
        val mapFragment = fragmentManager
                .findFragmentById(R.id.GMap) as MapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onConnectionFailed(p0: ConnectionResult) {

    }

    override fun onConnectionSuspended(p0: Int) {

    }

    /*
    override fun onLocationChanged(location: Location?) {
        Log.i("onLocationchanged", "onLocationChanged call..");
        showCurrentPlace()
    }
*/
/*
    private fun searchCurrentPlaces() {
        mGApiClient?.let {
            @SuppressWarnings("MissingPermission")
            val result : PendingResult<PlaceLikelihoodBuffer> = Places.PlaceDetectionApi
                    .getCurrentPlace(it, null);
            result.setResultCallback{
                var i = 0;

                for (item in it)
                {
                    LikelyPlaceNames[i] = item.getPlace().getName() as String
                    LikelyAddresses[i] = item.getPlace().getAddress() as String
                    LikelyAttributions[i] = item.getPlace().getAttributions() as String
                    LikelyLatLngs[i] = item.getPlace().getLatLng()

                    i++;
                    if(i > MAXENTRIES - 1 ) {
                        break;
                    }
                }

                it.release()

                var location = Location("")
                location.latitude = LikelyLatLngs[0].latitude
                location.longitude = LikelyLatLngs[0].longitude

                setCurrentLocation(location, LikelyPlaceNames[0], LikelyAddresses[0]);
            }
        }
    }

    fun showCurrentPlace(location : Location, markerTitle : String, markerSnippet : String)
    {
        if(currentMarker != null) currentMarker?.remove()

        this.mGMap?.let {
            if(location != null)
            {
                var currentLocation = LatLng( location.getLatitude(), location.getLongitude())

                var markerOptions = MarkerOptions()
                markerOptions.position(currentLocation);
                markerOptions.title(markerTitle);
                markerOptions.snippet(markerSnippet);
                markerOptions.draggable(true);
                markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
                currentMarker = it.addMarker(markerOptions);

                it.moveCamera(CameraUpdateFactory.newLatLng(currentLocation));
                return
            }

            var markerOptions = MarkerOptions()
            markerOptions.position(DEFAULT_LOCATION);
            markerOptions.title(markerTitle);
            markerOptions.snippet(markerSnippet);
            markerOptions.draggable(true);
            markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
            currentMarker = it.addMarker(markerOptions);

            it.moveCamera(CameraUpdateFactory.newLatLng(DEFAULT_LOCATION));
        }

    }*/

    private fun showCurrentPlace() {
        if (mGMap == null) {
            return;
        }

        mGApiClient?.let{
        if (mLocationPermissionGranted) {
            // Get the likely places - that is, the businesses and other points of interest that
            // are the best match for the device's current location.
            @SuppressWarnings("MissingPermission")
            var result = Places.PlaceDetectionApi.getCurrentPlace(it, null);
            result.setResultCallback{
                    var i = 0

                for (item in it)
                {
                    LikelyPlaceNames[i] = item.getPlace().getName() as String
                    LikelyAddresses[i] = item.getPlace().getAddress() as String
                    LikelyAttributions[i] = item.getPlace().getAttributions() as String
                    LikelyLatLngs[i] = item.getPlace().getLatLng()

                    i++;
                    if(i > MAXENTRIES - 1 ) {
                        break;
                    }
                }


                it.release()

                var location = Location("")
                location.latitude = LikelyLatLngs[0].latitude
                location.longitude = LikelyLatLngs[0].longitude

                mGMap?.addMarker(MarkerOptions()
                        .title(LikelyPlaceNames[0])
                        .position(LatLng(LikelyLatLngs[0].latitude, LikelyLatLngs[0].longitude)
                 ).snippet(LikelyAddresses[0]))
            }
        } else {
            // Add a default marker, because the user hasn't selected a place.
            mGMap?.addMarker(MarkerOptions()
                    .title("서울")
                    .position(DEFAULT_LOCATION)
                    .snippet("서ㅏ울"));
        }
        }
    }
}
