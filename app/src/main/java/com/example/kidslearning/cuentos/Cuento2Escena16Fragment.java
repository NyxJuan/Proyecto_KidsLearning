package com.example.kidslearning.cuentos;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kidslearning.R;


public class Cuento2Escena16Fragment extends Fragment {

    private MediaPlayer c2_16;
    View vista;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_cuento2_escena16, container, false);
        c2_16 = MediaPlayer.create(getContext(),R.raw.cuento2escena16);
        return vista;
    }
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);

        if (c2_16 == null) {
            return;
        }
        if (isVisibleToUser) {
            try {
                c2_16.reset();
                c2_16.release();
                c2_16 = MediaPlayer.create(getContext(),R.raw.cuento2escena16);
                c2_16.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
            //c1_1.start();
        }
        else {
            c2_16.stop();
        }

    }

    @Override
    public void onPause() {
        super.onPause();
        c2_16.stop();
    }
}