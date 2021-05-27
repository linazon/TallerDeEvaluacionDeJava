package src;

public class Persona {

    private String nombre = "";
    private int edad = 0;
    private String DNI = generaDNI();
    private  char sexo = 'H';
    private double peso = 0;
    private double altura = 0;

    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad,  char sexo, double peso, double altura) {
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

    public double calcularIMC(){
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

    public String generaDNI(){
        int num = (int) Math.round(Math.random()*100_000_000);
        int numletter = num % 23;
        DNI dni = new DNI();
        return String.valueOf(num)+dni.letter(numletter);
    }

    public String toString(){
        return getNombre()+" "+ String.valueOf(getEdad())+" "+ getDNI()+" "+ getSexo()+" "+ getPeso()+" "+ getAltura();
    }
}
