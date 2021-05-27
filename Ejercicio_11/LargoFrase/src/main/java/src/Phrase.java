package src;

import java.util.Locale;

public class Phrase {
    private int size;
    private String phrase;
    int a, e, i, o ,u;

    public Phrase(String phrase) {
        this.size = size;
        this.phrase = phrase;
    }

    public String getPhrase() {
        return phrase;
    }
      public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int calculateSize(String phrase){
         setSize(phrase.length());
        return getSize();
            }

    public void countVocals(){

        for (int n = 0; n <getSize();n++){
            char character = getPhrase().toLowerCase(Locale.ROOT).charAt(n);

            switch (character){
                case 'a':
                    a = a+1;
                    break;
                case 'e':
                    e = e+1;
                    break;
                case 'i':
                    i = i+1;
                    break;
                case 'o':
                    o = o+1;
                    break;
                case 'u':
                    u = u+1;
                    break;
            }
        }

    }


}
