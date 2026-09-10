package Revisao;

import java.util.Objects;

public class AppArray {
    static void main(String[] args) {
        Produto [] produtos = {
                new Produto("coca-cola", 4.00),
                new Produto("Guarana",5.00),
                new Produto("Shampo", 84.5)
        };

        Produto produtoMaisCaro = new Produto();

        for (Produto p: produtos){
            if (Objects.isNull(produtoMaisCaro.getPreco())){
                produtoMaisCaro = p;
            } else if (p.getPreco() > produtoMaisCaro.getPreco()) {
                produtoMaisCaro = p;

            }
        }
        System.out.println(produtoMaisCaro);
    }
}
