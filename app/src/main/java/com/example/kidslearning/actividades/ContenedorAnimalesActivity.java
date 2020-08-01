package com.example.kidslearning.actividades;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.kidslearning.R;
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
import com.google.android.material.tabs.TabLayout;

public class ContenedorAnimalesActivity extends AppCompatActivity {

TabLayout tabLayout_animales;
ViewPager viewPagerAnimales;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenedor_animales);
        viewPagerAnimales = findViewById(R.id.viewpager_animales);
        viewPagerAnimales.setAdapter(new FragmentAdapterAnimales(getSupportFragmentManager()));

        tabLayout_animales = findViewById(R.id.tablayout_animales);
        tabLayout_animales.setupWithViewPager(viewPagerAnimales);
    }
}