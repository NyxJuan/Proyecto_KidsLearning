package com.example.kidslearning.lecciones;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;

import com.example.kidslearning.R;


public class Fruta3Fragment extends Fragment {

    private ImageButton pinhabtn;
    private MediaPlayer pinhaaudio;
    View vista;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_fruta3, container, false);
        pinhabtn = vista.findViewById(R.id.imageButtonFruta3);
        //create mediaPlayer for all sounds
        pinhaaudio = MediaPlayer.create(getContext(),R.raw.pinha);


        pinhabtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                evento();
            }
        });


        return vista;
    }
    private void evento() {
        pinhaaudio.start();
        Animation animation = AnimationUtils.loadAnimation(getContext(),R.anim.blink);
        pinhabtn.startAnimation(animation);
    }
}