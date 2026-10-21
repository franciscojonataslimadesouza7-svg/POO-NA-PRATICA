package Lambda;


import refatoracao.Produto;

import java.util.Comparator;

public class ComparadorDePreco implements Comparator<Produto> {
    @Override
    public int compare(Produto o1, Produto o2) {
        return Double.compare(o1.valor(), o2.valor());
    }
}
