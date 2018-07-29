package com.zeniex.www.zeniexautomarketing.model

import io.defy.www.coupleadmin.model.data.ContactsData
import java.util.*

interface ContactsDataRepositoryModel {
    fun insert(id : Int?, phone_number : String, display_name : String?, email : String?, date : Date?, photo_id : String?)

    fun select() : ContactsData

    fun delete()

    fun realmClose()
}