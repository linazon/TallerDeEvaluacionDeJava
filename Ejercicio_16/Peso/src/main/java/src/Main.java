package src;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    Persona persona1 = new Persona("Lina",22, 'F',55,1.53);
    Persona persona2 = new Persona("Pedro",22, 'F');
    Persona persona3 = new Persona();

        /*
        GUARDAR LOS OBJETOS EN UN ARRAYLIST
        ArrayList<Persona> perdonas = new ArrayList<Persona>();
        perdonas.add(persona1);
        perdonas.add(persona2);

*/
        System.out.println(persona2.toString());
    }
}
