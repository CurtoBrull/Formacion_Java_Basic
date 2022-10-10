package com.company;

public class CocheElectricoPOO extends CochePOO{
    String motorElectrico;

    public CocheElectricoPOO() {

    }

    public CocheElectricoPOO(String motorElectrico) {
        this.motorElectrico = motorElectrico;
    }

    @Override
    public String toString() {
        return "CocheElectricoPOO{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
