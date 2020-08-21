package com.example.kidslearning.cuentos;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kidslearning.R;


public class Cuento2Escena3Fragment extends Fragment {
    private MediaPlayer c2_3;
    View vista;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_cuento2_escena3, container, false);
        c2_3 = MediaPlayer.create(getContext(),R.raw.cuento2escena3);
        return vista;
    }
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);

        if (c2_3 == null) {
            return;
        }
        if (isVisibleToUser) {
            try {
                c2_3.reset();
                c2_3.release();
                c2_3 = MediaPlayer.create(getContext(),R.raw.cuento2escena3);
                c2_3.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
            //c1_1.start();
        }
        else {
            c2_3.stop();
        }

    }

    @Override
    public void onPause() {
        super.onPause();
        c2_3.stop();
    }
}