package com.example.examen2023;

import java.io.Serializable;
import java.util.ArrayList;

public class Entrenamiento implements Serializable {
    private String nombre;
    private ArrayList<String> ejercicios;

    public Entrenamiento(String nombre, ArrayList<String> ejercicios) {
        this.nombre = nombre;
        this.ejercicios = ejercicios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getEjercicios() {
        return ejercicios;
    }

    public void setEjercicios(ArrayList<String> ejercicios) {
        this.ejercicios = ejercicios;
    }
}
