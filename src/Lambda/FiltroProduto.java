package Lambda;

import refatoracao.Ebook;
import refatoracao.Produto;

@FunctionalInterface
public interface FiltroProduto {

    boolean aceita(Produto produto);

    static FiltroProduto peloValor(double valor){
        return produto -> produto.valor() <= valor;
    }

    static FiltroProduto somenteEbook(){
        return produto -> produto instanceof Ebook;
    }

    static  FiltroProduto mesmoAutor(String autor){
        return produto -> produto.autor().equalsIgnoreCase(autor);
    }

    default  FiltroProduto and(FiltroProduto filtroProduto){
        return  produto -> this.aceita(produto) || filtroProduto.aceita(produto);
    }




}
