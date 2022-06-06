package com.example.implementasiapi.api;

import com.example.implementasiapi.body.BodyLogin;
import com.example.implementasiapi.response.ListResourceResponse;
import com.example.implementasiapi.response.ListUserResponse;
import com.example.implementasiapi.response.LoginResponse;
import com.example.implementasiapi.response.SingleUserResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface MainInterface {
    @POST("api/login")
    Call<LoginResponse> postLogin(@Body BodyLogin bodyLogin);

    @GET("api/users")
    Call<ListUserResponse> getList();

    @GET("api/users/{id}")
    Call<SingleUserResponse> getSingleUser(@Path("id") int id);

    @GET("api/users/23")
    Call<SingleUserResponse> getSingleUserNotFound();

    @GET("api/unknown")
    Call<ListResourceResponse> getResources();
}
