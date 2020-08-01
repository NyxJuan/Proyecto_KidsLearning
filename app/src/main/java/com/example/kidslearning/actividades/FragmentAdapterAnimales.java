package com.example.kidslearning.actividades;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.kidslearning.juegos.Ayuda1Fragment;
import com.example.kidslearning.juegos.Ayuda2Fragment;
import com.example.kidslearning.juegos.Ayuda3Fragment;
import com.example.kidslearning.juegos.Ayuda4Fragment;
import com.example.kidslearning.juegos.Ayuda5Fragment;
import com.example.kidslearning.lecciones.Animal1Fragment;
import com.example.kidslearning.lecciones.Animal2Fragment;
import com.example.kidslearning.lecciones.Animal3Fragment;
import com.example.kidslearning.lecciones.Animal4Fragment;
import com.example.kidslearning.lecciones.Animal5Fragment;

public class FragmentAdapterAnimales extends FragmentAdapter{


    public FragmentAdapterAnimales(@NonNull FragmentManager fm) {
        super(fm);
    }

    //Ctrl + O para crear el Fragment getItem
    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new Animal1Fragment();
            case 1:
                return new Animal2Fragment();
            case 2:
                return new Animal3Fragment();
            case 3:
                return new Animal4Fragment();
            case 4:
                return new Animal5Fragment();

            default:
                return new Animal1Fragment();
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
            title = "Animal 1";
        } else if (position == 1) {
            title = "Animal 1";
        } else if (position == 2) {
            title = "Animal 1";
        } else if (position == 3) {
            title = "Animal 1";
        } else if (position == 4) {
            title = "Animal 1";
        }
        return title;
    }


}
