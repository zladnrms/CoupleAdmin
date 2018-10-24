package io.defy.www.coupleadmin.view

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import io.defy.www.coupleadmin.R
import io.defy.www.coupleadmin.receiver.MultiReceiver
import kotlinx.android.synthetic.main.activity_main.*
import android.content.IntentFilter
import android.util.Log
import android.widget.Toast
import io.defy.www.coupleadmin.service.NeverdieService


class MainActivity : AppCompatActivity() {

    /*
        메뉴 선택과 필수 서비스들의 초기화를 담당한다
     */

    private val receiver : MultiReceiver = MultiReceiver()
    private var serviceIntent: Intent? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnContacts.setOnClickListener {
            val intent = Intent(this, ContactsActivity::class.java)
            startActivity(intent)
        }

        btnGPS.setOnClickListener {
            val intent = Intent(this, MapActivity::class.java)
            startActivity(intent)
        }

        initService()
    }

    override fun onDestroy() {
        super.onDestroy()

        unregisterReceiver(receiver)

        if (serviceIntent != null) {
            stopService(serviceIntent);
            serviceIntent = null;
        }
    }

    fun initService() {

        if (NeverdieService.serviceIntent==null) {
            serviceIntent = Intent(this, NeverdieService::class.java)
            startService(serviceIntent);
        } else {
            serviceIntent = NeverdieService.serviceIntent;//getInstance().getApplication();
            Toast.makeText(this, "already", Toast.LENGTH_LONG).show();
        }

        //val intent = Intent(this, NeverdieService::class.java)
        //startService(intent)

        val intentFilter = IntentFilter(Intent.ACTION_SCREEN_ON)
        intentFilter.addAction(Intent.ACTION_SCREEN_OFF)
        intentFilter.addAction(Intent.ACTION_BOOT_COMPLETED)
        intentFilter.addAction("android.provider.Telephony.SMS_RECEIVED")
        //intentFilter.addAction("io.defy.www.coupleadmin.service.NeverdieService")

        registerReceiver(receiver, intentFilter)
        Log.d("onCreate()", "브로드캐스트리시버 등록됨")
    }
}
