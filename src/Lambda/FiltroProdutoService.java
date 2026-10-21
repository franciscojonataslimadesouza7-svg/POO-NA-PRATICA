package Lambda;

import refatoracao.Produto;

import java.util.ArrayList;
import java.util.List;

public class FiltroProdutoService {
    public List<Produto> filtra(List<Produto> produtos, FiltroProduto filtroProduto) {

        List<Produto> produtosFiltrados = new ArrayList<>();

        for(Produto p : produtos){
            if(filtroProduto.aceita(p)){
                produtosFiltrados.add(p);
            }
        }
        return produtosFiltrados;
    }
}
