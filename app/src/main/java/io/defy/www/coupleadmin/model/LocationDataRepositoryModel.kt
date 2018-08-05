package com.zeniex.www.zeniexautomarketing.model

import io.defy.www.coupleadmin.model.data.LocationData
import io.realm.RealmResults
import java.util.*

interface LocationDataRepositoryModel {
    fun insert(lat : Double, lng : Double, alt : Double, acc : Float, date : Date)

    fun select() : LocationData

    fun selectAll() : RealmResults<LocationData>

    fun delete()

    fun realmClose()
}