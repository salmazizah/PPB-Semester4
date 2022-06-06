package com.example.restapi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.telephony.TelephonyCallback;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.List;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private JsonPlaceHolderApi jsonPlaceHolderApi;
    private TextView textViewResult;
    private RecyclerView recyclerView;
    private ListUserAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewResult = findViewById(R.id.text_view_result);
        //recyclerView = findViewById(R.id.recyclerView);

        Gson gson = new GsonBuilder().serializeNulls().create();

        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(new Interceptor() {
                    @NonNull
                    @Override
                    public okhttp3.Response intercept(@NonNull Chain chain) throws IOException {
                        Request originalRequest = chain.request();
                        Request newRequest = originalRequest.newBuilder()
                                .header("Iterceptor-Header", "xyz")
                                .build();

                        return chain.proceed(newRequest);
                    }
                })
                .addInterceptor(loggingInterceptor)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://reqres.in/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();

        jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);

        //getUsers();
        getUser();
    }

    public void getUsers() {
        Call<List<ListUserResponse>> call = jsonPlaceHolderApi.getListUser();
        // adapter = new ListUserAdapter(this, call);

        call.enqueue(new Callback<List<ListUserResponse>>() {
            @Override
            public void onResponse(Call<List<ListUserResponse>> call, Response<List<ListUserResponse>> response) {
                if (!response.isSuccessful()) {
                    textViewResult.setText("Code: " + response.code());
                    return;
                }
                
                List<ListUserResponse> listUsers = response.body();

                for (ListUserResponse list : listUsers) {
                    String content = "";
                    content += "Page; " + list.getPage() + "\n";
                    content += "Per Page: " + list.getPer_page() + "\n";
                    content += "Total: " + list.getTotal() + "\n";
                    content += "Total Page: " + list.getTotal_page() + "\n";
                    content += "Data: " + list.getData() + "\n\n";

                    textViewResult.append(content);
                }
            }

            @Override
            public void onFailure(Call<List<ListUserResponse>> call, Throwable t) {
                textViewResult.setText(t.getMessage());
            }
        });
    }

    public void getUser() {
        Call<List<User>> call = jsonPlaceHolderApi.getUser(23);

        call.enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                if (!response.isSuccessful()) {
                    textViewResult.setText("Code: " + response.code());
                    return;
                }

                List<User> user = response.body();

                for(User users : user) {
                    String content = "";
                    content += "ID; " + users.getId() + "\n";
                    content += "Email: " + users.getEmail() + "\n";
                    content += "Name: "  + users.getFirst_name() + users.getLast_name() + "\n";
                    content += "Text: " + users.getAvatar() + "\n\n";

                    textViewResult.append(content);
                }
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {
                textViewResult.setText(t.getMessage());
            }
        });
    }

}