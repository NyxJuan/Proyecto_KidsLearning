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


public class Animal4Fragment extends Fragment {

    private ImageButton perrobtn;
    private MediaPlayer perroaudio;
    View vista;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_animal4, container, false);
        perrobtn = vista.findViewById(R.id.imageButtonAnimal4);
        //create mediaPlayer for all sounds
        perroaudio = MediaPlayer.create(getContext(),R.raw.perro);


        perrobtn.setOnClickListener(new View.OnClickListener() {
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
                perroaudio.stop();
            }
            else {
                // do what you like
            }
        }
    }


    private void evento() {
        perroaudio.start();
        Animation animation = AnimationUtils.loadAnimation(getContext(),R.anim.blink);
        perrobtn.startAnimation(animation);
    }
}