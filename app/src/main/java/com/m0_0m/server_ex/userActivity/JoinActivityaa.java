package com.m0_0m.server_ex.userActivity;

import android.widget.Toast;

import com.m0_0m.server_ex.network.RetrofitClient;
import com.m0_0m.server_ex.network.ServiceApi;
import com.m0_0m.server_ex.user_data.JoinData;
import com.m0_0m.server_ex.user_data.JoinResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class JoinActivityaa {
    ServiceApi service = RetrofitClient.getClient().create(ServiceApi.class);

}
