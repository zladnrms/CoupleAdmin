package io.defy.www.coupleadmin.contract

import android.content.Context
import io.defy.www.coupleadmin.model.data.ContactsData
import java.util.*

interface ContactsContract {
    interface View {
        fun add(data : ContactsData)
    }

    interface Presenter {
        fun attachView(view: Any)

        fun detachView(view: Any)

        fun getCallLog(context : Context)

        fun timeToString(time : Long) : String

        fun stringToDate(date : String) : Date
    }
}