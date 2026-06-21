package com.mycompany.llanquihuetourapp.util;

public class Validador {

    public static boolean esTextoValido(String texto) {

        return texto != null &&
               !texto.trim().isEmpty();
    }
}