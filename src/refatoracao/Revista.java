package refatoracao;

public class Revista implements Produto{
    private String titulo;
    private String editora;
    protected double valor;

    public Revista(){
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Revista(String titulo, String editora, double valor) {
        this.titulo = titulo;
        this.editora = editora;
        this.valor = valor;

    }

    @Override
    public String toString() {
        return "Revista{" +
                "titulo='" + titulo + '\'' +
                ", editora='" + editora + '\'' +
                ", valor=" + valor +
                '}';
    }

    @Override
    public String titulo() {
        return this.titulo = titulo;
    }

    @Override
    public double valor() {
        return 0;
    }

    @Override
    public String autor() {
        return this.autor();
    }
}
