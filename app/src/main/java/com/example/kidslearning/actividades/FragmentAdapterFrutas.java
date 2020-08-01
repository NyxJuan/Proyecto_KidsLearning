package com.example.kidslearning.actividades;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.kidslearning.lecciones.Fruta1Fragment;
import com.example.kidslearning.lecciones.Fruta2Fragment;
import com.example.kidslearning.lecciones.Fruta3Fragment;
import com.example.kidslearning.lecciones.Fruta4ragment;
import com.example.kidslearning.lecciones.Fruta5Fragment;

public class FragmentAdapterFrutas extends FragmentAdapter {


    public FragmentAdapterFrutas(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Fruta1Fragment();
            case 1:
                return new Fruta2Fragment();
            case 2:
                return new Fruta3Fragment();
            case 3:
                return new Fruta4ragment();
            case 4:
                return new Fruta5Fragment();

            default:
                return new Fruta1Fragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0) {
            title = "Fruta 1";
        } else if (position == 1) {
            title = "Fruta 2";
        } else if (position == 2) {
            title = "Fruta 3";
        } else if (position == 3) {
            title = "Fruta 4";
        } else if (position == 4) {
            title = "Fruta 5";
        }
        return title;
    }
}
