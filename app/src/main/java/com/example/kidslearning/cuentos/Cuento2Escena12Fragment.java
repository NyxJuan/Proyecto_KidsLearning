package com.example.kidslearning.cuentos;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kidslearning.R;


public class Cuento2Escena12Fragment extends Fragment {
    private MediaPlayer c2_12;
    View vista;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_cuento2_escena12, container, false);
        c2_12 = MediaPlayer.create(getContext(),R.raw.cuento2escena12);
        return vista;
    }
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);

        if (c2_12 == null) {
            return;
        }
        if (isVisibleToUser) {
            try {
                c2_12.reset();
                c2_12.release();
                c2_12 = MediaPlayer.create(getContext(),R.raw.cuento2escena12);
                c2_12.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
            //c1_1.start();
        }
        else {
            c2_12.stop();
        }

    }

    @Override
    public void onPause() {
        super.onPause();
        c2_12.stop();
    }
}