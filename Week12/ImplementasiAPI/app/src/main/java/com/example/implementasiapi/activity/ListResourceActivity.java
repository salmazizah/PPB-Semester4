package com.example.implementasiapi.activity;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.implementasiapi.R;
import com.example.implementasiapi.RecycleAdapter;
import com.example.implementasiapi.api.RestClient;
import com.example.implementasiapi.response.DataResource;
import com.example.implementasiapi.response.ListResourceResponse;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListResourceActivity extends AppCompatActivity {
    @BindView(R.id.rvListResource)
    RecyclerView rvListResource;

    private List<DataResource> listItem;
    private RecycleAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_resource);
        ButterKnife.bind(this);

        RestClient.getService().getResources().enqueue(new Callback<ListResourceResponse>() {
            @Override
            public void onResponse(Call<ListResourceResponse> call, Response<ListResourceResponse> response) {
                if(response.isSuccessful()) {
                    listItem = response.body().getData();

                    adapter = new RecycleAdapter(listItem, ListResourceActivity.this);
                    rvListResource.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                    rvListResource.setAdapter(adapter);
                }else {
                    Toast.makeText(ListResourceActivity.this, "failed", Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onFailure(Call<ListResourceResponse> call, Throwable t) {
                Toast.makeText(ListResourceActivity.this, "failure", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
