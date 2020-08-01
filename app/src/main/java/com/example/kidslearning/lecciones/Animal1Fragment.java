package com.example.kidslearning.lecciones;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.kidslearning.R;


public class Animal1Fragment extends Fragment {


    private ImageButton leonbtn;
    private MediaPlayer leonaudio;
    View vista;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_animal1, container, false);
        leonbtn = vista.findViewById(R.id.imageButtonAnimal1);
        //create mediaPlayer for all sounds
        leonaudio = MediaPlayer.create(getContext(),R.raw.leon);


        leonbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                evento();
            }
        });


        return vista;

    }

    private void evento() {
        leonaudio.start();
    }


}