package io.defy.www.coupleadmin.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001&B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0003J.\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u0013H\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0013H\u0016J\b\u0010\"\u001a\u00020\u0013H\u0016J\"\u0010#\u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010$\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u0015H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\'"}, d2 = {"Lio/defy/www/coupleadmin/service/NeverdieService;", "Landroid/app/Service;", "()V", "lm", "Landroid/location/LocationManager;", "getLm", "()Landroid/location/LocationManager;", "lm$delegate", "Lkotlin/Lazy;", "mLocationListener", "Landroid/location/LocationListener;", "retrofitClient", "Lcom/zeniex/www/zeniexautomarketing/network/ApiInterface;", "getRetrofitClient", "()Lcom/zeniex/www/zeniexautomarketing/network/ApiInterface;", "retrofitClient$delegate", "isLocationPermission", "", "locationToServer", "", "uid", "", "lat", "", "lng", "alt", "acc", "", "nowLocationToServer", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "onDestroy", "onStartCommand", "flags", "startId", "ServiceStart", "app_debug"})
public final class NeverdieService extends android.app.Service {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy retrofitClient$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy lm$delegate = null;
    private final android.location.LocationListener mLocationListener = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.zeniex.www.zeniexautomarketing.network.ApiInterface getRetrofitClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.location.LocationManager getLm() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.os.IBinder onBind(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    public void nowLocationToServer() {
    }
    
    @android.support.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.M)
    private final boolean isLocationPermission() {
        return false;
    }
    
    public final void locationToServer(int uid, double lat, double lng, double alt, float acc) {
    }
    
    public NeverdieService() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2 = {"Lio/defy/www/coupleadmin/service/NeverdieService$ServiceStart;", "Ljava/lang/Runnable;", "(Lio/defy/www/coupleadmin/service/NeverdieService;)V", "run", "", "app_debug"})
    public final class ServiceStart implements java.lang.Runnable {
        
        @java.lang.Override()
        public void run() {
        }
        
        public ServiceStart() {
            super();
        }
    }
}