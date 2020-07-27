package com.example.kidslearning;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.kidslearning.actividades.ContenedorInstruccionesActivity;
import com.example.kidslearning.fragments.InicioFragment;
import com.example.kidslearning.interfaces.IComunicaFragments;

public class MainActivity extends AppCompatActivity implements IComunicaFragments {

    Fragment fragmentInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentInicio = new InicioFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.contenedorFragments,fragmentInicio).commit();

    }

    @Override
    public void iniciarMenu1() {
        //Toast.makeText(getApplicationContext(), "Iniciar Menu1 desde el activity", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, ContenedorInstruccionesActivity.class);
        startActivity(intent);
    }

    @Override
    public void iniciarMenu2() {
        Toast.makeText(getApplicationContext(), "Iniciar Menu2 desde el activity", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void iniciarMenu3() {
        Toast.makeText(getApplicationContext(), "Iniciar Menu3 desde el activity", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void iniciarMenu4() {
        Toast.makeText(getApplicationContext(), "Iniciar Menu4 desde el activity", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void iniciarMenu5() {
        Toast.makeText(getApplicationContext(), "Iniciar Menu5 desde el activity", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void iniciarMenu6() {
        Toast.makeText(getApplicationContext(), "Iniciar Menu6 desde el activity", Toast.LENGTH_SHORT).show();
    }
}