package com.example.kidslearning.actividades;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.kidslearning.R;
import com.google.android.material.tabs.TabLayout;

public class ContenedorCuentos2Activity extends AppCompatActivity {

    TabLayout tabLayoutCuentos2;
    ViewPager viewPagerCuentos2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenedor_cuentos2);

        viewPagerCuentos2 = findViewById(R.id.viewpager_cuentos2);
        viewPagerCuentos2.setAdapter(new FragmentAdapterCuentos2(getSupportFragmentManager()));
        tabLayoutCuentos2 = findViewById(R.id.tablayout_cuentos2);
        tabLayoutCuentos2.setupWithViewPager(viewPagerCuentos2);


    }
}