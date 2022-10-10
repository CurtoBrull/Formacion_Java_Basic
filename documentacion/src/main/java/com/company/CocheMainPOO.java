package com.company;

public class CocheMainPOO {

    public static void main(String[] args) {
        CochePOO cochePOOObjeto = new CochePOO();
        CochePOO cochePOOObj = new CochePOO("Rojo", "Renault", "Kangoo", 1200.0, 10.5);

        cochePOOObj.acelerar(20);
        System.out.println(cochePOOObj.toString());
        cochePOOObj.acelerar(50);
        System.out.println(cochePOOObj.toString());

        CocheElectricoPOO cocheElectrico = new CocheElectricoPOO();

        cocheElectrico.motorElectrico = "Motor1";
        cocheElectrico.fabricante = "Tesla";
        cocheElectrico.modelo = "L1";
        cocheElectrico.color = "Gris";

        System.out.println(cocheElectrico.toString());

//        Super

        CocheHibridoPOO cocheHibrido = new CocheHibridoPOO("Verde", "Audi", "F32", 456d, 8d,"Motor2");

        cocheHibrido.acelerar(50);

        System.out.println(cocheHibrido.toString());
    }
}

