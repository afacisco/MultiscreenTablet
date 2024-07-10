package com.example.multiscreentablet;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/*
Autor: Juan Francisco Sánchez González
Fecha: 29/12/2023
Clase: Fragmento verde, se carga solo en el tipo de dispositivo de dimensiones mayores de 600dp
*/

public class FragmentT extends Fragment {

    public FragmentT() {
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
        return inflater.inflate(R.layout.fragment_t, container, false);
    }
}