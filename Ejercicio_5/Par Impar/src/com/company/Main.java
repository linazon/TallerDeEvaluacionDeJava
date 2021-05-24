package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List pares = new ArrayList();
    public static List impares = new ArrayList();

    public static void main(String[] args) {
    Main main = new Main();
    main.crearParesImpares();
	System.out.println("Numeros pares: \n" +pares);
	System.out.println("Numeros impares: \n" +impares);
    }
    public void crearParesImpares(){
        int i = 1;
        while (i <= 100){
            if (i % 2 == 0) {
                pares.add(i);
            } else {
                impares.add(i);
            }
            i++;
        }
    }
}
