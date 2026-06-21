package com.mycompany.llanquihuetourapp.model;

public class Guia {

    private String nombre;
    private String idioma;

    public Guia() {
    }

    public Guia(String nombre, String idioma) {
        this.nombre = nombre;
        this.idioma = idioma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public String toString() {
        return "Guia{" +
                "nombre='" + nombre + '\'' +
                ", idioma='" + idioma + '\'' +
                '}';
    }
}