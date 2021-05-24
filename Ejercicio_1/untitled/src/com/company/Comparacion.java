package com.company;

public class Comparacion {

    public void hacerComparacion(double x, double y){
        if(x>y){
            System.out.println(x + " es mayor que " + y);
        } else if (x == y){
            System.out.println("Los valores son iguales");
        }else {
            System.out.println(y + " es mayor que " + x);
        }
    }
}
