package com.example.examen2023.ui.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.examen2023.Entrenamiento;
import com.example.examen2023.R;

import java.io.Serializable;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link InformacionEntrenos#newInstance} factory method to
 * create an instance of this fragment.
 */
public class InformacionEntrenos extends Fragment {

    private TextView titutloEntreno;
    private TextView ejercicio1;
    private TextView ejercicio2;
    private TextView ejercicio3;
    private ImageView imagenEntreno;

    public InformacionEntrenos() {
    }


    public static InformacionEntrenos newInstance(Entrenamiento entrenamiento) {
        InformacionEntrenos fragment = new InformacionEntrenos();
        Bundle args = new Bundle();
        args.putSerializable("entrenamiento", entrenamiento);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_informacion_entrenos, container, false);

        this.titutloEntreno = root.findViewById(R.id.infoNombre);
        this.ejercicio1 = root.findViewById(R.id.infoEntreno1);
        this.ejercicio2 = root.findViewById(R.id.infoEntreno2);
        this.ejercicio3 = root.findViewById(R.id.infoEntreno3);
        this.imagenEntreno = root.findViewById(R.id.imagenEntreno);

        Entrenamiento entrenamiento = (Entrenamiento) getArguments().getSerializable("entrenamiento");

        this.titutloEntreno.setText(entrenamiento.getNombre());

        this.ejercicio1.setText(entrenamiento.getEjercicios().get(0));
        this.ejercicio2.setText(entrenamiento.getEjercicios().get(1));
        this.ejercicio3.setText(entrenamiento.getEjercicios().get(2));
        this.imagenEntreno.setImageResource(R.mipmap.ej1_foreground);
        return root;
    }
}