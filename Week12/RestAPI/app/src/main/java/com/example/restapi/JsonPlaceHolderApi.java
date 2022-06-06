package com.example.restapi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface JsonPlaceHolderApi {
    @GET("api/users?page=2")
    Call<List<ListUserResponse>> getListUser();

    @GET("api/users/{id}")
    Call<List<User>> getUser(@Path("id") int id);
}
