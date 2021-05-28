package src;

public class Main {
    public static void main(String[] args) {
        Electrodomestico electrodomestico = new Electrodomestico(100,"Blanco",'X',40);
        Lavadora lavadora = new Lavadora(100,"Blanco",'X',40,20);
        Television television = new Television(100,"NEGRO",'W',50,50,true);
        //electrodomestico.comprobarConsumoEnergetico('Y');
        System.out.println(television.precioFinal());
    }
}
