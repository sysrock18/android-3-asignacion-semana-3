package com.example.simongonzalez.asignacionsemana3;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.*;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar actionBar = (Toolbar) findViewById(R.id.miActionBar);
        actionBar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(actionBar);

        listaMascotas = (RecyclerView) findViewById(R.id.rvContactos);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();
    }

    public void inicializarAdaptador() {
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas, this);
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_settings, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch(item.getItemId()) {
            case R.id.menu_settings:
                Toast msjInicio = Toast.makeText(this, "Configuración", Toast.LENGTH_SHORT);
                msjInicio.show();
                return true;
            case R.id.star:
                Intent intent = new Intent(this, FavMascotasActivity.class);
                startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
