package com.m0_0m.server_ex.network;

import com.m0_0m.server_ex.user_data.JoinData;
import com.m0_0m.server_ex.user_data.JoinResponse;
import com.m0_0m.server_ex.user_data.LoginData;
import com.m0_0m.server_ex.user_data.LoginResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ServiceApi {
    @POST("user/login")
    Call<LoginResponse> userLogin(@Body LoginData data);

    @POST("/user/join")
    Call<JoinResponse> userJoin(@Body JoinData data);
}
