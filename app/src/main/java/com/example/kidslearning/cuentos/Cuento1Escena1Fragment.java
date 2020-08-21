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

public class Cuento1Escena1Fragment extends Fragment {

    private ImageButton cuent1btn;
    private MediaPlayer c1_1;
    View vista;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        vista = inflater.inflate(R.layout.fragment_cuento1_escena1, container, false);
        cuent1btn = vista.findViewById(R.id.imageButtonCuento1);
        c1_1 = MediaPlayer.create(getContext(),R.raw.cuento1escena1);
        cuent1btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                evento();
            }
        });

        return vista;

    }
   /* @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        // Make sure that we are currently visible
        if (this.isVisible()) {
            // If we are becoming invisible, then...
            if (!isVisibleToUser) {
                c1_1.stop();
            }
            else {

            }
        }
    }*/

    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);

        if (c1_1 == null) {
            return;
        }
        if (isVisibleToUser) {
            try {
                c1_1.reset();
                c1_1.release();
                c1_1 = MediaPlayer.create(getContext(),R.raw.cuento1escena1);
                c1_1.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
            //c1_1.start();
        }
        else {
            c1_1.stop();
        }

    }

    @Override
    public void onPause() {
        super.onPause();
        c1_1.stop();
    }


    private void evento() {
        c1_1.start();
        Animation animation = AnimationUtils.loadAnimation(getContext(),R.anim.blink);
        cuent1btn.startAnimation(animation);
    }
}