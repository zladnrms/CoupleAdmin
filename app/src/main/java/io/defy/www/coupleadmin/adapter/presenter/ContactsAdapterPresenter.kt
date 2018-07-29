package io.defy.www.coupleadmin.adapter.presenter

import com.zeniex.www.zeniexautomarketing.model.ContactsDataRepositoryModel
import io.defy.www.coupleadmin.adapter.view.ContactsAdapterView
import io.defy.www.coupleadmin.contract.ContactsAdapterContract
import io.defy.www.coupleadmin.contract.ContactsContract
import io.defy.www.coupleadmin.model.ContactsDataRepository

/**
 * Created by kim on 2017-09-14.
 */
class ContactsAdapterPresenter : ContactsAdapterContract.Presenter {

    private var view: ContactsAdapterView? = null
    private var repo: ContactsDataRepositoryModel? = null

    override fun attachView(view: Any) {
        this.view = view as ContactsAdapterView
        this.repo = ContactsDataRepository.getInstance()
    }

    override fun detachView(view: Any) {
        this.view = view as ContactsAdapterView
        this.view = null
    }
}