package com.zeniex.www.zeniexautomarketing.network

import com.google.gson.GsonBuilder
import io.defy.www.coupleadmin.BuildConfig
import io.defy.www.coupleadmin.network.AddHeaderInterceptor
import io.reactivex.Observable
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.converter.scalars.ScalarsConverterFactory


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

    /* 자동로그인 */
    @GET("")
    fun autologin(@Header("Cookie") cookie : String?) : Call<String>

    /* 로그아웃 */
    @GET("login_out.html")
    fun logout(@Header("Cookie") cookie : String?) : Call<String>


    /* 지갑관리 */
    @GET("account_balance.html")
    fun balanaceData(@Header("Cookie") cookie : String?) : Call<String>

    /* 회원 UID 가져오기 */
    @GET("user_center_info.html")
    fun userUIDData(@Header("Cookie") cookie : String?) : Call<String>
}