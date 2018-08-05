package com.zeniex.www.zeniexautomarketing.network

import com.google.gson.GsonBuilder
import io.defy.www.coupleadmin.BuildConfig
import io.defy.www.coupleadmin.network.AddHeaderInterceptor
import io.defy.www.coupleadmin.network.request.LocationReq
import io.defy.www.coupleadmin.network.response.LocationRes
import io.defy.www.coupleadmin.network.response.UpdateLocationRes
import io.reactivex.Observable
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.http.POST
import retrofit2.http.FormUrlEncoded

interface ApiInterface {

    companion object {
        /* use for Json Response */
        fun create(): ApiInterface {

            val interceptor = HttpLoggingInterceptor()
            interceptor.level = HttpLoggingInterceptor.Level.BODY

            val client = OkHttpClient.Builder()
                    .addInterceptor { chain -> chain.proceed(chain.request()) }
                    .addInterceptor(interceptor)
                    .addNetworkInterceptor(AddHeaderInterceptor()).build()

            val gson = GsonBuilder()
                    .setLenient()
                    .create()

            val retrofit = Retrofit.Builder()
                    .client(client)
                    .baseUrl(BuildConfig.SERVER_URL)
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build()

            return retrofit.create(ApiInterface::class.java)
        }
    }

    @FormUrlEncoded
    @POST("/couple/location/update_location.php")
    fun sendLocation(@Field("uid") uid: Int, @Field("lat") lat: Double, @Field("lng") lng: Double, @Field("alt") alt: Double, @Field("acc") acc: Float): Observable<UpdateLocationRes>

    @FormUrlEncoded
    @POST("/couple/location/get_location.php")
    fun getLocation(@Field("uid") uid: Int): Observable<LocationRes>

}