package com.example.kidslearning.cuentos;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kidslearning.R;


public class Cuento2Escena17Fragment extends Fragment {

    private MediaPlayer c2_17;
    View vista;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_cuento2_escena17, container, false);
        c2_17 = MediaPlayer.create(getContext(),R.raw.cuento2escena17);
        return vista;
    }
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);

        if (c2_17 == null) {
            return;
        }
        if (isVisibleToUser) {
            try {
                c2_17.reset();
                c2_17.release();
                c2_17 = MediaPlayer.create(getContext(),R.raw.cuento2escena17);
                c2_17.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
            //c1_1.start();
        }
        else {
            c2_17.stop();
        }

    }

    @Override
    public void onPause() {
        super.onPause();
        c2_17.stop();
    }
}