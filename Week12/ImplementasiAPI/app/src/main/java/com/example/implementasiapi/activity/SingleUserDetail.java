package com.example.implementasiapi.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.implementasiapi.R;
import com.example.implementasiapi.RecyclerAdapter;
import com.example.implementasiapi.api.RestClient;
import com.example.implementasiapi.response.SingleUserResponse;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SingleUserDetail extends AppCompatActivity {
    @BindView(R.id.userImage)
    ImageView uAvatar;
    @BindView(R.id.userName)
    TextView uName;
    @BindView(R.id.userEmail)
    TextView uEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.single_user_details);
        ButterKnife.bind(this);

        Intent intent = getIntent();
        String message = intent.getStringExtra(RecyclerAdapter.EXTRA_MESSAGE);
        int idUser = Integer.parseInt(message);

        RestClient.getService().getSingleUser(idUser).enqueue(new Callback<SingleUserResponse>() {
            @Override
            public void onResponse(Call<SingleUserResponse> call, Response<SingleUserResponse> response) {
                if(response.isSuccessful()) {
                    Glide.with(SingleUserDetail.this)
                            .load(response.body().getData().getAvatar())
                            .into(uAvatar);

                    String firstName = response.body().getData().getFirstName();
                    String lastName = response.body().getData().getLastName();
                    String email = response.body().getData().getEmail();
                    uName.setText(firstName + " " + lastName);
                    uEmail.setText(email);
                }else {
                    Toast.makeText(SingleUserDetail.this, "failed", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<SingleUserResponse> call, Throwable t) {
                Toast.makeText(SingleUserDetail.this, "failure", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
