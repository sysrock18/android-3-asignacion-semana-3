package com.example.simongonzalez.asignacionsemana3;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.simongonzalez.asignacionsemana3.adapter.MascotaAdaptador;
import com.example.simongonzalez.asignacionsemana3.pojo.Mascota;

import java.util.ArrayList;

public class FavMascotasActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fav_mascotas);

        Toolbar actionBar = (Toolbar) findViewById(R.id.miActionBar);
        actionBar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(actionBar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotasFav);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();
    }

    public void inicializarListaMascotas() {
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota("Sammy", R.drawable.golden, "2"));
        mascotas.add(new Mascota("Firulais", R.drawable.perrro, "4"));
        mascotas.add(new Mascota("Floyd", R.drawable.perrro_bulldog1, "1"));
        mascotas.add(new Mascota("Silvestre", R.drawable.gato_mascota, "6"));
        mascotas.add(new Mascota("Brown", R.drawable.hamster, "7"));
    }

    public void inicializarAdaptador() {
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas, this);
        listaMascotas.setAdapter(adaptador);
    }
}
