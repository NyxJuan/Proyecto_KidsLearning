package com.example.kidslearning.lecciones;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.kidslearning.R;


public class Animal2Fragment extends Fragment {

    private ImageButton elefantebtn;
    private MediaPlayer elefanteaudio;
    View vista;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_animal2, container, false);
        elefantebtn = vista.findViewById(R.id.imageButtonAnimal2);
        //create mediaPlayer for all sounds
        elefanteaudio = MediaPlayer.create(getContext(),R.raw.elefante);


        elefantebtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                evento();
            }
        });


        return vista;
    }
    private void evento() {
        elefanteaudio.start();
    }
}