package com.example.simongonzalez.asignacionsemana3.pojo;

/**
 * Created by simongonzalez on 12/13/16.
 */

public class Mascota {
    private String nombre;
    private int foto;
    private String like;

    public Mascota(String nombre, int foto, String like) {
        this.nombre = nombre;
        this.foto = foto;
        this.like = like;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
