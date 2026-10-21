package refatoracao;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Produto> produtos = new ArrayList();

    public void adicionarProduto(Produto produto){
        this.produtos.add(produto);
    }

    public double totalCarrinho(){
        double total = 0;
        for (Produto p : produtos){
            total += p.valor();
        }
        return total;
    }

    public void exibirCarrinho(){
        produtos.forEach(p -> System.out.println(p));
    }

}
