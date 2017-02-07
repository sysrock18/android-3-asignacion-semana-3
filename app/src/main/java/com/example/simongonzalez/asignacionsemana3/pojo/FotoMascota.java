package com.example.simongonzalez.asignacionsemana3.pojo;

import com.example.simongonzalez.asignacionsemana3.R;

/**
 * Created by simongonzalez on 2/7/17.
 */

public class FotoMascota {

    private int foto;
    private String like;

    public FotoMascota(int foto, String like) {
        this.foto = foto;
        this.like = like;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

}
