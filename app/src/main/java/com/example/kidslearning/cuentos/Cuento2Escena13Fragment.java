package com.example.kidslearning.cuentos;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kidslearning.R;


public class Cuento2Escena13Fragment extends Fragment {

    private MediaPlayer c2_13;
    View vista;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_cuento2_escena13, container, false);
        c2_13 = MediaPlayer.create(getContext(),R.raw.cuento2escena13);
        return vista;

    }
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);

        if (c2_13 == null) {
            return;
        }
        if (isVisibleToUser) {
            try {
                c2_13.reset();
                c2_13.release();
                c2_13 = MediaPlayer.create(getContext(),R.raw.cuento2escena13);
                c2_13.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
            //c1_1.start();
        }
        else {
            c2_13.stop();
        }

    }

    @Override
    public void onPause() {
        super.onPause();
        c2_13.stop();
    }
}