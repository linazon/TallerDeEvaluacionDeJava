package src;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Persona persona1 = null;
        Persona persona2 = null;
        Persona persona3 = new Persona();

    for(int i = 0; i <= 2; i++){
        System.out.println("Ingrese el nombre");

        String nombre =leer.next();
        System.out.println("Ingrese la edad");
        int edad =leer.nextInt();
        System.out.println("Ingrese el sexo");
        char sexo =leer.next().charAt(0);
        System.out.println("Ingrese el peso en kg");
        double peso =leer.nextDouble();
        System.out.println("Ingrese la altura en m");
        double altura =leer.nextDouble();
            if(i == 0) { persona1 = new Persona(nombre, edad, sexo, peso, altura); }
            if(i == 1) { persona2 = new Persona(nombre, edad, sexo); }
            if(i == 2) {
                persona3.setNombre(nombre);
                persona3.setEdad(edad);
                persona3.setSexo(sexo);
                persona3.setPeso(peso);
                persona3.setAltura(altura);
            }
    }

        System.out.println("Informacion de cada objeto:\n"+
                persona1.toString()+"\n"+persona1.buscarPeso()+"\n"+persona1.mayorEdad()+"\n"+
                persona2.toString()+"\n"+persona2.buscarPeso()+"\n"+persona2.mayorEdad()+"\n"+
                persona3.toString()+"\n"+persona3.buscarPeso()+"\n"+persona3.mayorEdad()+"\n");
    }
}
