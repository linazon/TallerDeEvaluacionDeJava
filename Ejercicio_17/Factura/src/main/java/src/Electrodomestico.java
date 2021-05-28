package src;


public class Electrodomestico {
    Color listaColor = new Color();
    Consumo consumo = new Consumo();
    Tamaño tamaño = new Tamaño();

    private double precioBase = 100;
    private String color = listaColor.seleccionarColor(0);
    private Character consumoEnergetico = 'F';
    private double peso = 5;

    public Electrodomestico() { }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, String color, Character consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }


    public double getPrecioBase() {
        return precioBase;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public Character getConsumoEnergetico() {
        return consumoEnergetico;
    }
    public void setConsumoEnergetico(Character consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }
    public double getPeso() {
        return peso;
    }

    public Character comprobarConsumoEnergetico(char letra){
        Character resultado = (letra >= 65 && letra <= 70)?letra:'F';
        return resultado;
    }

    public void comprobarColor(String color){
       for (int i = 0; i<=4; i++){
            String resultado = (listaColor.seleccionarColor(i).compareToIgnoreCase(color)==0)?
                    listaColor.seleccionarColor(i):color;
            setColor(resultado);
        }
    }

    public double precioFinal(){
        return getPrecioBase()+
                consumo.aumentoConsumo(comprobarConsumoEnergetico(getConsumoEnergetico()))+
                tamaño.valorTamaño((int) getPeso());
    }
}
