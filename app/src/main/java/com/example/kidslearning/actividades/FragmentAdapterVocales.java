package com.example.kidslearning.actividades;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.kidslearning.lecciones.VocalAFragment;
import com.example.kidslearning.lecciones.VocalEFragment;
import com.example.kidslearning.lecciones.VocalIFragment;
import com.example.kidslearning.lecciones.VocalOFragment;
import com.example.kidslearning.lecciones.VocalUFragment;

public class FragmentAdapterVocales extends FragmentAdapter {


    public FragmentAdapterVocales(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new VocalAFragment();
            case 1:
                return new VocalEFragment();
            case 2:
                return new VocalIFragment();
            case 3:
                return new VocalOFragment();
            case 4:
                return new VocalUFragment();

            default:
                return new VocalAFragment();
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
            title = "Vocal A";
        } else if (position == 1) {
            title = "Vocal E";
        } else if (position == 2) {
            title = "Vocal I";
        } else if (position == 3) {
            title = "Vocal O";
        } else if (position == 4) {
            title = "Vocal U";
        }
        return title;
    }
}
