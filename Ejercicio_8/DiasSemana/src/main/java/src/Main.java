package src;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese una día de la semana");
        String dia = leer.nextLine();

        switch (dia){
            case "Lunes":
                System.out.println("día laboral");
                break;
            case "Martes":
                System.out.println("día laboral");
                break;
            case "Miercoles":
                System.out.println("día laboral");
                break;
            case "Jueves":
                System.out.println("día laboral");
                break;
            case "Viernes":
                System.out.println("día laboral");
                break;
            case "Sabado":
                System.out.println("No es un día laboral");
                break;
            case "Domingo":
                System.out.println("No es un día laboral");
                break;
            default:
                System.out.println("ingrese un dato valido");
        }
    }

}
