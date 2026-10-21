package refatoracao;

public class Livro implements Produto{

    private String titulo;
    private String autor;
    protected double valor;

    public Livro(){
    }

    public Livro(String titulo, String autor, double valor) {
        this.titulo = titulo;
        this.autor = autor;
        this.valor = valor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }


    @Override
    public String toString() {
        return
                "\n titulo: " + titulo +
                "\n autor: " + autor +
                "\n valor: " + valor;
    }

    @Override
    public String titulo() {
        return titulo;
    }

    @Override
    public double valor() {
        return this.valor;
    }

    @Override
    public String autor() {
        return this.autor;
    }
}
