package com.example.kidslearning;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class JuegoIngles extends AppCompatActivity implements View.OnClickListener {

    private ImageButton repetir_btn,btn1,btn2,btn3;
    private MediaPlayer mp1, mp2, mp3, mp4,mp5,mp6,mp7,mp8,mp9,mp10,mpNo,mpWin;
    private int state;

    //para guardar la actividad
    String currentActivity;


    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.juegoingles);

        //para guardar la actividad
        currentActivity = this.getClass().getName();

        //Enlazar los botones
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        repetir_btn = findViewById(R.id.btnrepetir);

        // adding onClick Listener
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        repetir_btn.setOnClickListener(this);

        //numeros aleatorios
        Random_number_generator();
        Puzzle_create();

    }
    public void Random_number_generator(){
        Random random = new Random();
        state = random.nextInt(10)+1;
    }
    public void Puzzle_create(){
        if (state == 1){
            btn1.setImageResource(R.drawable.number_1);
            mp1 = MediaPlayer.create(this,R.raw.uno);
            mp1.start();
        }
        if (state == 2){
            btn2.setImageResource(R.drawable.number_2);
            mp2 = MediaPlayer.create(this,R.raw.dos);
            mp2.start();
        }
        if (state == 3){
            btn3.setImageResource(R.drawable.number_3);
            mp3 = MediaPlayer.create(this,R.raw.tres);
            mp3.start();
        }
        if (state == 4){
            btn1.setImageResource(R.drawable.number_4);
            mp4 = MediaPlayer.create(this,R.raw.cuatro);
            mp4.start();
        }
        if (state == 5){
            btn2.setImageResource(R.drawable.number_5);
            mp5 = MediaPlayer.create(this,R.raw.cinco);
            mp5.start();
        }
        if (state == 6){
            btn3.setImageResource(R.drawable.number_6);
            mp6 = MediaPlayer.create(this,R.raw.seis);
            mp6.start();
        }
        if (state == 7){
            btn1.setImageResource(R.drawable.number_7);
            mp7 = MediaPlayer.create(this,R.raw.siete);
            mp7.start();
        }
        if (state == 8){
            btn2.setImageResource(R.drawable.number_8);
            mp8 = MediaPlayer.create(this,R.raw.ocho);
            mp8.start();
        }
        if (state == 9){
            btn3.setImageResource(R.drawable.number_9);
            mp9 = MediaPlayer.create(this,R.raw.nueve);
            mp9.start();
        }
        if (state == 10){
            btn1.setImageResource(R.drawable.number_10);
            mp10 = MediaPlayer.create(this,R.raw.diez);
            mp10.start();
        }
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn1:
                Animation animation = AnimationUtils.loadAnimation(this, R.anim.move);
                btn1.startAnimation(animation);

                if (state == 1){
                    mpWin = MediaPlayer.create(this,R.raw.winner);
                    mpWin.start();

                    startActivity(new Intent(JuegoIngles.this, PopUp.class).putExtra("from" , currentActivity));

                    //startActivity(new Intent(JuegoIngles.this, PopUp.class));
                }
                else if (state == 4){
                    mpWin = MediaPlayer.create(this,R.raw.winner);
                    mpWin.start();
                    startActivity(new Intent(JuegoIngles.this, PopUp.class).putExtra("from" , currentActivity));
                    //startActivity(new Intent(JuegoIngles.this, PopUp.class));
                }
                else if (state == 7){
                    mpWin = MediaPlayer.create(this,R.raw.winner);
                    mpWin.start();
                    startActivity(new Intent(JuegoIngles.this, PopUp.class).putExtra("from" , currentActivity));
                    //startActivity(new Intent(JuegoIngles.this, PopUp.class));
                }
                else if (state == 10){
                    mpWin = MediaPlayer.create(this,R.raw.winner);
                    mpWin.start();
                    startActivity(new Intent(JuegoIngles.this, PopUp.class).putExtra("from" , currentActivity));
                    //startActivity(new Intent(JuegoIngles.this, PopUp.class));
                }
                else {
                    mpNo = MediaPlayer.create(this,R.raw.no);
                    mpNo.start();
                    Toast.makeText(getApplicationContext(), "NO", Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.btn2:

                Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.move);
                btn2.startAnimation(animation1);

                if (state == 2){
                    mpWin = MediaPlayer.create(this,R.raw.winner);
                    mpWin.start();

                    startActivity(new Intent(JuegoIngles.this, PopUp.class).putExtra("from" , currentActivity));
                    //startActivity(new Intent(JuegoIngles.this, PopUp.class));
                }
                else if (state == 5){
                    mpWin = MediaPlayer.create(this,R.raw.winner);
                    mpWin.start();

                    startActivity(new Intent(JuegoIngles.this, PopUp.class).putExtra("from" , currentActivity));
                    //startActivity(new Intent(JuegoIngles.this, PopUp.class));
                }
                else if (state == 8) {
                    mpWin = MediaPlayer.create(this, R.raw.winner);
                    mpWin.start();

                    startActivity(new Intent(JuegoIngles.this, PopUp.class).putExtra("from" , currentActivity));
                    //startActivity(new Intent(JuegoIngles.this, PopUp.class));
                }
                else {
                    mp4 = MediaPlayer.create(this,R.raw.no);
                    mp4.start();
                    Toast.makeText(getApplicationContext(), "NO", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btn3:

                Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.move);
                btn3.startAnimation(animation2);

                if (state == 3) {
                    mpWin = MediaPlayer.create(this, R.raw.winner);
                    mpWin.start();

                    startActivity(new Intent(JuegoIngles.this, PopUp.class).putExtra("from" , currentActivity));
                    //startActivity(new Intent(JuegoIngles.this, PopUp.class));
                }
                else if (state == 6) {
                    mpWin = MediaPlayer.create(this, R.raw.winner);
                    mpWin.start();

                    startActivity(new Intent(JuegoIngles.this, PopUp.class).putExtra("from" , currentActivity));
                    //startActivity(new Intent(JuegoIngles.this, PopUp.class));
                }
                else if (state == 9) {
                    mpWin = MediaPlayer.create(this, R.raw.winner);
                    mpWin.start();

                    startActivity(new Intent(JuegoIngles.this, PopUp.class).putExtra("from" , currentActivity));
                    //startActivity(new Intent(JuegoIngles.this, PopUp.class));
                }
                else {
                    mp4 = MediaPlayer.create(this, R.raw.no);
                    mp4.start();
                    Toast.makeText(getApplicationContext(), "NO", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.btnrepetir:
                Animation animation3 = AnimationUtils.loadAnimation(this, R.anim.blink);
                repetir_btn.startAnimation(animation3);
                Puzzle_create();
                break;


        }

    }
}
