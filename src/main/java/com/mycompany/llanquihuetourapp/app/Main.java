package com.mycompany.llanquihuetourapp.app;

import com.mycompany.llanquihuetourapp.data.GestorDatos;
import com.mycompany.llanquihuetourapp.model.Tour;
import com.mycompany.llanquihuetourapp.service.TourService;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        GestorDatos gestor =
                new GestorDatos();

        ArrayList<Tour> tours =
                gestor.cargarTours(
                        "src/main/resources/Tours.csv");

        TourService service =
                new TourService();

        System.out.println(
                "===== LISTA DE TOURS =====");

        service.mostrarTours(tours);

        System.out.println(
                "\n===== TOURS SOBRE $40.000 =====");

        service.mostrarToursCaros(tours);

        System.out.println(
                "\n===== BUSQUEDA =====");

        service.buscarTour(tours, "Lago");
    }
}