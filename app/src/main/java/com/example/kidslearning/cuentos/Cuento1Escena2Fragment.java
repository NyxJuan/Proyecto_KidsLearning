package com.example.kidslearning.cuentos;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kidslearning.R;


public class Cuento1Escena2Fragment extends Fragment {
    private MediaPlayer c1_2;
    View vista;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_cuento1_escena2, container, false);
        c1_2 = MediaPlayer.create(getContext(),R.raw.cuento1escena2);


        return vista;
    }

    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);

        if (c1_2 == null) {
            return;
        }
        if (isVisibleToUser) {
            try {
                c1_2.reset();
                c1_2.release();
                c1_2 = MediaPlayer.create(getContext(),R.raw.cuento1escena2);
                c1_2.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
            //c1_1.start();
        }
        else {
            c1_2.stop();
        }

    }

    @Override
    public void onPause() {
        super.onPause();
        c1_2.stop();
    }




}