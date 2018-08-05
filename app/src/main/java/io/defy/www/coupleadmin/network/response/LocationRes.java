package io.defy.www.coupleadmin.network.response;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class LocationRes {

    @SerializedName("lat")
    Double lat;

    @SerializedName("lng")
    Double lng;

    @SerializedName("alt")
    Double alt;

    @SerializedName("acc")
    Float acc;

    @SerializedName("date")
    Date date;

    public Double getLat() {
        return lat;
    }

    public Double getLng() {
        return lng;
    }

    public Double getAlt() {
        return alt;
    }

    public Float getAcc() {
        return acc;
    }

    public Date getDate() {
        return date;
    }
}