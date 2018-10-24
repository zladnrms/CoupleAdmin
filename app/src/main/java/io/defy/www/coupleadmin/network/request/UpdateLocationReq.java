package io.defy.www.coupleadmin.network.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UpdateLocationReq {

    @SerializedName("id")
    @Expose
    private String id;

    public UpdateLocationReq(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

}