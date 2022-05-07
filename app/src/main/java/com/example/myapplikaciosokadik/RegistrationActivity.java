package com.example.myapplikaciosokadik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.*;
import android.widget.*;
import androidx.appcompat.widget.Toolbar;

public class RegistrationActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private EditText RegEmail, RegPwd;
    private Button RegBtn;
    private TextView RegQn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_registration);

        toolbar = findViewById(R.id.RegistrationToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Regisztráció");

        RegEmail = findViewById(R.id.RegistrationEmail);
        RegPwd = findViewById(R.id.RegistrationPassword);
        RegBtn = findViewById(R.id.RegistrationButton);
        RegQn = findViewById(R.id.RegistrationPageQuestion);

        RegQn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(RegistrationActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });



    }
}