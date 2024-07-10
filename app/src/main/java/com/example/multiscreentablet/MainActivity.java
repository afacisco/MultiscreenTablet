package com.example.multiscreentablet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;

/*
Autor: Juan Francisco Sánchez González
Fecha: 29/12/2023
Clase: Actividad principal que instancia el LinearLayout de la vista con dimnesiones mayores que 600dp.
Si existe porque el dispositivo es una tablet muestra mensaje.
*/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Layout vista sw600dp
        LinearLayout layoutContenedor = (LinearLayout) findViewById(R.id.fragmentTContainer);

        // ¿Qué dispositivo es?
        if (layoutContenedor != null) {
            // Tablet porque carga el sw600dp
            Toast.makeText(this, "Tablet", Toast.LENGTH_LONG).show();
        } else {
            // Móvil porque carga el layout por defecto
            Toast.makeText(this, "Móvil", Toast.LENGTH_LONG).show();
        }
    }
}