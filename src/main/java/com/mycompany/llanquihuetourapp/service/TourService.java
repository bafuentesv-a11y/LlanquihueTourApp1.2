package com.mycompany.llanquihuetourapp.service;

import com.mycompany.llanquihuetourapp.model.Tour;
import java.util.ArrayList;

public class TourService {

    public void mostrarTours(ArrayList<Tour> tours) {

        for (Tour tour : tours) {
            System.out.println(tour);
        }
    }

    public void mostrarToursCaros(ArrayList<Tour> tours) {

        for (Tour tour : tours) {

            if (tour.getPrecio() > 40000) {
                System.out.println(tour);
            }
        }
    }

    public void buscarTour(ArrayList<Tour> tours,
                           String nombreBuscado) {

        boolean encontrado = false;

        for (Tour tour : tours) {

            if (tour.getNombre()
                    .toLowerCase()
                    .contains(nombreBuscado.toLowerCase())) {

                System.out.println(tour);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println(
                    "No se encontró el tour.");
        }
    }
}