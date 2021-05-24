package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Producto producto = new Producto();
	Scanner leer=new Scanner(System.in);

	System.out.println("ingrese el precio del producto");
		System.out.println("El precio final es: "+producto.calcularIVA(leer.nextDouble()));
    }
}
