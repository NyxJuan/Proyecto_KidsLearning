package com.example.kidslearning.cuentos;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kidslearning.R;


public class Cuento2Escena7Fragment extends Fragment {

    private MediaPlayer c2_7;
    View vista;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_cuento2_escena7, container, false);
        c2_7 = MediaPlayer.create(getContext(),R.raw.cuento2escena7);
        return vista;
    }

    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);

        if (c2_7 == null) {
            return;
        }
        if (isVisibleToUser) {
            try {
                c2_7.reset();
                c2_7.release();
                c2_7 = MediaPlayer.create(getContext(),R.raw.cuento2escena7);
                c2_7.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
            //c1_1.start();
        }
        else {
            c2_7.stop();
        }

    }

    @Override
    public void onPause() {
        super.onPause();
        c2_7.stop();
    }

}