package com.example.kidslearning.cuentos;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kidslearning.R;


public class Cuento1Escena19Fragment extends Fragment {

    private MediaPlayer c1_19;
    View vista;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_cuento1_escena19, container, false);
        c1_19 = MediaPlayer.create(getContext(),R.raw.cuento1escena19);
        return vista;
    }
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);

        if (c1_19 == null) {
            return;
        }
        if (isVisibleToUser) {
            try {
                c1_19.reset();
                c1_19.release();
                c1_19 = MediaPlayer.create(getContext(),R.raw.cuento1escena19);
                c1_19.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
            //c1_1.start();
        }
        else {
            c1_19.stop();
        }

    }

    @Override
    public void onPause() {
        super.onPause();
        c1_19.stop();
    }
}