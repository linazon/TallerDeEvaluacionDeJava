package com.company;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.hacerComparacion(8, 10);
    }

    public void hacerComparacion(double x, double y) {
       /* if(x==y){
            System.out.println("los números son iguales");
        }else{
            double comparacion= (x<y)? y:x;
            System.out.println("el número mayor es: "+ comparacion);
        }*/

        if (x > y) {
            System.out.println(x + " es mayor que " + y);
        } else if (x == y) {
            System.out.println("Los valores son iguales");
        } else {
            System.out.println(y + " es mayor que " + x);
        }
    }
}