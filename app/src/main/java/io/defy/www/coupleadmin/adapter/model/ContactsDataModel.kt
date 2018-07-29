package io.defy.www.coupleadmin.adapter.model

import io.defy.www.coupleadmin.model.data.ContactsData

interface ContactsDataModel {
    /* 데이터 추가 */
    fun add(data: ContactsData)

    /* 데이터 제거 */
    fun remove(position: Int)

    /* 데이터 초기화*/
    fun clear()
}