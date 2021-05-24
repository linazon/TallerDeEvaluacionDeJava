package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List pares = new ArrayList();
    static List impares = new ArrayList();

    public static void main(String[] args) {
       Main parimpar = new Main();
        Hacer_Listas_Numeros();
        presentar_Numeros();


    }

    public static  void  Hacer_Listas_Numeros(){
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                pares.add(i);
            } else {
                impares.add(i);
            }
        }
    }

    public static void presentar_Numeros() {
        pares.stream().filter(x -> x.toString().startsWith("2")).forEach(System.out::println);
       // System.out.println("Numeros pares: \n" + pares);
        //System.out.println("Numeros impares: \n" + impares);
    }
}
