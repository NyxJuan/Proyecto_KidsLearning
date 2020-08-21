package com.example.kidslearning.cuentos;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kidslearning.R;


public class Cuento2Escena11Fragment extends Fragment {
    private MediaPlayer c2_11;
    View vista;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_cuento2_escena11, container, false);
        c2_11 = MediaPlayer.create(getContext(),R.raw.cuento2escena11);
        return vista;
    }
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);

        if (c2_11 == null) {
            return;
        }
        if (isVisibleToUser) {
            try {
                c2_11.reset();
                c2_11.release();
                c2_11 = MediaPlayer.create(getContext(),R.raw.cuento2escena11);
                c2_11.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
            //c1_1.start();
        }
        else {
            c2_11.stop();
        }

    }

    @Override
    public void onPause() {
        super.onPause();
        c2_11.stop();
    }
}