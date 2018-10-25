package com.zeniex.www.zeniexautomarketing.model

import io.defy.www.coupleadmin.model.data.ContactsData
import java.util.*

interface ContactsDataRepositoryModel {
    fun insert(type : Int?, phone_number : String?, display_name : String?, duration : Int?, email : String?, photo_id : String?, date : String?)

    fun select() : ContactsData

    fun delete()

    fun realmClose()
}