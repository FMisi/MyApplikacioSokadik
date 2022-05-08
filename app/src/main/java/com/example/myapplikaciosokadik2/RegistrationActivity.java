package com.example.myapplikaciosokadik2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.*;
import android.widget.*;
import androidx.appcompat.widget.Toolbar;

import com.google.android.gms.tasks.*;
import com.google.firebase.auth.*;

import java.util.Objects;

public class RegistrationActivity extends AppCompatActivity {

    private Toolbar toolbar;

    private EditText RegEmail, RegPwd;
    private Button RegBtn;
    private TextView RegQn;
    private FirebaseAuth mAuth;

    private ProgressDialog loader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_registration);

        toolbar = findViewById(R.id.RegistrationToolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Regisztráció");

        mAuth = FirebaseAuth.getInstance();
        loader = new ProgressDialog(this);

        RegEmail = findViewById(R.id.RegistrationEmail);
        RegPwd = findViewById(R.id.RegistrationPassword);
        RegBtn = findViewById(R.id.RegistrationButton);
        RegQn = findViewById(R.id.RegistrationPageQuestion);

        RegQn.setOnClickListener((v) -> {
            Intent intent = new Intent(RegistrationActivity.this, LoginActivity.class);
            startActivity(intent);
        });

        // Usin' lifecycle hook!:D
        RegBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = RegEmail.getText().toString().trim();
                String password = RegPwd.getText().toString().trim();

                if (TextUtils.isEmpty(email)){
                    RegEmail.setError("Email megadása szükséges!");
                    return;
                }
                if (TextUtils.isEmpty(password)){
                    RegPwd.setError("Jelszó megadása szükséges!");
                    return;
                } else{
                    loader.setMessage("Regisztráció folyamatban");
                    loader.setCanceledOnTouchOutside(false);
                    loader.show();
                    mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                Intent intent = new Intent(RegistrationActivity.this, HomeActivity.class);
                                startActivity(intent);
                                finish();
                                loader.dismiss();
                            } else{
                                String error = task.getException().toString();
                                Toast.makeText(RegistrationActivity.this, "" + error, Toast.LENGTH_LONG).show();
                                System.out.println("HIBA!: "+error);
                                loader.dismiss();
                            }
                        }
                    });
                }
            }
        });

    }
}