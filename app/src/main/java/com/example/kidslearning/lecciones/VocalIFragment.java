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


public class VocalIFragment extends Fragment {

    private ImageButton ibtn;
    private MediaPlayer iaudio;
    View vista;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_vocal_i, container, false);
        ibtn = vista.findViewById(R.id.imageButtonVocalI);
        //create mediaPlayer for all sounds
        iaudio = MediaPlayer.create(getContext(),R.raw.vocali);


        ibtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                evento();
            }
        });


        return vista;
    }

    private void evento() {
        iaudio.start();
        Animation animation = AnimationUtils.loadAnimation(getContext(),R.anim.blink);
        ibtn.startAnimation(animation);
    }
}