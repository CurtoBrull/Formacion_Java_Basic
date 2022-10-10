package com.company.Basicos;

import java.sql.SQLOutput;

public class Funciones {

    public static void main(String[] args) {
        holaMundo();
        System.out.println(devolverHolaMundo());
        hola("Javier");
        hola("Javier", "Curto Brull");
    }

    public static void holaMundo() {
        System.out.println("hola");
        System.out.println("mundo");
    }

    private static String devolverHolaMundo() {
        return "Hola Mundo";
    }


    //    Sobrecarga funciones
    public static void hola(String name) {
        System.out.println("Hola " + name);
    }

    public static void hola(String name, String apellidos) {
        String txt = "Desarrollo Aplicaciones Web";
        System.out.println("Hola " + name + " " + apellidos);
        System.out.println(txt.toUpperCase());
    }


}
