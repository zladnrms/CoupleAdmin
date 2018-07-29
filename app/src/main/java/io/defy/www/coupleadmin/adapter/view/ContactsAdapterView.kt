package io.defy.www.coupleadmin.adapter.view

import io.defy.www.coupleadmin.contract.ContactsAdapterContract

/**
 * Created by kim on 2017-09-20.
 */
interface ContactsAdapterView : ContactsAdapterContract.View {
    /* 데이터 갱신 */
    fun refresh()
}