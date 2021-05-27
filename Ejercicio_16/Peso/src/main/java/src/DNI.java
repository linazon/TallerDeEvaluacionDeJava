package src;
import java.util.HashMap;


public class DNI {
    private  int num;

    public DNI() {
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Character letter(int num){
        HashMap<Integer, Character> letter = new HashMap<Integer, Character>();
        letter.put(0, 'T');
        letter.put(1, 'R');
        letter.put(2, 'W');
        letter.put(3, 'A');
        letter.put(4, 'G');
        letter.put(5, 'M');
        letter.put(6, 'Y');
        letter.put(7, 'F');
        letter.put(8, 'P');
        letter.put(9, 'D');
        letter.put(10, 'X');
        letter.put(11, 'B');
        letter.put(12, 'N');
        letter.put(13, 'J');
        letter.put(14, 'Z');
        letter.put(15, 'S');
        letter.put(16, 'Q');
        letter.put(17, 'V');
        letter.put(18, 'H');
        letter.put(19, 'L');
        letter.put(20, 'C');
        letter.put(21, 'K');
        letter.put(22, 'E');

        return letter.get(num);
    }

}
