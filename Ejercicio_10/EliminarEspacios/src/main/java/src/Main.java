package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese una frase");
        String frase = leer.nextLine();

        frase = frase.replaceAll(" ", "");
        System.out.println(frase);
    }
}
