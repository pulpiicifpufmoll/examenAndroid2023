package com.example.examen2023;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.example.examen2023.ui.fragments.InformacionEntrenos;
import com.example.examen2023.ui.fragments.ListaEntrenamientos;

import java.util.ArrayList;

import static java.security.AccessController.getContext;

public class EntrenamientoAdapterList extends ArrayAdapter<Entrenamiento> {

    private FragmentManager fragmentManager;

    public EntrenamientoAdapterList(Context context, FragmentManager fragmentManager, ArrayList<Entrenamiento> entrenamientos) {
        super(context, 0, entrenamientos);
        this.fragmentManager = fragmentManager;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Entrenamiento entrenamiento = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_lista, parent, false);
        }

        LinearLayout listaItemLayout = convertView.findViewById(R.id.listaItemLayout);

        listaItemLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InformacionEntrenos informacionEntrenos = new InformacionEntrenos().newInstance(entrenamiento);
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.replace(R.id.fragmentContainerView, informacionEntrenos);
                transaction.commit();
            }
        });

        TextView nombreTextView = convertView.findViewById(R.id.nombreEntreno);

        nombreTextView.setText(entrenamiento.getNombre());

        return convertView;
    }
}
