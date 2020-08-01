package com.example.kidslearning.lecciones;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;

import com.example.kidslearning.R;


public class Fruta5Fragment extends Fragment {


    private ImageButton sandiabtn;
    private MediaPlayer sandiaaudio;
    View vista;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_fruta5, container, false);
        sandiabtn = vista.findViewById(R.id.imageButtonFruta5);
        //create mediaPlayer for all sounds
        sandiaaudio = MediaPlayer.create(getContext(),R.raw.sandia);


        sandiabtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                evento();
            }
        });


        return vista;
    }
    private void evento() {
        sandiaaudio.start();
    }
}