package com.example.kidslearning.cuentos;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kidslearning.R;


public class Cuento1Escena4Fragment extends Fragment {

    private MediaPlayer c1_4;
    View vista;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_cuento1_escena4, container, false);
        c1_4 = MediaPlayer.create(getContext(),R.raw.cuento1escena4);
        return vista;
    }
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);

        if (c1_4 == null) {
            return;
        }
        if (isVisibleToUser) {
            try {
                c1_4.reset();
                c1_4.release();
                c1_4 = MediaPlayer.create(getContext(),R.raw.cuento1escena4);
                c1_4.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
            //c1_1.start();
        }
        else {
            c1_4.stop();
        }

    }

    @Override
    public void onPause() {
        super.onPause();
        c1_4.stop();
    }

}