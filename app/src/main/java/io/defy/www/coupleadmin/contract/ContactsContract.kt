package io.defy.www.coupleadmin.contract

import android.content.Context

interface ContactsContract {
    interface View {

    }

    interface Presenter {
        fun attachView(view: Any)

        fun detachView(view: Any)

        fun getCallLog(context : Context)

        fun timeToString(time : Long) : String
    }
}