package com.company.StringMethods;

public class StringMain {
    public static void main(String[] args) {

        String mensaje = " Hola mundo  ";

        System.out.println(mensaje.length());
        System.out.println(mensaje.toUpperCase());
        System.out.println(mensaje.toLowerCase());
        System.out.println(mensaje.trim());
        System.out.println(mensaje.charAt(4));

        String otro = "HOLA MUNDO";

        Boolean comparacion1 = mensaje.equals(otro);
        String mensajeTrim = mensaje.trim();
        Boolean comparacion2 = mensajeTrim.equalsIgnoreCase(otro);

        if (comparacion1) {
            System.out.println("verdadero");
        } else System.out.println("falso");

        if (comparacion2) {
            System.out.println("verdadero");
        } else System.out.println("falso");

    }
}
