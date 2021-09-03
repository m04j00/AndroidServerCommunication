package com.m0_0m.server_ex.user_data;

import com.google.gson.annotations.SerializedName;

public class JoinResponse {
    @SerializedName("code")
    private int code;

    @SerializedName("message")
    private String message;


    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
