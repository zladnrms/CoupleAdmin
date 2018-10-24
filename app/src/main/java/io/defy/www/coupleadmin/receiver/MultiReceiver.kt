package io.defy.www.coupleadmin.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.os.Bundle
import android.telephony.SmsMessage
import io.defy.www.coupleadmin.service.NeverdieService
import java.util.*
import android.support.v4.content.ContextCompat.startForegroundService
import android.os.Build



class MultiReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        when (intent.action) {
            Intent.ACTION_BOOT_COMPLETED -> {
                Log.d("onReceive()", "부팅완료")
                val i = Intent(context, NeverdieService::class.java)
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    context.startForegroundService(i)
                } else {
                    context.startService(i)
                }
            }
            "ACTION.RESTART.PersistentService" -> {
                Log.d("onReceive()", "ACTION.RESTART.PersistentService")
                val i = Intent(context, NeverdieService::class.java)
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    context.startForegroundService(i)
                } else {
                    context.startService(i)
                }
            }
            Intent.ACTION_SCREEN_ON -> {
                Log.d("onReceive()", "스크린 ON")
            }
            Intent.ACTION_SCREEN_OFF -> {
                Log.d("onReceive()", "스크린 OFF")
            }
            "android.provider.Telephony.SMS_RECEIVED" -> {
                Log.d("onReceive()", "문자가 수신되었습니다")
                analysisSMS(intent)
            }
        }
    }

    fun analysisSMS(intent: Intent) {
        // SMS 메시지를 파싱합니다.
        val bundle = intent.extras
        val messages = bundle.get("pdus") as Array<Any>
        val smsMessage = arrayOfNulls<SmsMessage>(messages.size)

        for (i in messages.indices) {
            // PDU 포맷으로 되어 있는 메시지를 복원합니다.
            smsMessage[i] = SmsMessage.createFromPdu(messages[i] as ByteArray)
        }

        smsMessage[0]?.let {
            val curDate = Date(it.getTimestampMillis()) // SMS 수신 시간 확인
            Log.d("문자 수신 시간", curDate.toString())
            val origNumber = it.getOriginatingAddress() // SMS 발신 번호 확인
            val message = it.getMessageBody().toString() // SMS 메시지 확인

            Log.d("문자 내용", "발신자 : $origNumber, 내용 : $message")
        }
    }
}