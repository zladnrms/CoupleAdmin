package io.defy.www.coupleadmin.contract

import android.content.Context

interface MapContract {
    interface View {
        fun setLocation(lat : Double, lng : Double, alt : Double, acc : Float)
    }

    interface Presenter {
        fun attachView(view: Any)

        fun detachView(view: Any)
    }
}