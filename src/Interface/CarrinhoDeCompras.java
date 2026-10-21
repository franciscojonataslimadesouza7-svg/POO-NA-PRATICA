package Interface;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Livro> livros = new ArrayList<>();
    private List<Revista> revistas = new ArrayList<>();


    public void adicionarLivro(Livro livro){
        this.livros.add(livro);
    }
    public void adicionarRevista(Revista revista){
        this.revistas.add(revista);
    }
    public double totalCarrinho(){
        double total = 0;
        for (Livro l : livros){
            total += l.getValor();

            for (Revista r : revistas){
                total += r.getValor();
            }
        }
        return total;

    }


    public void exibirCarrinho(){
        livros.forEach(l -> System.out.println(l.toString()));
        revistas.forEach(r -> System.out.println(r.toString()));
    }

}
