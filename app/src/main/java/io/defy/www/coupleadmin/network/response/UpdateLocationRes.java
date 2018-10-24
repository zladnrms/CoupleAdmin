package io.defy.www.coupleadmin.network.response;

import com.google.gson.annotations.SerializedName;

public class UpdateLocationRes {
    @SerializedName("result")
    String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}