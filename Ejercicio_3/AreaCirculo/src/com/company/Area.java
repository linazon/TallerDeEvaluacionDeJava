package com.company;

public class Area {
    private double radio;

    public Area(){

    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calculateArea(){
       return Math.PI*Math.pow(getRadio(),2);
    }
}
