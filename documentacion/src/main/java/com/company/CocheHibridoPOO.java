package com.company;

public class CocheHibridoPOO extends CochePOO{
    String motorHibrido;

    public CocheHibridoPOO (){

    }

//    Super
    public CocheHibridoPOO(String color, String fabricante, String modelo, Double peso, Double largo, String motorHibrido){
        super(color, fabricante, modelo, peso, largo);
        this.motorHibrido = motorHibrido;
    }
    public CocheHibridoPOO(String motorHibrido){
        this.motorHibrido = motorHibrido;
    }

    @Override
    public void acelerar(Integer cantidad) {
        Integer cantidadAjustada = cantidad * 2;
        super.acelerar(cantidadAjustada);
    }

    @Override
    public String toString() {
        return "CocheHibridoPOO{" +
                "motorHibrido='" + motorHibrido + '\'' +
                ", color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
