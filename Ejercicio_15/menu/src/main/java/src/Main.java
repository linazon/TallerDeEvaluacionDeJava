package src;
import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Main main = new Main();
        int opcion=1;
        main.menu();

        while (opcion!=8){
            opcion = leer.nextInt();

             switch (opcion){
                 case 1:
                     main.menu();
                     break;
                 case 2:
                     main.menu();
                     break;
                 case 3:
                     main.menu();
                     break;
                 case 4:
                     main.menu();
                     break;
                 case 5:
                     main.menu();
                     break;
                 case 6:
                     main.menu();
                     break;
                 case 7:
                     main.menu();
                     break;
                 case 8:
                     break;
                 default:
                     System.out.println(" OPCION INCORRECTO");
             }
        }

    }
    public void menu(){
        System.out.println("****** GESTION CINEMATOGRÁFICA ********\n" +
                "1-NUEVO ACTOR\n" +
                "2-BUSCAR ACTOR\n" +
                "3-ELIMINAR ACTOR\n" +
                "4-MODIFICAR ACTOR\n" +
                "5-VER TODOS LOS ACTORES\n" +
                "6- VER PELICULAS DE LOS ACTORES\n" +
                "\n" +
                "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                "8-SALIR");
    }

}
