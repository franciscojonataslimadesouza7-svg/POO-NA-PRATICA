package Interface;

public class Livro {
    private String titutlo;
    private String autor;
    private double valor;

    public Livro() {
    }

    public Livro(String titutlo, String autor, double valor) {
        this.titutlo = titutlo;
        this.autor = autor;
        this.valor = valor;
    }

    public String getTitutlo() {
        return titutlo;
    }

    public void setTitutlo(String titutlo) {
        this.titutlo = titutlo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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
                "\n titutlo:" + titutlo +
                "\n autor:" + autor +
                "\n valor:" + valor;
    }
}
