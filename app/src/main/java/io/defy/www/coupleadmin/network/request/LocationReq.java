package io.defy.www.coupleadmin.network.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LocationReq {

    @SerializedName("id")
    @Expose
    private int id;

    public LocationReq(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

}