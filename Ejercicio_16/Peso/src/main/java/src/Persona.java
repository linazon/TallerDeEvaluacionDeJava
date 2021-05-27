package src;

public class Persona {
    private String nombre;
    private int edad;
    private String DNI;
    private  char sexo;
    private double peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }
    
    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int calcularIMC(){
        double imc = (getPeso()/(Math.pow(getAltura(),2)));
            if(imc < 20){
                return -1;
            }else  if (20 < imc && imc < 25){
                return 0;
            }else if(imc >25){
                return  1;
            }
         return 0;
    }

    public boolean esMayorDeEdad(){
        if(getEdad()>18){
            return true;
        }
        return false;
    }

    public char comprobarSexo(char sexo){
        if(getSexo() == 'M'){
            return 'M';
        }
        return 'H';
    }
}
