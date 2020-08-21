package com.example.kidslearning.actividades;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.kidslearning.cuentos.Cuento2Escena10Fragment;
import com.example.kidslearning.cuentos.Cuento2Escena11Fragment;
import com.example.kidslearning.cuentos.Cuento2Escena12Fragment;
import com.example.kidslearning.cuentos.Cuento2Escena13Fragment;
import com.example.kidslearning.cuentos.Cuento2Escena14Fragment;
import com.example.kidslearning.cuentos.Cuento2Escena15Fragment;
import com.example.kidslearning.cuentos.Cuento2Escena16Fragment;
import com.example.kidslearning.cuentos.Cuento2Escena17Fragment;
import com.example.kidslearning.cuentos.Cuento2Escena18Fragment;
import com.example.kidslearning.cuentos.Cuento2Escena19Fragment;
import com.example.kidslearning.cuentos.Cuento2Escena1Fragment;
import com.example.kidslearning.cuentos.Cuento2Escena20Fragment;
import com.example.kidslearning.cuentos.Cuento2Escena2Fragment;
import com.example.kidslearning.cuentos.Cuento2Escena3Fragment;
import com.example.kidslearning.cuentos.Cuento2Escena4Fragment;
import com.example.kidslearning.cuentos.Cuento2Escena5Fragment;
import com.example.kidslearning.cuentos.Cuento2Escena6Fragment;
import com.example.kidslearning.cuentos.Cuento2Escena7Fragment;
import com.example.kidslearning.cuentos.Cuento2Escena8Fragment;
import com.example.kidslearning.cuentos.Cuento2Escena9Fragment;

public class FragmentAdapterCuentos2 extends FragmentAdapter {

    public FragmentAdapterCuentos2(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Cuento2Escena1Fragment();
            case 1:
                return new Cuento2Escena2Fragment();
            case 2:
                return new Cuento2Escena3Fragment();
            case 3:
                return new Cuento2Escena4Fragment();
            case 4:
                return new Cuento2Escena5Fragment();
            case 5:
                return new Cuento2Escena6Fragment();
            case 6:
                return new Cuento2Escena7Fragment();
            case 7:
                return new Cuento2Escena8Fragment();
            case 8:
                return new Cuento2Escena9Fragment();
            case 9:
                return new Cuento2Escena10Fragment();
            case 10:
                return new Cuento2Escena11Fragment();
            case 11:
                return new Cuento2Escena12Fragment();
            case 12:
                return new Cuento2Escena13Fragment();
            case 13:
                return new Cuento2Escena14Fragment();
            case 14:
                return new Cuento2Escena15Fragment();
            case 15:
                return new Cuento2Escena16Fragment();
            case 16:
                return new Cuento2Escena17Fragment();
            case 17:
                return new Cuento2Escena18Fragment();
            case 18:
                return new Cuento2Escena19Fragment();
            case 19:
                return new Cuento2Escena20Fragment();

            default:
                return new Cuento2Escena1Fragment();
        }
    }

    @Override
    public int getCount() {
        return 20;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0) {
            title = "Escena 1";
        } else if (position == 1) {
            title = "Escena 2";
        } else if (position == 2) {
            title = "Escena 3";
        } else if (position == 3) {
            title = "Escena 4";
        } else if (position == 4) {
            title = "Escena 5";
        } else if (position == 5) {
            title = "Escena 6";
        } else if (position == 6) {
            title = "Escena 7";
        } else if (position == 7) {
            title = "Escena 8";
        } else if (position == 8) {
            title = "Escena 9";
        } else if (position == 9) {
            title = "Escena 10";
        } else if (position == 10) {
            title = "Escena 11";
        } else if (position == 11) {
            title = "Escena 12";
        } else if (position == 12) {
            title = "Escena 13";
        } else if (position == 13) {
            title = "Escena 14";
        } else if (position == 14) {
            title = "Escena 15";
        } else if (position == 15) {
            title = "Escena 16";
        } else if (position == 16) {
            title = "Escena 17";
        } else if (position == 17) {
            title = "Escena 18";
        } else if (position == 18) {
            title = "Escena 19";
        } else if (position == 19) {
            title = "Escena 20";
        }
        return title;
    }
}
