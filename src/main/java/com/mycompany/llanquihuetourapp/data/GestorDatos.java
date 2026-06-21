package com.mycompany.llanquihuetourapp.data;

import com.mycompany.llanquihuetourapp.model.Guia;
import com.mycompany.llanquihuetourapp.model.Operador;
import com.mycompany.llanquihuetourapp.model.Tour;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GestorDatos {

    public ArrayList<Tour> cargarTours(String rutaArchivo) {

        ArrayList<Tour> tours = new ArrayList<>();

        try (BufferedReader br =
                     new BufferedReader(
                             new FileReader(rutaArchivo))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                String[] datos = linea.split(",");

                String nombre = datos[0];
                String destino = datos[1];
                double precio =
                        Double.parseDouble(datos[2]);

                Guia guia =
                        new Guia("Guía General",
                                "Español");

                Operador operador =
                        new Operador(
                                "Llanquihue Tour",
                                "652345678");

                Tour tour =
                        new Tour(
                                nombre,
                                destino,
                                precio,
                                guia,
                                operador);

                tours.add(tour);
            }

        } catch (IOException e) {

            System.out.println(
                    "Error al leer archivo: "
                            + e.getMessage());
        }

        return tours;
    }
}