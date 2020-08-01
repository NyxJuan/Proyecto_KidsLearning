package com.example.kidslearning.juegos;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kidslearning.R;
import com.example.kidslearning.interfaces.IComunicaFragments;

public class InicioFragment extends Fragment {



    View vista;
    Context actividad;
    CardView cardMenu1, cardMenu2, cardMenu3, cardMenu4, cardMenu5, cardMenu6;

    IComunicaFragments interfaceComunicarFragments;

    public InicioFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        vista = inflater.inflate(R.layout.fragment_inicio, container, false);
        cardMenu1 = vista.findViewById(R.id.cardMenu1);
        cardMenu2 = vista.findViewById(R.id.cardMenu2);
        cardMenu3 = vista.findViewById(R.id.cardMenu3);
        cardMenu4 = vista.findViewById(R.id.cardMenu4);
        eventosMenu();
        return vista;
    }

    //llamado de los Menus
    private void eventosMenu(){
        cardMenu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                interfaceComunicarFragments.iniciarMenu1();
            }
        });

        cardMenu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                interfaceComunicarFragments.iniciarMenu2();
            }
        });

        cardMenu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                interfaceComunicarFragments.iniciarMenu3();
            }
        });

        cardMenu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                interfaceComunicarFragments.iniciarMenu4();
            }
        });
    }

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        if (context instanceof Activity){
            actividad = context;
            interfaceComunicarFragments= (IComunicaFragments) actividad;
        }
    }

}