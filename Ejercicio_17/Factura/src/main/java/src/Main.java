package src;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Electrodomestico[] electrodomesticos = new Electrodomestico[10];

        electrodomesticos[0] = new Electrodomestico();
        electrodomesticos[1] = new Electrodomestico(80,50);
        electrodomesticos[2] = new Electrodomestico(60,"ROJO",'C',27);
        electrodomesticos[3] = new Lavadora();
        electrodomesticos[4] = new Lavadora(90,12);
        electrodomesticos[5]= new Lavadora(120,"Blanco",'Q',75,40);
        electrodomesticos[6]= new Television();
        electrodomesticos[7]= new Television(200,85);
        electrodomesticos[8]= new Television(150, "gris",'A',10,60,true);
        electrodomesticos[9]= new Lavadora(200, "blanco",'A',10,30);

        System.out.println("Precio total de lavadoras: "+Main.sumaLavadora(electrodomesticos));
        System.out.println("\n Precio total de Televisores: "+Main.sumaTelevisor(electrodomesticos));
        System.out.println("\n Precio total de Electrodomesticos: "+Main.sumaElectrodomestico(electrodomesticos));

        //Main.filtrarPorInstanciaTelevisor(electrodomesticos);
       // Main.filtrarPorInstanciaElectrodomestico(electrodomesticos);

        /*Electrodomestico electrodomestico = new Electrodomestico(100,"Blanco",'X',40);
        Lavadora lavadora = new Lavadora(100,"Blanco",'X',40,20);
        Television television = new Television(100,"NEGRO",'W',50,50,true);
        //electrodomestico.comprobarConsumoEnergetico('Y');
        System.out.println(television.precioFinal());*/


    }
    public static Double sumaLavadora(Electrodomestico[] electrodomesticos){
        Arrays.stream(electrodomesticos).filter(ele -> ele instanceof Lavadora).forEach(lav -> System.out.println("precio de lavadora "+  lav.precioFinal()));
        return Arrays.stream(electrodomesticos).filter(x -> x instanceof Lavadora).map(Electrodomestico::precioFinal).reduce((double) 0, Double::sum);
    }

    public static Double sumaTelevisor(Electrodomestico[] electrodomesticos){
        Arrays.stream(electrodomesticos).filter(ele -> ele instanceof Television).forEach(lav -> System.out.println("precio de televisor "+lav.precioFinal()));
        return Arrays.stream(electrodomesticos).filter(x -> x instanceof Television).map(Electrodomestico::precioFinal).reduce((double) 0, Double::sum);
    }
    public static Double sumaElectrodomestico(Electrodomestico[] electrodomesticos){
        Arrays.stream(electrodomesticos).filter(ele -> ele instanceof Electrodomestico).forEach(lav -> System.out.println("precio de electrodomestico "+lav.precioFinal()));
        return Arrays.stream(electrodomesticos).filter(x -> x instanceof Electrodomestico).map(Electrodomestico::precioFinal).reduce((double) 0, Double::sum);
    }



}
