package src;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);


        System.out.println("Escriba la frase a analizar");
         String phrase =read.nextLine();
        Phrase phrase1 = new Phrase(phrase);
        phrase1.calculateSize(phrase);
        phrase1.countVocals();

        System.out.println("La longitud de la frase es: "+ phrase1.getSize()+
                "\n # vocales A: "+ phrase1.a+
                "\n # vocales E: "+ phrase1.e+
                "\n # vocales I: "+ phrase1.i+
                "\n # vocales O: "+ phrase1.o+
                "\n # vocales U: "+ phrase1.u);

    }


}
