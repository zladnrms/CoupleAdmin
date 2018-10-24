package io.defy.www.coupleadmin.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 =2\u00020\u0001:\u0001=B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0002J(\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020$H\u0003J.\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\"J\b\u0010,\u001a\u00020\u001cH\u0016J\u0012\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020\u001cH\u0016J\b\u00102\u001a\u00020\u001cH\u0016J \u00103\u001a\u00020\'2\u0006\u0010/\u001a\u0002002\u0006\u00104\u001a\u00020\'2\u0006\u00105\u001a\u00020\'H\u0016J\u0010\u00106\u001a\u00020$2\u0006\u0010/\u001a\u000200H\u0016J\b\u00107\u001a\u00020\u001cH\u0004J\u0016\u00108\u001a\u00020\u001c2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006>"}, d2 = {"Lio/defy/www/coupleadmin/service/NeverdieService;", "Landroid/app/Service;", "()V", "contactsRepo", "Lcom/zeniex/www/zeniexautomarketing/model/ContactsDataRepositoryModel;", "lm", "Landroid/location/LocationManager;", "getLm", "()Landroid/location/LocationManager;", "lm$delegate", "Lkotlin/Lazy;", "locationRepo", "Lcom/zeniex/www/zeniexautomarketing/model/LocationDataRepositoryModel;", "mLocationListener", "Landroid/location/LocationListener;", "mainThread", "Ljava/lang/Thread;", "retrofitClient", "Lcom/zeniex/www/zeniexautomarketing/network/ApiInterface;", "getRetrofitClient", "()Lcom/zeniex/www/zeniexautomarketing/network/ApiInterface;", "retrofitClient$delegate", "compareDate", "", "dateA", "Ljava/util/Date;", "dateB", "compareLocation", "", "latitude", "", "longitude", "altitude", "accuracy", "", "isLocationPermission", "", "locationToServer", "uid", "", "lat", "lng", "alt", "acc", "nowLocationToServer", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "onDestroy", "onStartCommand", "flags", "startId", "onUnbind", "setAlarmTimer", "showToast", "application", "Landroid/app/Application;", "msg", "", "Companion", "app_debug"})
public final class NeverdieService extends android.app.Service {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy retrofitClient$delegate = null;
    private com.zeniex.www.zeniexautomarketing.model.ContactsDataRepositoryModel contactsRepo;
    private com.zeniex.www.zeniexautomarketing.model.LocationDataRepositoryModel locationRepo;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy lm$delegate = null;
    private java.lang.Thread mainThread;
    private final android.location.LocationListener mLocationListener = null;
    @org.jetbrains.annotations.Nullable()
    private static android.content.Intent serviceIntent;
    public static final io.defy.www.coupleadmin.service.NeverdieService.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.zeniex.www.zeniexautomarketing.network.ApiInterface getRetrofitClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.location.LocationManager getLm() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.os.IBinder onBind(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
        return null;
    }
    
    @java.lang.Override()
    public boolean onUnbind(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
        return false;
    }
    
    public final void showToast(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    protected final void setAlarmTimer() {
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void compareLocation(double latitude, double longitude, double altitude, float accuracy) {
    }
    
    public void nowLocationToServer() {
    }
    
    @android.support.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.M)
    private final boolean isLocationPermission() {
        return false;
    }
    
    public final void locationToServer(int uid, double lat, double lng, double alt, float acc) {
    }
    
    private final long compareDate(java.util.Date dateA, java.util.Date dateB) {
        return 0L;
    }
    
    public NeverdieService() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lio/defy/www/coupleadmin/service/NeverdieService$Companion;", "", "()V", "serviceIntent", "Landroid/content/Intent;", "getServiceIntent", "()Landroid/content/Intent;", "setServiceIntent", "(Landroid/content/Intent;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final android.content.Intent getServiceIntent() {
            return null;
        }
        
        public final void setServiceIntent(@org.jetbrains.annotations.Nullable()
        android.content.Intent p0) {
        }
        
        private Companion() {
            super();
        }
    }
}