package com.company;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.hacerComparacion(7, 5);
    }

    public void hacerComparacion(double x, double y) {
        if (x > y) {
            System.out.println(x + " es mayor que " + y);
        } else if (x == y) {
            System.out.println("Los valores son iguales");
        } else {
            System.out.println(y + " es mayor que " + x);
        }
    }
}