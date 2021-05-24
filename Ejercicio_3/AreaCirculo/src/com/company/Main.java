package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Area area = new Area();

        System.out.println("ingrese el radio");
        area.setRadio(Double.parseDouble(leer.nextLine()));

        System.out.println("El area es: "+ area.calculateArea());

    }
}
