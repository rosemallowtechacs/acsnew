package com.rosemellow.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.rosemellow.alternatecreditscore.SplashActivity;
import com.rosemellow.alternatecreditscore.TermsandConditionsActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                startActivity(new Intent(MainActivity.this, TermsandConditionsActivity.class));
                finish();


            }
        }, 2000);
    }
}