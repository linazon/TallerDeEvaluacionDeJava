package src;

public class Serie {
    private String titulo = "";
    private int numTemporadas = 3;
    private boolean entregado = false;
    private String genero = "";
    private String creador = "";

    public Serie() { }
    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }
    public Serie(String titulo, int numTemporadas, boolean entregado, String genero, String creador) {
        this.titulo = titulo;
        this.numTemporadas = numTemporadas;
        this.entregado = entregado;
        this.genero = genero;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public int getNumTemporadas() {
        return numTemporadas;
    }
    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getCreador() {
        return creador;
    }
    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String toString(){
        return getTitulo() + getNumTemporadas() + entregado+ getGenero()+ getCreador();
    }
}
