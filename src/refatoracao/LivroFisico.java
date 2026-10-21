package refatoracao;

public class LivroFisico extends Livro implements Promocao{
    public LivroFisico(String titulo, String autor, double valor) {
        super(titulo, autor, valor);

    }

    @Override
    public double valor() {
        return super.valor() * 1.05;
    }

    @Override
    public boolean aplicarDesconto(double desconto) {
        if (desconto > 0.3){
            return false;
        }
        valor -= valor * desconto;
        return true;
    }
}
