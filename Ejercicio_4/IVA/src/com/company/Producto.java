package com.company;

public class Producto {
    final double IVA = 0.21;

    public double calcularIVA (double precio){
        return precio + (precio * IVA);
    }
}
