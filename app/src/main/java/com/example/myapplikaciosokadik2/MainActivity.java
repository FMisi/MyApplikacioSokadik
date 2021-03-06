// JEGYZET KESZITO ALKALMAZAS
// FMisi
// 2022.05.08.
package com.example.myapplikaciosokadik2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.*;
import android.view.animation.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    private static final int SPLASH = 3300;

    Animation topAnim, bottomAnim; // a 2 animacio
    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.text);

        imageView.setAnimation(topAnim);
        textView.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run(){
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH);
    }
}