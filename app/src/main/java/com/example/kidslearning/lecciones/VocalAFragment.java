package com.example.kidslearning.lecciones;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;

import com.example.kidslearning.R;


public class VocalAFragment extends Fragment {

    private ImageButton abtn;
    private MediaPlayer aaudio;
    View vista;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_vocal_a, container, false);
        abtn = vista.findViewById(R.id.imageButtonVocalA);
        //create mediaPlayer for all sounds
        aaudio = MediaPlayer.create(getContext(),R.raw.vocala);


        abtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                evento();
            }
        });


        return vista;
    }
    private void evento() {
        aaudio.start();
    }
}