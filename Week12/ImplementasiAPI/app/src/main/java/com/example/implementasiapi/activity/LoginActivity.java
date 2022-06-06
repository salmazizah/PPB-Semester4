package com.example.implementasiapi.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.implementasiapi.MainActivity;
import com.example.implementasiapi.R;
import com.example.implementasiapi.api.RestClient;
import com.example.implementasiapi.body.BodyLogin;
import com.example.implementasiapi.response.LoginResponse;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {
    @BindView(R.id.tvUsername)
    EditText editEmail;
    @BindView(R.id.edtPassword)
    EditText editPassword;
    @BindView(R.id.btnLogin)
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savdInstaceState) {
        super.onCreate(savdInstaceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnLogin)
    public void onViewClicked() {
        BodyLogin bodyLogin =  new BodyLogin();
        bodyLogin.setEmail(editEmail.getText().toString());
        bodyLogin.setPassword(editPassword.getText().toString());

        RestClient.getService().postLogin(bodyLogin).enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                if(response.isSuccessful()) {
                    Toast.makeText(LoginActivity.this, response.body().getToken(), Toast.LENGTH_SHORT).show();
                    Log.i("Response", response.message());
                    startActivity(new Intent(getApplicationContext(), ListUserActivity.class));
                    finish();
                }else {
                    Toast.makeText(LoginActivity.this, "Login Failed!", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                Toast.makeText(LoginActivity.this, "Login Failed!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
