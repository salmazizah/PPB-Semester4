package com.example.implementasiapi.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.implementasiapi.R;
import com.example.implementasiapi.RecyclerAdapter;
import com.example.implementasiapi.api.RestClient;
import com.example.implementasiapi.response.DataItem;
import com.example.implementasiapi.response.ListUserResponse;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListUserActivity extends AppCompatActivity {
    @BindView(R.id.rvListUser)
    RecyclerView rvListUser;

    private List<DataItem> listItem;
    private RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_user);
        ButterKnife.bind(this);

        RestClient.getService().getList().enqueue(new Callback<ListUserResponse>() {
            @Override
            public void onResponse(Call<ListUserResponse> call, Response<ListUserResponse> response) {
                if (response.isSuccessful()){
                    listItem = response.body().getData();

                    adapter = new RecyclerAdapter(listItem, ListUserActivity.this);
                    rvListUser.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                    rvListUser.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<ListUserResponse> call, Throwable t) {

            }
        });
    }
}
