package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowCompat;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        ImageView home = findViewById(R.id.home);

        RotateAnimation rotateAnimation = new RotateAnimation(0, 360, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(1100);
        home.startAnimation(rotateAnimation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), SecondActivity.class));
                SplashScreen.this.finish();
            }
        }, 1000);
    }
}