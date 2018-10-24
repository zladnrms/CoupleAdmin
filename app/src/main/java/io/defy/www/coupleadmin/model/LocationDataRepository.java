package io.defy.www.coupleadmin.model;

import android.content.SharedPreferences;


import com.zeniex.www.zeniexautomarketing.model.LocationDataRepositoryModel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Date;

import io.defy.www.coupleadmin.model.data.LocationData;
import io.realm.Realm;
import io.realm.RealmResults;

public class LocationDataRepository implements LocationDataRepositoryModel {

    private SharedPreferences pref;
    private SharedPreferences.Editor editor;

    private static LocationDataRepository instance;
    private static Realm realm;

    public static LocationDataRepository getInstance() {
        if (instance == null) {
            instance = new LocationDataRepository();
            realm = Realm.getDefaultInstance();

        }
        return instance;
    }

    @Override
    public void delete() {
        if (realm != null && !realm.isClosed()) {
        } else {
            realm = Realm.getDefaultInstance();
        }

        realm.executeTransaction(realm1 -> {
            realm.delete(LocationData.class);
        });
    }

    @Override
    public void insert(double lat, double lng, double alt, float acc, @NotNull Date date) {
        if (realm != null && !realm.isClosed()) {
        } else {
            realm = Realm.getDefaultInstance();
        }

        realm.executeTransaction(realm1 -> {
            Number maxId = realm.where(LocationData.class).max("_id");
            // If there are no rows, currentId is null, so the next id must be 1
            // If currentId is not null, increment it by 1
            int nextId = (maxId == null) ? 1 : maxId.intValue() + 1;

            // User object created with the new Primary key
            LocationData data = realm.createObject(LocationData.class, nextId);
            data.setLat(lat);
            data.setLng(lng);
            data.setAlt(alt);
            data.setAcc(acc);
            data.setDate(date);
        });
    }

    @Override
    public LocationData select() {
        if (realm != null && !realm.isClosed()) {
        } else {
            realm = Realm.getDefaultInstance();
        }

        LocationData result = null;

        realm.beginTransaction();
        int count = (int)realm.where(LocationData.class).count();
        if (count > 0) {
            RealmResults<LocationData> realmResult = realm.where(LocationData.class).findAll();
            result = realmResult.get(count - 1);
        } else {
            result = null;
        }
        realm.commitTransaction();

        return result;
    }

    @Override
    public RealmResults<LocationData> selectAll() {
        if (realm != null && !realm.isClosed()) {
        } else {
            realm = Realm.getDefaultInstance();
        }

        RealmResults<LocationData> result = null;

        realm.beginTransaction();
        int count = (int)realm.where(LocationData.class).count();
        if (count > 0) {
            result = realm.where(LocationData.class).findAll();
        } else {
            result = null;
        }
        realm.commitTransaction();

        return result;
    }

    @Override
    public void realmClose() {
        realm.close();
    }
}