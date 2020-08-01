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


public class VocalOFragment extends Fragment {

    private ImageButton obtn;
    private MediaPlayer oaudio;
    View vista;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_vocal_o, container, false);
        obtn = vista.findViewById(R.id.imageButtonVocalO);
        //create mediaPlayer for all sounds
        oaudio = MediaPlayer.create(getContext(),R.raw.vocalo);


        obtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                evento();
            }
        });


        return vista;
    }
    private void evento() {
        oaudio.start();
        Animation animation = AnimationUtils.loadAnimation(getContext(),R.anim.blink);
        obtn.startAnimation(animation);
    }
}