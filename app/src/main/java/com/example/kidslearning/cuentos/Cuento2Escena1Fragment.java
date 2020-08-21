package com.example.kidslearning.cuentos;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

import com.example.kidslearning.R;


public class Cuento2Escena1Fragment extends Fragment {

    private ImageButton cuent2btn;
    private MediaPlayer c2_1;
    View vista;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_cuento2_escena1, container, false);
        cuent2btn = vista.findViewById(R.id.imageButtonCuento2);
        c2_1 = MediaPlayer.create(getContext(),R.raw.cuento2escena1);
        cuent2btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                evento();
            }
        });

        return vista;
    }
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);

        if (c2_1 == null) {
            return;
        }
        if (isVisibleToUser) {
            try {
                c2_1.reset();
                c2_1.release();
                c2_1 = MediaPlayer.create(getContext(),R.raw.cuento2escena1);
                c2_1.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
            //c1_1.start();
        }
        else {
            c2_1.stop();
        }

    }

    @Override
    public void onPause() {
        super.onPause();
        c2_1.stop();
    }


    private void evento() {
        c2_1.start();
        Animation animation = AnimationUtils.loadAnimation(getContext(),R.anim.blink);
        cuent2btn.startAnimation(animation);
    }
}