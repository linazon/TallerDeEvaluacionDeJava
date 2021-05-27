package src;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        System.out.println("digite un numero");
        int numero = leer.nextInt();

        for (int i =numero; numero<= 1000; numero = numero +2){
            System.out.println(numero);

        }

    }
}
