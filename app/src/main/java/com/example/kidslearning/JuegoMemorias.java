package com.example.kidslearning;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class JuegoMemorias  extends AppCompatActivity {

    Button play, salir ;


    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.juegomemorias);


        play = findViewById(R.id.botonMainJugar);
        salir = findViewById(R.id.botonMainSalir);


        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("INICIANDO JUEGO...");
                iniciarJuego();
            }
        });

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }


    private void iniciarJuego(){
        Intent i = new Intent(this, JuegoFrutas.class);
        startActivity(i);
    }


}
