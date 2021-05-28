package src;

public class Tamaño {
    public int valorTamaño(int tamaño){
        if(tamaño >= 0 && tamaño <= 19){
            return 10;
        }else if(tamaño >= 20 && tamaño <= 49){
            return 50;
        }else if(tamaño >= 50 && tamaño <= 79){
            return 80;
        }else if(tamaño > 80){
            return 100;
        }
        return 0;
    }
}
