package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Comparacion comparacion = new Comparacion();
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese los 2 valores a comparar");
        double x = leer.nextDouble();
        double y =leer.nextDouble();
        comparacion.hacerComparacion(x,y);
    }
}
