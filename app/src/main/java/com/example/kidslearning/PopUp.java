package com.example.kidslearning;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class PopUp extends AppCompatActivity {
    private ImageView PopUp;
    private JuegoIngles juegoIngles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up);

        PopUp = findViewById(R.id.PopUp_id);
        PopUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Runnable runnable = new Runnable() {
                    @Override
                    public void run() {
                        synchronized (this) {
                            try {
                                wait(300);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        Intent intent = new Intent(PopUp.this,JuegoIngles.class);
                        startActivity(intent);
                        finish();
                    }
                };
                runnable.run();

            }
        });




        DisplayMetrics medidaVentana = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(medidaVentana);

        int ancho = medidaVentana.widthPixels;
        int alto = medidaVentana.heightPixels;

        getWindow().setLayout((int)(ancho * 0.5),(int)(alto * 0.4));


    }

}
