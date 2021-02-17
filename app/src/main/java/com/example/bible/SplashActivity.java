package com.example.bible;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    SharedPreferences pref;
    String splash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        pref = getSharedPreferences("splash", MODE_PRIVATE);
        splash = pref.getString("value", "0");

        if(splash.equals("1")){
            startActivity(new Intent(getApplication(),MainActivity.class));
            finish();
        }else {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(new Intent(getApplication(),MainActivity.class));
                    finish();
                    pref = getSharedPreferences("splash", MODE_PRIVATE);
                    SharedPreferences.Editor editor = pref.edit();
                    editor.putString("value", "1");
                    editor.apply();
                }
            },3000);
        }
    }
}
