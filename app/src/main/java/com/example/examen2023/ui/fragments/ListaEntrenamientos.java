package com.example.examen2023.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import com.example.examen2023.Entrenamiento;
import com.example.examen2023.EntrenamientoAdapterList;
import com.example.examen2023.R;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class ListaEntrenamientos extends Fragment {

    private ListView listaView;

    private ArrayList<Entrenamiento> entrenamientos = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_lista, container, false);

        listaView = root.findViewById(R.id.listaEntrenamientos);
        cargarEntrenamientos();

        return root;
    }


    private void cargarEntrenamientos(){
        ArrayList<String> pruebas = new ArrayList<>();
        pruebas.add("Prueba fuerza x12");
        pruebas.add("Prueba velocidad x6");
        pruebas.add("Prueba equilibrio x10");

        Entrenamiento entrenamiento1 = new Entrenamiento(
                "Entreno 1", pruebas
        );
        entrenamientos.add(entrenamiento1);

        Entrenamiento entrenamiento2 = new Entrenamiento(
                "Entreno 2", pruebas
        );
        entrenamientos.add(entrenamiento2);

        Entrenamiento entrenamiento3 = new Entrenamiento(
                "Entreno 3", pruebas
        );
        entrenamientos.add(entrenamiento3);

        Entrenamiento entrenamiento4 = new Entrenamiento(
                "Entreno 4", pruebas
        );
        entrenamientos.add(entrenamiento4);

        EntrenamientoAdapterList adapter = new EntrenamientoAdapterList(getContext(), getFragmentManager(),entrenamientos);
        listaView.setAdapter(adapter);
    }
}