package com.example.kidslearning.fragments;

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

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    View vista;
    Context actividad;
    CardView cardMenu1, cardMenu2, cardMenu3, cardMenu4, cardMenu5, cardMenu6;

    IComunicaFragments interfaceComunicarFragments;

    public InicioFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static InicioFragment newInstance(String param1, String param2) {
        InicioFragment fragment = new InicioFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        vista = inflater.inflate(R.layout.fragment_inicio, container, false);
        cardMenu1 = vista.findViewById(R.id.cardMenu1);
        cardMenu2 = vista.findViewById(R.id.cardMenu2);
        cardMenu3 = vista.findViewById(R.id.cardMenu3);
        cardMenu4 = vista.findViewById(R.id.cardMenu4);
        cardMenu5 = vista.findViewById(R.id.cardMenu5);
        cardMenu6 = vista.findViewById(R.id.cardMenu6);
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

        cardMenu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                interfaceComunicarFragments.iniciarMenu5();
            }
        });

        cardMenu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                interfaceComunicarFragments.iniciarMenu6();
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