package com.company.Basicos;

public class IfElse {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 10;

        if (num1 < num2) {
            System.out.println(num1 + " es menor que " + num2);
        } else if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
        } else {
            System.out.println("No entra en la condicion");
        }
    }
}
