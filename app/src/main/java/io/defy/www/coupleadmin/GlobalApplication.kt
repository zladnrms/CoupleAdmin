package io.defy.www.coupleadmin

import android.app.Application
import android.content.Context
import android.support.multidex.MultiDex
import io.realm.Realm

class GlobalApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(base)
    }
}