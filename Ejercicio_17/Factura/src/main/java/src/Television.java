package src;

public class Television extends Electrodomestico{
    private double pulgadas = 20;
    private boolean TDT = false;

    public Television() {}
    public Television( double precioBase,  double peso){
        super(precioBase, peso);
    }
    public Television( double precioBase, String color, Character consumoEnergetico, double peso, double pulgadas, boolean TDT){
        super(precioBase, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.TDT = TDT;
    }

    public double getPulgadas() {
        return pulgadas;
    }
    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }
    public boolean isTDT() {
        return TDT;
    }
    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    @Override
    public double precioFinal(){
        double porcResolucion = (getPulgadas()>40)?0.3:0;
        //int valorTDT = (TDT)?50:0;
        return (adiccionarTDT()*porcResolucion)+adiccionarTDT();
    }

    public double adiccionarTDT(){
        int valorTDT = (TDT)?50:0;
       // double porcResolucion = (getPulgadas()>40)?0.3:0;
        return getPrecioBase()+
                consumo.aumentoConsumo(comprobarConsumoEnergetico(getConsumoEnergetico()))+
                tamaño.valorTamaño((int) getPeso())+
                valorTDT;
    }
}
