package src;

public class Main {
    public static void main(String[] args) {
        Electrodomestico electrodomestico = new Electrodomestico(100,"Blanco",'X',40);
        //electrodomestico.comprobarConsumoEnergetico('Y');
        System.out.println(electrodomestico.precioFinal());
    }
}
