package io.defy.www.coupleadmin.model;

import android.content.SharedPreferences;

import com.zeniex.www.zeniexautomarketing.model.ContactsDataRepositoryModel;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Date;

import io.defy.www.coupleadmin.model.data.ContactsData;
import io.realm.Realm;
import io.realm.RealmResults;

public class ContactsDataRepository implements ContactsDataRepositoryModel {

    private SharedPreferences pref;
    private SharedPreferences.Editor editor;

    private static ContactsDataRepository instance;
    private static Realm realm;

    public static ContactsDataRepository getInstance() {
        if (instance == null) {
            instance = new ContactsDataRepository();
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
            realm.delete(ContactsData.class);
        });
    }

    @Override
    public void insert(@Nullable Integer type, @Nullable String phone_number, @Nullable String display_name, @Nullable Integer duration, @Nullable String email, @Nullable String photo_id, @Nullable String date) {
        if (realm != null && !realm.isClosed()) {
        } else {
            realm = Realm.getDefaultInstance();
        }

        realm.executeTransaction(realm1 -> {
            Number maxId = realm.where(ContactsData.class).max("_id");
            // If there are no rows, currentId is null, so the next id must be 1
            // If currentId is not null, increment it by 1
            int nextId = (maxId == null) ? 1 : maxId.intValue() + 1;

            // User object created with the new Primary key
            ContactsData data = realm.createObject(ContactsData.class, nextId);
            data.setType(type);
            data.setEmail(email);
            data.setPhone_number(phone_number);
            data.setDisplay_name(display_name);
            data.setDuration(duration);
            data.setPhoto_id(photo_id);
            data.setDate(date);
            data.setEmail(email);
        });
    }

    @Override
    public ContactsData select() {
        if (realm != null && !realm.isClosed()) {
        } else {
            realm = Realm.getDefaultInstance();
        }

        ContactsData result = null;

        realm.beginTransaction();
        long count = realm.where(ContactsData.class).count();
        if (count > 0) {
            RealmResults<ContactsData> realmResult = realm.where(ContactsData.class).findAll();
            result = realmResult.get(0);
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