package com.example.stackoverflowpaginationlibraryapi;

import com.example.stackoverflowpaginationlibraryapi.models.ApiStackOverFlowResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {

    @GET("answers")
    Call<ApiStackOverFlowResponse> getImages(
            @Query("page") int page,
            @Query("pagesize") int p_size,
            @Query("site") String site
    );
}
