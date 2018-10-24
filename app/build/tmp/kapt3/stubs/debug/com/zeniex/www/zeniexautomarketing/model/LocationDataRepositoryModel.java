package com.zeniex.www.zeniexautomarketing.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J0\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u000fH&J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011H&\u00a8\u0006\u0012"}, d2 = {"Lcom/zeniex/www/zeniexautomarketing/model/LocationDataRepositoryModel;", "", "delete", "", "insert", "lat", "", "lng", "alt", "acc", "", "date", "Ljava/util/Date;", "realmClose", "select", "Lio/defy/www/coupleadmin/model/data/LocationData;", "selectAll", "Lio/realm/RealmResults;", "app_debug"})
public abstract interface LocationDataRepositoryModel {
    
    public abstract void insert(double lat, double lng, double alt, float acc, @org.jetbrains.annotations.NotNull()
    java.util.Date date);
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.defy.www.coupleadmin.model.data.LocationData select();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.realm.RealmResults<io.defy.www.coupleadmin.model.data.LocationData> selectAll();
    
    public abstract void delete();
    
    public abstract void realmClose();
}