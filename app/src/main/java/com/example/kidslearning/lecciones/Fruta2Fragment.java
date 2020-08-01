package com.example.kidslearning.lecciones;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;

import com.example.kidslearning.R;

public class Fruta2Fragment extends Fragment {

    private ImageButton perabtn;
    private MediaPlayer peraaudio;
    View vista;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_fruta2, container, false);
        perabtn = vista.findViewById(R.id.imageButtonFruta2);
        //create mediaPlayer for all sounds
        peraaudio = MediaPlayer.create(getContext(),R.raw.pera);


        perabtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                evento();
            }
        });


        return vista;
    }
    private void evento() {
        peraaudio.start();
    }
}