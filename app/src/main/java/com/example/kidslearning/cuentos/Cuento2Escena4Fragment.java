package com.example.kidslearning.cuentos;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kidslearning.R;


public class Cuento2Escena4Fragment extends Fragment {

    private MediaPlayer c2_4;
    View vista;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vista = inflater.inflate(R.layout.fragment_cuento2_escena4, container, false);
        c2_4 = MediaPlayer.create(getContext(),R.raw.cuento2escena4);
        return vista;
    }
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);

        if (c2_4 == null) {
            return;
        }
        if (isVisibleToUser) {
            try {
                c2_4.reset();
                c2_4.release();
                c2_4 = MediaPlayer.create(getContext(),R.raw.cuento2escena4);
                c2_4.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
            //c1_1.start();
        }
        else {
            c2_4.stop();
        }

    }

    @Override
    public void onPause() {
        super.onPause();
        c2_4.stop();
    }
}