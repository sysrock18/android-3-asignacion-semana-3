package com.example.simongonzalez.asignacionsemana3.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.simongonzalez.asignacionsemana3.R;
import com.example.simongonzalez.asignacionsemana3.adapter.MascotaAdaptador;
import com.example.simongonzalez.asignacionsemana3.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by simongonzalez on 1/31/17.
 */

public class RecyclerViewFragment extends Fragment {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_recyclerview, container, false);

        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();

        return v;
    }

    public void inicializarAdaptador() {
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas, getActivity());
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas() {
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota("Sammy", R.drawable.golden, "2"));
        mascotas.add(new Mascota("Firulais", R.drawable.perrro, "4"));
        mascotas.add(new Mascota("Floyd", R.drawable.perrro_bulldog1, "1"));
        mascotas.add(new Mascota("Silvestre", R.drawable.gato_mascota, "6"));
        mascotas.add(new Mascota("Brown", R.drawable.hamster, "7"));
    }
}
