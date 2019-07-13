package com.example.principal;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class CrearPersonas extends AppCompatActivity {
    private EditText cedula, nombre, apellido;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_personas);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        cedula = findViewById(R.id.txtCedula);
        nombre = findViewById(R.id.txtNombre);
        apellido = findViewById(R.id.txtApellido);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


    public void guardar(View v) {
        String nom, apell, ced;
        Persona p;
        ced = cedula.getText().toString();
        nom = nombre.getText().toString();
        apell = apellido.getText().toString();
        p = new Persona(ced, nom, apell);
        p.guardar();


    }

    public void limpiar(View v) {
        cedula.setText("");
        nombre.setText("");
        apellido.setText("");
        cedula.setText("");
    }
}
