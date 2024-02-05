package com.example.stackoverflowpaginationlibraryapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.stackoverflowpaginationlibraryapi.models.ApiStackOverFlowResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private int page=1;
    private int size=50;
    private String site_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Call<ApiStackOverFlowResponse> call= RetrofitClient.getInstance()
                .getApi().getImages(page,size,site_name);
        call.enqueue(new Callback<ApiStackOverFlowResponse>() {
            @Override
            public void onResponse(Call<ApiStackOverFlowResponse> call, Response<ApiStackOverFlowResponse> response) {
                ApiStackOverFlowResponse stackOverFlowResponse= response.body();
                Toast.makeText(MainActivity.this, " "+stackOverFlowResponse +"  .", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<ApiStackOverFlowResponse> call, Throwable t) {
                Toast.makeText(MainActivity.this, " "+t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}