package io.defy.www.coupleadmin.presenter

import io.defy.www.coupleadmin.contract.PermissionContract

class PermissionPresenter : PermissionContract.Presenter {

    private var view: PermissionContract.View? = null;

    override fun attachView(view: Any) {
        this.view = view as PermissionContract.View
    }

    override fun detachView(view: Any) {
        this.view = null
    }

}