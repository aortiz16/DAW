package com.Tony;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        String veredicto = veredicto(args[1] , args[2]);
        out.println(args[0] + " Ha sacado una notas. . . malas : " + veredicto);
    }

    public  static String veredicto(String nota1, String nota2) {
        if (nota1.equals(nota2)) {
            return "Perfecto. Acertaste.";
        }

        if (Integer.valueOf(nota1) < Integer.valueOf(nota2)) {
            return "Has mejorado, o te ha llegado el éxito inesperado.";
        }

        return "Te has confiado. Necesitas mejorar !! , ";
    }
}