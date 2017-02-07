package com.example.simongonzalez.asignacionsemana3.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.simongonzalez.asignacionsemana3.R;
import com.example.simongonzalez.asignacionsemana3.pojo.FotoMascota;

import java.util.ArrayList;

/**
 * Created by simongonzalez on 2/7/17.
 */

public class MascotaFotoAdaptador extends BaseAdapter {

    ArrayList<FotoMascota> fotosMascota;
    Activity activity;
    private Context mContext;

    public MascotaFotoAdaptador(ArrayList<FotoMascota> fotosMascota, Context context){
        this.fotosMascota = fotosMascota;
        this.mContext = context;
    }



    @Override
    public int getCount() {
        return fotosMascota.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View gridViewAndroid;
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (view == null) {

            gridViewAndroid = new View(mContext);
            gridViewAndroid = inflater.inflate(R.layout.cardview_foto_mascota, null);
            TextView tvLike = (TextView) gridViewAndroid.findViewById(R.id.tvLike);
            ImageView imgFoto = (ImageView) gridViewAndroid.findViewById(R.id.imgFoto);
            tvLike.setText(fotosMascota.get(i).getLike());
            imgFoto.setImageResource(fotosMascota.get(i).getFoto());
        } else {
            gridViewAndroid = (View) view;
        }

        return gridViewAndroid;
    }
}
