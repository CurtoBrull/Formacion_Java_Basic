package com.company;

public class CocheMain {

    public static void main(String[] args) {
        Coche cocheObjeto = new Coche();
        Coche cocheObj = new Coche("Rojo", "Renault", "Kangoo", 1200.0, 10.5);

        cocheObj.acelerar(20);
        System.out.println(cocheObj.toString());
        cocheObj.acelerar(50);
        System.out.println(cocheObj.toString());
    }
}
