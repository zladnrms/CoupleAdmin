package io.defy.www.coupleadmin.presenter

import android.content.Context
import android.database.Cursor
import android.provider.CallLog
import android.util.Log
import com.zeniex.www.zeniexautomarketing.model.ContactsDataRepositoryModel
import com.zeniex.www.zeniexautomarketing.network.ApiInterface
import io.defy.www.coupleadmin.calllog.CallDetails
import io.defy.www.coupleadmin.contract.ContactsContract
import io.defy.www.coupleadmin.model.ContactsDataRepository
import io.defy.www.coupleadmin.model.data.ContactsData
import java.text.SimpleDateFormat
import java.util.*


class ContactsPresenter : ContactsContract.Presenter {

    private var view: ContactsContract.View? = null;
    private var repo: ContactsDataRepositoryModel? = null

    val apiInterface by lazy {
        ApiInterface.create()
    }

    override fun attachView(view: Any) {
        this.view = view as ContactsContract.View
        this.repo = ContactsDataRepository.getInstance()
    }

    override fun detachView(view: Any) {
        this.view = null
    }

    override fun getCallLog(context: Context) {
        val cursor : Cursor = CallDetails.getCallLog(context)

        repo?.let {
            it.delete()
        }

        while (cursor.moveToNext()) {
            val type : String? = cursor.getString(cursor.getColumnIndex(CallLog.Calls.TYPE)) //수신(1) 발신(2) 부재중(3) 타입
            val name : String? = cursor.getString(cursor.getColumnIndex(CallLog.Calls.CACHED_NAME)) //이름
            val phoneNumber : String? = cursor.getString(cursor.getColumnIndex(CallLog.Calls.NUMBER)) //전화번호
            val duration : Int? = cursor.getString(cursor.getColumnIndex(CallLog.Calls.DURATION)).toInt() //통화시간 ( 초단위 )
            //val date : String? =  stringToDate(timeToString(cursor.getLong(cursor.getColumnIndex(CallLog.Calls.DATE)))) //날짜
            val date : Date? =  stringToDate(timeToString(cursor.getLong(cursor.getColumnIndex(CallLog.Calls.DATE)))) //날짜

            ifNotNull(repo, type, duration) { repo, type, duration ->
                repo.insert(type.toInt(), phoneNumber, name, duration, null,null, date)
                val data = ContactsData(type.toInt(), phoneNumber, name, duration, null, null, date)
                view?.add(data)
            }
            //Timber.log(2, type + " , " + name + " , " + phoneNumber + " , " + duration + ", " + date )
            //Log.d("dd",type + " , " + name + " , " + phoneNumber + " , " + duration + ", " + date )
        }
        cursor.close()
    }

    inline fun <A, B, C, R> ifNotNull(a: A?, b: B?, c: C?, code: (A, B, C) -> R) {
        if (a != null && b != null && c != null) {
            code(a, b, c)
        } else
        {
            Log.d("ㅇㅇ","에러")
        }
    }

    override fun timeToString(time : Long) : String {
        val simpleFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        val date : String = simpleFormat.format(Date(time))

        return date
    }

    override fun stringToDate(date : String) : Date {
        val simpleFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        val date = simpleFormat.parse(date)

        return date
    }
}