package com.example.kidslearning.lecciones;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;

import com.example.kidslearning.R;


public class VocalEFragment extends Fragment {

    private ImageButton ebtn;
    private MediaPlayer eaudio;
    View vista;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_vocal_e, container, false);
        ebtn = vista.findViewById(R.id.imageButtonVocalE);
        //create mediaPlayer for all sounds
        eaudio = MediaPlayer.create(getContext(),R.raw.vocale);


        ebtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                evento();
            }
        });


        return vista;
    }

    private void evento() {
        eaudio.start();
    }
}