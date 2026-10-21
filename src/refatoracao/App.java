package refatoracao;



public class App {
    static void main(String[] args) {

        Produto LivroFisico = new LivroFisico("Clean code","Robert C. Martin", 250);

        Produto ebook = new Ebook("Engenharia de Software", "Ian Sommerville", 300);

        Produto minilivro = new MiniLivro("UML", "Ralph Clark", 220);

        Produto revista = new Revista("SBC", "Moderna", 400);

        CarrinhoDeCompras cProdutos = new CarrinhoDeCompras();

        cProdutos.adicionarProduto(LivroFisico);
        cProdutos.adicionarProduto(ebook);
        cProdutos.adicionarProduto(minilivro);
        cProdutos.adicionarProduto(revista);

        cProdutos.exibirCarrinho();
        cProdutos.totalCarrinho();



    }
}
