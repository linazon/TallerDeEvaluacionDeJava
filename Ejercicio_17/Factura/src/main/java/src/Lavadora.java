package src;

public class Lavadora extends Electrodomestico{
    private double carga = 5;

    public Lavadora(){};
    public Lavadora( double precioBase,  double peso){
        super(precioBase, peso);
      }
    public Lavadora( double precioBase, String color, Character consumoEnergetico, double peso, double carga){
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public double precioFinal(){
        int valorCarga = (getCarga()>30)?50:0;
        return getPrecioBase()+
                consumo.aumentoConsumo(comprobarConsumoEnergetico(getConsumoEnergetico()))+
                tamaño.valorTamaño((int) getPeso())+
                valorCarga;
    }
}
