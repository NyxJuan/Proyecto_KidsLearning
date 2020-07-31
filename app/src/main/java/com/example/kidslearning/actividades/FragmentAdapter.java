package com.example.kidslearning.actividades;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.kidslearning.juegos.Ayuda1Fragment;
import com.example.kidslearning.juegos.Ayuda2Fragment;
import com.example.kidslearning.juegos.Ayuda3Fragment;
import com.example.kidslearning.juegos.Ayuda4Fragment;
import com.example.kidslearning.juegos.Ayuda5Fragment;

public class FragmentAdapter extends FragmentPagerAdapter{


    public FragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0: return new Ayuda1Fragment();
            case 1: return new Ayuda2Fragment();
            case 2: return new Ayuda3Fragment();
            case 3: return new Ayuda4Fragment();
            case 4: return new Ayuda5Fragment();

            default: return new Ayuda1Fragment();
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
        if(position == 0)
        {
            title = "Guia 1";
        }
        else if(position == 1)
        {
            title = "Guia 2";
        }
        else if(position == 2)
        {
            title = "Guia 3";
        }
        else if(position == 3)
        {
            title = "Guia 4";
        }
        else if(position == 4)
        {
            title = "Guia 5";
        }
        return title;
    }
}
