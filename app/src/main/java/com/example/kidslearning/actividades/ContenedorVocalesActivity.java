package com.example.kidslearning.actividades;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.kidslearning.R;
import com.google.android.material.tabs.TabLayout;

public class ContenedorVocalesActivity extends AppCompatActivity {

    TabLayout tabLayoutVocales;
    ViewPager viewPagerVocales;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenedor_vocales);

        viewPagerVocales = findViewById(R.id.viewpager_vocales);
        viewPagerVocales.setAdapter(new FragmentAdapterVocales(getSupportFragmentManager()));
        tabLayoutVocales = findViewById(R.id.tablayout_vocales);
        tabLayoutVocales.setupWithViewPager(viewPagerVocales);


    }
}