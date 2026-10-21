package Interface;

public class LivroFisico extends Livro{

    public LivroFisico(String titutlo, String autor, double valor) {
        super(titutlo, autor, valor);
    }

    @Override
    public double getValor() {
        return super.getValor() * 1.05;
    }
}
