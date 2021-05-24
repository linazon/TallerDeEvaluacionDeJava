package src;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double numero;
        do{
            System.out.println("ingrese un número a comparar");
             numero=leer.nextInt();
        }while(numero < 0);
        System.out.println("El número mayor o igual a cero es: "+ numero);
    }
}
