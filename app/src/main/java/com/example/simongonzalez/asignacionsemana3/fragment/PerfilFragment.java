package com.example.simongonzalez.asignacionsemana3.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.simongonzalez.asignacionsemana3.R;
import com.example.simongonzalez.asignacionsemana3.adapter.MascotaFotoAdaptador;
import com.example.simongonzalez.asignacionsemana3.pojo.FotoMascota;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilFragment extends Fragment {

    ArrayList<FotoMascota> fotosMascota;
    private GridView fotos;

    public PerfilFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);

        fotos = (GridView) v.findViewById(R.id.mascotaFotos);
        inicializarFotosMascota();
        inicializarAdaptador();
        // Inflate the layout for this fragment
        return v;
    }

    public void inicializarAdaptador() {
        MascotaFotoAdaptador adaptador = new MascotaFotoAdaptador(fotosMascota, getActivity());
        fotos.setAdapter(adaptador);
    }

    public void inicializarFotosMascota() {
        fotosMascota = new ArrayList<FotoMascota>();

        fotosMascota.add(new FotoMascota(R.drawable.golden,"2"));
        fotosMascota.add(new FotoMascota(R.drawable.golden,"5"));
        fotosMascota.add(new FotoMascota(R.drawable.golden,"8"));
        fotosMascota.add(new FotoMascota(R.drawable.golden,"1"));
        fotosMascota.add(new FotoMascota(R.drawable.golden,"4"));
        fotosMascota.add(new FotoMascota(R.drawable.golden,"7"));
        fotosMascota.add(new FotoMascota(R.drawable.golden,"10"));
        fotosMascota.add(new FotoMascota(R.drawable.golden,"0"));
        fotosMascota.add(new FotoMascota(R.drawable.golden,"2"));
    }

}
