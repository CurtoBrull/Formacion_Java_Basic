package com.company.Basicos;

import com.company.CocheElectricoPOO;
import com.company.CocheHibridoPOO;
import com.company.CochePOO;

public class PolimorfismoMain {
    public static void main(String[] args) {

        CochePOO coche = new CochePOO();

        CocheElectricoPOO coche2 = new CocheElectricoPOO();

        CocheHibridoPOO coche3 = new CocheHibridoPOO();

//        Poliformismo
        CochePOO coche4 = new CocheElectricoPOO();
        CochePOO coche5 = new CocheHibridoPOO();

        if(coche5 instanceof CocheElectricoPOO){
            System.out.println("Es electrico");
        } else if (coche5 instanceof CocheHibridoPOO) {
            System.out.println("Es hibrido");
        } else {
            System.out.println("Es de combustion");
        }
    }
}
