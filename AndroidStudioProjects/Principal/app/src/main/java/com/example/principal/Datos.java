package com.example.principal;

import java.util.ArrayList;

public class Datos {

    private static ArrayList<Persona> Personas = new ArrayList<>();
    public static void guardar(Persona p) {
        Personas.add(p);
    }
    public static ArrayList<Persona> obtener(){
        return Personas;
    }

}
