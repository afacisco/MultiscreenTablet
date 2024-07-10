package com.example.multiscreentablet;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/*
Autor: Juan Francisco Sánchez González
Fecha: 29/12/2023
Clase: Fragmento azul, se carga en los 2 tipos de dispositivos (móvil y tablet)
*/

public class FragmentM extends Fragment {

    public FragmentM() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_m, container, false);
    }
}