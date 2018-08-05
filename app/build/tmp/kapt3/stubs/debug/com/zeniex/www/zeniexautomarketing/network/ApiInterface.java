package com.zeniex.www.zeniexautomarketing.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\bf\u0018\u0000 \r2\u00020\u0001:\u0001\rJ@\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\fH\'\u00a8\u0006\u000e"}, d2 = {"Lcom/zeniex/www/zeniexautomarketing/network/ApiInterface;", "", "sendLocation", "Lio/reactivex/Observable;", "Lio/defy/www/coupleadmin/network/response/TestRes;", "uid", "", "lat", "", "lng", "alt", "acc", "", "Companion", "app_debug"})
public abstract interface ApiInterface {
    public static final com.zeniex.www.zeniexautomarketing.network.ApiInterface.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/couple/location/update_location.php")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.Observable<io.defy.www.coupleadmin.network.response.TestRes> sendLocation(@retrofit2.http.Field(value = "uid")
    int uid, @retrofit2.http.Field(value = "lat")
    double lat, @retrofit2.http.Field(value = "lng")
    double lng, @retrofit2.http.Field(value = "alt")
    double alt, @retrofit2.http.Field(value = "acc")
    float acc);
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/zeniex/www/zeniexautomarketing/network/ApiInterface$Companion;", "", "()V", "create", "Lcom/zeniex/www/zeniexautomarketing/network/ApiInterface;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.zeniex.www.zeniexautomarketing.network.ApiInterface create() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}