package io.defy.www.coupleadmin.model.data;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class LocationData extends RealmObject { // 스트리밍 방  정보 클래스

    @PrimaryKey
    private int _id;

    @Required
    private Double lat;

    @Required
    private Double lng;

    @Required
    private Double alt;

    @Required
    private Float acc;

    @Required
    private Date date;

    public LocationData() {

    }

    public LocationData(Double lat, Double lng, Double alt, Float acc, Date date) {
        this.lat = lat;
        this.lng = lng;
        this.alt = alt;
        this.acc = acc;
        this.date = date;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public Double getAlt() {
        return alt;
    }

    public void setAlt(Double alt) {
        this.alt = alt;
    }

    public Float getAcc() {
        return acc;
    }

    public void setAcc(Float acc) {
        this.acc = acc;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}