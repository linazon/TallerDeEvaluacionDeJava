package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List pares = new ArrayList();
        List impares = new ArrayList();

        int i= 1;

	while (i <= 100){
	    if (i % 2 != 0){
            impares.add(i);
        }else{
	        pares.add(i);
        }
	    i++;
    }
	System.out.println("Numeros pares: \n" +pares);
	System.out.println("Numeros impares: \n" +impares);
    }
}
