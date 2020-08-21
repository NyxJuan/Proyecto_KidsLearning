package com.example.kidslearning.actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;

import com.example.kidslearning.MainActivity;
import com.example.kidslearning.R;

public class SplashActivity extends AppCompatActivity {
    private MediaPlayer splashaudio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashaudio = MediaPlayer.create(getApplication(), R.raw.kidsbulla);

        //asignando duracion al splash
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent (SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        },5000);

        startaudio();


    }

    private void startaudio() {
    splashaudio.start();
    }
}