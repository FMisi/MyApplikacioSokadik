package com.example.myapplikaciosokadik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.*;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import androidx.appcompat.widget.Toolbar;

public class LoginActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private EditText loginEmail, loginPwd;
    private Button loginBtn;
    private TextView loginQn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);

        toolbar = findViewById(R.id.loginToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Bejelentkezés");

        loginEmail = findViewById(R.id.loginEmail);
        loginPwd = findViewById(R.id.loginPassword);
        loginBtn = findViewById(R.id.loginButton);
        loginQn = findViewById(R.id.loginPageQuestion);

        loginQn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(LoginActivity.this, RegistrationActivity.class);
                startActivity(intent);
            }
        });
    }
}