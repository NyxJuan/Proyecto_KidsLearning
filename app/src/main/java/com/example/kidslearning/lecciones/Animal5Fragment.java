package com.example.kidslearning.lecciones;

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


public class Animal5Fragment extends Fragment {

    private ImageButton gatobtn;
    private MediaPlayer gatoaudio;
    View vista;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_animal5, container, false);
        gatobtn = vista.findViewById(R.id.imageButtonAnimal5);
        //create mediaPlayer for all sounds
        gatoaudio = MediaPlayer.create(getContext(),R.raw.gato);


        gatobtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                evento();
            }
        });


        return vista;
    }
    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        // Make sure that we are currently visible
        if (this.isVisible()) {
            // If we are becoming invisible, then...
            if (!isVisibleToUser) {
                gatoaudio.stop();
            }
            else {
                // do what you like
            }
        }
    }


    private void evento() {
        gatoaudio.start();
        Animation animation = AnimationUtils.loadAnimation(getContext(),R.anim.blink);
        gatobtn.startAnimation(animation);
    }
}