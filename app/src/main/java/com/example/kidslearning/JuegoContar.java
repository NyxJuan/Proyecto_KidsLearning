package com.example.kidslearning;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class JuegoContar extends AppCompatActivity implements View.OnClickListener{

    private ImageButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;
    private MediaPlayer sound1,sound2,sound3,sound4,sound5,sound6,sound7,sound8,sound9,sound10;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.juegocontar);

        // find button
        btn1 = findViewById(R.id.imageButton1);
        btn2 = findViewById(R.id.imageButton2);
        btn3 = findViewById(R.id.imageButton3);
        btn4 = findViewById(R.id.imageButton4);
        btn5 = findViewById(R.id.imageButton5);
        btn6 = findViewById(R.id.imageButton6);
        btn7 = findViewById(R.id.imageButton7);
        btn8 = findViewById(R.id.imageButton8);
        btn9 = findViewById(R.id.imageButton9);
        btn10 = findViewById(R.id.imageButton10);
        //create mediaPlayer for all sounds
        sound1 = MediaPlayer.create(this,R.raw.uno);
        sound2 = MediaPlayer.create(this,R.raw.dos);
        sound3 = MediaPlayer.create(this,R.raw.tres);
        sound4 = MediaPlayer.create(this,R.raw.cuatro);
        sound5 = MediaPlayer.create(this,R.raw.cinco);
        sound6 = MediaPlayer.create(this,R.raw.seis);
        sound7 = MediaPlayer.create(this,R.raw.siete);
        sound8 = MediaPlayer.create(this,R.raw.ocho);
        sound9 = MediaPlayer.create(this,R.raw.nueve);
        sound10 = MediaPlayer.create(this,R.raw.diez);
        // set onclick Listener to all button
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);



    }
    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.imageButton1 ){
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.blink);
            btn1.startAnimation(animation);
            if (sound1 != null){
                sound1.start();
            }
        }

        if (view.getId() == R.id.imageButton2 ){
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.blink);
            btn2.startAnimation(animation);
            if (sound2 != null){
                sound2.start();
            }
        }



        if (view.getId() == R.id.imageButton3 ){
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.blink);
            btn3.startAnimation(animation);
            if (sound3 != null){
                sound3.start();
            }
        }

        if (view.getId() == R.id.imageButton4 ){
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.blink);
            btn4.startAnimation(animation);
            if (sound4 != null){
                sound4.start();
            }
        }



        if (view.getId() == R.id.imageButton5 ){
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.blink);
            btn5.startAnimation(animation);
            if (sound5 != null){
                sound5.start();
            }
        }

        if (view.getId() == R.id.imageButton6 ){
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.blink);
            btn6.startAnimation(animation);
            if (sound6 != null){
                sound6.start();
            }
        }

        if (view.getId() == R.id.imageButton7 ){
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.blink);
            btn7.startAnimation(animation);
            if (sound7 != null){
                sound7.start();
            }
        }

        if (view.getId() == R.id.imageButton8 ){
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.blink);
            btn8.startAnimation(animation);
            if (sound8 != null){
                sound8.start();
            }
        }

        if (view.getId() == R.id.imageButton9 ){
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.blink);
            btn9.startAnimation(animation);
            if (sound9 != null){
                sound9.start();
            }
        }

        if (view.getId() == R.id.imageButton10 ){
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.blink);
            btn10.startAnimation(animation);
            if (sound10 != null){
                sound10.start();
            }
        }

    }

}
