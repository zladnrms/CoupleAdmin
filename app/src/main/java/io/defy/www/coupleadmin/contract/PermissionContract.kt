package io.defy.www.coupleadmin.contract

import android.content.Context

interface PermissionContract {
    interface View {

    }

    interface Presenter {
        fun attachView(view: Any)

        fun detachView(view: Any)
    }
}