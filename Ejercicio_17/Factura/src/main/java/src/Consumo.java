package src;

import java.util.HashMap;

public class Consumo {
    public Integer aumentoConsumo(Character character){
        HashMap<Character, Integer> valorConsumo = new HashMap<Character, Integer>();

        // Add keys and values (Country, City)
        valorConsumo.put('A',100);
        valorConsumo.put('B',80);
        valorConsumo.put('C',60);
        valorConsumo.put('D', 50);
        valorConsumo.put('E', 30);
        valorConsumo.put('F', 10);

        return valorConsumo.get(character);
    }
}
