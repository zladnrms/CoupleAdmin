package io.defy.www.coupleadmin.model.data;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class ContactsData extends RealmObject { // 스트리밍 방  정보 클래스

    @PrimaryKey
    private int _id;

    private int id;

    @Required
    private String phone_number;

    private String display_name;

    private String email;

    private String photo_id;

    @Required
    private Date date;

    public ContactsData() {

    }

    public ContactsData(int id, String phone_number, String display_name, String email, String photo_id, Date date) {
        this.id = id;
        this.phone_number = phone_number;
        this.display_name = display_name;
        this.email = email;
        this.photo_id = photo_id;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoto_id() {
        return photo_id;
    }

    public void setPhoto_id(String photo_id) {
        this.photo_id = photo_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}