package com.company;

public class Coche {
    String color;
    String modelo;
    String fabricante;
    Double peso;
    Double largo;
    Integer velocidad = 0;

    public Coche() {}

    public Coche(String color, String fabricante, String modelo, Double peso, Double largo) {
        this.color = color;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.peso = peso;
        this.largo = largo;
    }

    public void acelerar(Integer cantidad) {
        if(cantidad > 0 && cantidad <= 120) {
            this.velocidad += cantidad;
        }
    }

    @Override
    public String toString() {
        return "Coche: \n" +
                "color='" + color + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad
                ;
    }
}
