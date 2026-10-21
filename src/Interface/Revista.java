package Interface;

public class Revista {


    private String titulo;
    private String editora;
    private double valor;

    public Revista(){

    }

    public Revista(String titulo, String editora, double valor) {
        this.titulo = titulo;
        this.editora = editora;
        this.valor = valor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return
                "\n titulo: " + titulo +
                "\n editora: " + editora +
                "\n valor: " + valor;
    }
}
