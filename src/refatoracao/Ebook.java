package refatoracao;

public class Ebook extends Livro implements Promocao{
    public Ebook(String titulo, String autor, double valor) {
        super(titulo, autor, valor);
    }

    @Override
    public boolean aplicarDesconto(double desconto) {
        return false;
    }
}
