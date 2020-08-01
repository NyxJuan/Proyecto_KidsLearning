package com.example.kidslearning;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.kidslearning.actividades.ContenedorAnimalesActivity;
import com.example.kidslearning.actividades.ContenedorFrutasActivity;
import com.example.kidslearning.actividades.ContenedorInstruccionesActivity;
import com.example.kidslearning.actividades.ContenedorVocalesActivity;
import com.example.kidslearning.inicio.HomeFragment;
import com.example.kidslearning.juegos.InicioFragment;
import com.example.kidslearning.interfaces.IComunicaFragments;
import com.example.kidslearning.lecciones.LeccionesFragment;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements IComunicaFragments, NavigationView.OnNavigationItemSelectedListener {

    //Fragment fragmentInicio;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*fragmentInicio = new InicioFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.contenedorFragments, fragmentInicio).commit();*/

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.contenedorFragments);
        navigationView = findViewById(R.id.nav_view);

        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        //Establece al fragment home por defecto
        if(savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
            navigationView.setCheckedItem(R.id.home);
        }
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawers();
        }else{
            super.onBackPressed();
        }
    }


    //Selecciona un item para la navegacion
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new HomeFragment()).commit();
                break;
            case R.id.lecciones:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new LeccionesFragment()).commit();
                break;
            case R.id.juegos:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new InicioFragment()).commit();
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return false;
    }




    //MENU JUEGOS
    @Override
    public void iniciarMenu1() {
        Intent intent = new Intent(this, JuegoIngles.class);
        startActivity(intent);
    }

    @Override
    public void iniciarMenu2() {
        Intent i = new Intent(this, JuegoFrutas.class);
        startActivity(i);
    }

    @Override
    public void iniciarMenu3() {
        Toast.makeText(getApplicationContext(), "Iniciar Juego3 desde el activity", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void iniciarMenu4() {
        Intent intent = new Intent(this, ContenedorInstruccionesActivity.class);
        startActivity(intent);
    }


    //MENU LECCIONES
    @Override
    public void iniciarMenuLecciones1() {
        Intent intent = new Intent(this, JuegoContar.class);
        startActivity(intent);
    }

    @Override
    public void iniciarMenuLecciones2() {
        Intent intent = new Intent(this, JuegoApples.class);
        startActivity(intent);
    }

    @Override
    public void iniciarMenuLecciones3() {
        Intent intent = new Intent(this, ContenedorAnimalesActivity.class);
        startActivity(intent);
    }

    @Override
    public void iniciarMenuLecciones4() {
        Intent intent = new Intent(this, ContenedorVocalesActivity.class);
        startActivity(intent);
    }

    @Override
    public void iniciarMenuLecciones5() {
        Intent intent = new Intent(this, ContenedorFrutasActivity.class);
        startActivity(intent);
}




}