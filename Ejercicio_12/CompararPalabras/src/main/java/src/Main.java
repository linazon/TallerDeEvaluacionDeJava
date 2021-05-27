package src;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("Ingrese la primera palabra");
        String palabra1 =read.nextLine();
        System.out.println("Ingrese la segunda palabra");
        String palabra2 =read.nextLine();

       char[] arPalabra1 = palabra1.toCharArray();
       char[] arPalabra2 = palabra2.toCharArray();
        if(palabra1.equals(palabra2)){
            System.out.println("las  palabras son iguales");
        }else {
            for(int i = 0; i <= arPalabra1.length; ++i){
                if(arPalabra1[i] != arPalabra2[i]){
                    System.out.println("las letras diferentes son: "+arPalabra1[i]+ " "+ arPalabra2[i]);
                }
            }

        }
    }
}
