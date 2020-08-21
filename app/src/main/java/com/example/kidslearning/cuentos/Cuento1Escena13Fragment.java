package com.example.kidslearning.cuentos;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kidslearning.R;


public class Cuento1Escena13Fragment extends Fragment {

    private MediaPlayer c1_13;
    View vista;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_cuento1_escena13, container, false);
        c1_13 = MediaPlayer.create(getContext(),R.raw.cuento1escena13);
        return vista;
    }
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);

        if (c1_13 == null) {
            return;
        }
        if (isVisibleToUser) {
            try {
                c1_13.reset();
                c1_13.release();
                c1_13 = MediaPlayer.create(getContext(),R.raw.cuento1escena13);
                c1_13.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
            //c1_1.start();
        }
        else {
            c1_13.stop();
        }

    }

    @Override
    public void onPause() {
        super.onPause();
        c1_13.stop();
    }
}