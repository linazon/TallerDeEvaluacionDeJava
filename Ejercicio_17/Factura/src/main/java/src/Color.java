package src;

import java.util.ArrayList;

public class Color {
    public String seleccionarColor(int index){
        ArrayList<String> color = new ArrayList<String>();
        color.add("Blanco");
        color.add("Negro");
        color.add("Rojo");
        color.add("Azul");
        color.add("Gris");

        return color.get(index);
    }


}
