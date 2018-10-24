package io.defy.www.coupleadmin.presenter

import android.util.Log
import android.widget.Toast
import com.zeniex.www.zeniexautomarketing.network.ApiInterface
import io.defy.www.coupleadmin.contract.MapContract
import io.defy.www.coupleadmin.network.response.LocationRes
import io.defy.www.coupleadmin.network.response.UpdateLocationRes
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers


class MapPresenter : MapContract.Presenter {

    val retrofitClient by lazy {
        ApiInterface.create()
    }

    private var view: MapContract.View? = null

    override fun attachView(view: Any) {
        this.view = view as MapContract.View
    }

    override fun detachView(view: Any) {
        this.view = null
    }

    fun getLocationMyCouple() {
        retrofitClient.getLocation(100)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : Observer<LocationRes> {
                    override fun onSubscribe(d: Disposable) {

                    }

                    override fun onNext(repo: LocationRes) {
                        repo?.let {
                            view?.setLocation(repo.lat, repo.lng, repo.alt, repo.acc)
                        }
                    }

                    override fun onError(e: Throwable) {
                    }

                    override fun onComplete() {
                    }
                })
    }
}