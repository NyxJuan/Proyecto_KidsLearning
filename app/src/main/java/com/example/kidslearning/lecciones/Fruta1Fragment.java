package com.example.kidslearning.lecciones;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;

import com.example.kidslearning.R;


public class Fruta1Fragment extends Fragment {

    private ImageButton fresabtn;
    private MediaPlayer fresaaudio;
    View vista;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_fruta1, container, false);
        fresabtn = vista.findViewById(R.id.imageButtonFruta1);
        //create mediaPlayer for all sounds
        fresaaudio = MediaPlayer.create(getContext(),R.raw.fresa);


        fresabtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                evento();
            }
        });


        return vista;
    }
    private void evento() {
        fresaaudio.start();
    }
}