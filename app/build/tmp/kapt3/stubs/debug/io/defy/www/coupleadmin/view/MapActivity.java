package io.defy.www.coupleadmin.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010)\u001a\u00020*H\u0002J\u0006\u0010+\u001a\u00020*J\u0012\u0010,\u001a\u00020*2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0010\u0010/\u001a\u00020*2\u0006\u0010-\u001a\u000200H\u0016J\u0010\u00101\u001a\u00020*2\u0006\u0010-\u001a\u00020\u0012H\u0016J\u0012\u00102\u001a\u00020*2\b\u00103\u001a\u0004\u0018\u00010.H\u0014J\u0010\u00104\u001a\u00020*2\u0006\u00105\u001a\u00020 H\u0016J\b\u00106\u001a\u00020*H\u0014J\b\u00107\u001a\u00020*H\u0014J\b\u00108\u001a\u00020*H\u0002J\b\u00109\u001a\u00020*H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\fR\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\fR\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\nX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u000fR\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\'\u001a\u0004\u0018\u00010(X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006:"}, d2 = {"Lio/defy/www/coupleadmin/view/MapActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lio/defy/www/coupleadmin/contract/MapContract$View;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;", "Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;", "()V", "DEFAULT_LOCATION", "Lcom/google/android/gms/maps/model/LatLng;", "LikelyAddresses", "", "", "[Ljava/lang/String;", "LikelyAttributions", "LikelyLatLngs", "[Lcom/google/android/gms/maps/model/LatLng;", "LikelyPlaceNames", "MAXENTRIES", "", "currentMarker", "Lcom/google/android/gms/maps/model/Marker;", "lm", "Landroid/location/LocationManager;", "getLm", "()Landroid/location/LocationManager;", "setLm", "(Landroid/location/LocationManager;)V", "mCameraPosition", "Lcom/google/android/gms/maps/model/CameraPosition;", "mGApiClient", "Lcom/google/android/gms/common/api/GoogleApiClient;", "mGMap", "Lcom/google/android/gms/maps/GoogleMap;", "mLastKnownLocation", "Landroid/location/Location;", "mLocationListener", "Landroid/location/LocationListener;", "mLocationPermissionGranted", "", "presenter", "Lio/defy/www/coupleadmin/contract/MapContract$Presenter;", "getDeviceLocation", "", "isEnabledProvider", "onConnected", "p0", "Landroid/os/Bundle;", "onConnectionFailed", "Lcom/google/android/gms/common/ConnectionResult;", "onConnectionSuspended", "onCreate", "savedInstanceState", "onMapReady", "map", "onResume", "onStop", "showCurrentPlace", "updateLocationUI", "app_debug"})
public final class MapActivity extends android.support.v7.app.AppCompatActivity implements io.defy.www.coupleadmin.contract.MapContract.View, com.google.android.gms.maps.OnMapReadyCallback, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks {
    private final com.google.android.gms.maps.model.LatLng DEFAULT_LOCATION = null;
    private com.google.android.gms.maps.GoogleMap mGMap;
    private com.google.android.gms.common.api.GoogleApiClient mGApiClient;
    private io.defy.www.coupleadmin.contract.MapContract.Presenter presenter;
    private boolean mLocationPermissionGranted;
    private android.location.Location mLastKnownLocation;
    private com.google.android.gms.maps.model.CameraPosition mCameraPosition;
    private com.google.android.gms.maps.model.Marker currentMarker;
    private final int MAXENTRIES = 5;
    private java.lang.String[] LikelyPlaceNames;
    private java.lang.String[] LikelyAddresses;
    private java.lang.String[] LikelyAttributions;
    private com.google.android.gms.maps.model.LatLng[] LikelyLatLngs;
    @org.jetbrains.annotations.Nullable()
    private android.location.LocationManager lm;
    private final android.location.LocationListener mLocationListener = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final android.location.LocationManager getLm() {
        return null;
    }
    
    public final void setLm(@org.jetbrains.annotations.Nullable()
    android.location.LocationManager p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    public final void isEnabledProvider() {
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap map) {
    }
    
    private final void updateLocationUI() {
    }
    
    private final void getDeviceLocation() {
    }
    
    @java.lang.Override()
    public void onConnected(@org.jetbrains.annotations.Nullable()
    android.os.Bundle p0) {
    }
    
    @java.lang.Override()
    public void onConnectionFailed(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.common.ConnectionResult p0) {
    }
    
    @java.lang.Override()
    public void onConnectionSuspended(int p0) {
    }
    
    private final void showCurrentPlace() {
    }
    
    public MapActivity() {
        super();
    }
}