package refatoracao;

public class MiniLivro extends Livro implements Promocao{
    public MiniLivro(String titulo, String autor, double valor) {
        super(titulo, autor, valor);
    }

    @Override
    public boolean aplicarDesconto(double desconto) {
        return false;
    }
}
