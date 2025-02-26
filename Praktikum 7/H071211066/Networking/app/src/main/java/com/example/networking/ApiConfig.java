package com.example.networking;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiConfig {
    public static ApiService getApiService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://reqres.in/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(ApiService.class);
    }
//    public static ApiService2 getApiService2() {
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("https://reqres.in/")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//        return retrofit.create(ApiService2.class);
//    }
}
