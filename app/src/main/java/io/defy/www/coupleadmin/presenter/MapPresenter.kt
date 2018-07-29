package io.defy.www.coupleadmin.presenter

import io.defy.www.coupleadmin.contract.MapContract

class MapPresenter : MapContract.Presenter {

    private var view: MapContract.View? = null;

    override fun attachView(view: Any) {
        this.view = view as MapContract.View
    }

    override fun detachView(view: Any) {
        this.view = null
    }

}