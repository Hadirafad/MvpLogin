package com.example.mvologin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import presenter.LoginPresenter;
import presenter.LoginPresenterC;
import view.LoginView;

public class MainActivity extends AppCompatActivity implements LoginView {

    EditText etEmail,etPassword;
    Button btLogin;
    LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btLogin=findViewById(R.id.btn_login);
        etEmail=findViewById(R.id.email);
        etPassword=findViewById(R.id.password);

        loginPresenter =new LoginPresenterC(this) ;

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginPresenter.onLogin(etEmail.getText().toString(),etPassword.getText().toString());
            }
        });
}

    @Override
    public void onLoginResult(String message) {
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();

    }
}