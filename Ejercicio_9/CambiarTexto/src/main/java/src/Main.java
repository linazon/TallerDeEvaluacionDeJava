package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        String texto = "La sonrisa sera la mejor arma contra la tristeza";
        texto = texto.replaceAll("a", "e");
        System.out.println("ingrese texto");
        String textUsuario = leer.nextLine();

        System.out.println(texto +" "+textUsuario);
    }
}
