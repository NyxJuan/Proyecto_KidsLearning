package com.example.kidslearning.actividades;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.kidslearning.R;
import com.google.android.material.tabs.TabLayout;

public class ContenedorFrutasActivity extends AppCompatActivity {

    TabLayout tabLayoutFrutas;
    ViewPager viewPagerFrutas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenedor_frutas);

        viewPagerFrutas = findViewById(R.id.viewpager_frutas);
        viewPagerFrutas.setAdapter(new FragmentAdapterFrutas(getSupportFragmentManager()));
        tabLayoutFrutas = findViewById(R.id.tablayout_frutas);
        tabLayoutFrutas.setupWithViewPager(viewPagerFrutas);
    }
}