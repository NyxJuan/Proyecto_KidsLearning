package com.example.kidslearning.actividades;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.kidslearning.R;
import com.google.android.material.tabs.TabLayout;

public class ContenedorCuentos1Activity extends AppCompatActivity {

    TabLayout tabLayoutCuentos1;
    ViewPager viewPagerCuentos1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenedor_cuentos1);

        viewPagerCuentos1 = findViewById(R.id.viewpager_cuentos1);
        viewPagerCuentos1.setAdapter(new FragmentAdapterCuentos1(getSupportFragmentManager()));
        tabLayoutCuentos1 = findViewById(R.id.tablayout_cuentos1);
        tabLayoutCuentos1.setupWithViewPager(viewPagerCuentos1);

    }

}