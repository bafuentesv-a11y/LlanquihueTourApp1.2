package com.mycompany.llanquihuetourapp.model;

public class Tour {

    private String nombre;
    private String destino;
    private double precio;

    private Guia guia;
    private Operador operador;

    public Tour() {
    }

    public Tour(String nombre, String destino, double precio,
                Guia guia, Operador operador) {

        this.nombre = nombre;
        this.destino = destino;
        this.precio = precio;
        this.guia = guia;
        this.operador = operador;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDestino() {
        return destino;
    }

    public double getPrecio() {
        return precio;
    }

    public Guia getGuia() {
        return guia;
    }

    public Operador getOperador() {
        return operador;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "nombre='" + nombre + '\'' +
                ", destino='" + destino + '\'' +
                ", precio=" + precio +
                ", guia=" + guia +
                ", operador=" + operador +
                '}';
    }
}