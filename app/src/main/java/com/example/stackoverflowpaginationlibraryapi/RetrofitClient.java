package com.example.stackoverflowpaginationlibraryapi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static final String BASE_URL="https://api.stackexchange.com/2.2/";
    private Retrofit retrofit;
    private static RetrofitClient retrofitClient;
    public RetrofitClient(){
        if(retrofit== null){
            retrofit= new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
    }

    public static synchronized RetrofitClient getInstance(){
        if(retrofitClient== null){
            retrofitClient= new RetrofitClient();
        }
        return retrofitClient;
    }

    public Api getApi() {
        return retrofit.create(Api.class);
    }
}