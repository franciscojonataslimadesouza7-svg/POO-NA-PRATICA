package Lambda;

import refatoracao.Ebook;
import refatoracao.Produto;
import refatoracao.LivroFisico;
import refatoracao.MiniLivro;
import refatoracao.Produto;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {
    static void main(String[] args) {
        List<Produto> livros = new ArrayList<>();

        livros.add(new LivroFisico("POO", "Karl Ki", 150));
        livros.add(new Ebook("HTML E CSS", "Jeniffer", 180));
        livros.add(new Ebook("HTML E CSS", "Jeniffer", 80));
        livros.add(new Ebook("Algoritmos", "Martin", 150));
        livros.add(new MiniLivro("Engenharia dwe Software 1", "Robert C.Martin", 200));

        System.out.println("Lista Inicial " + livros);
        System.out.println("\n");


        livros.sort((a , b) -> Double.compare(a.valor(), b.valor()));
//        System.out.println("Lista Ordenada Pelo Livro: " + livros);

        livros.sort((a, b) -> a.titulo().compareTo(b.titulo()));

//        System.out.println("Lista em Ordem Alfabetica: " + livros);

        FiltroProdutoService fpd = new FiltroProdutoService();

        List<Produto> promocao = fpd.filtra(livros, FiltroProduto.peloValor(50));
//        System.out.println("Livros em Promoção: " + promocao);

        List<Produto> livrosFiltrados = new ArrayList<>();

//
//        livros.forEach(l ->{
//            if (l.valor() < 100.0 && l instanceof Ebook){
//                livrosFiltrados.add(l);
//            }
//        });
        livrosFiltrados= fpd.filtra(livros, FiltroProduto.peloValor(50)
                .and(FiltroProduto.somenteEbook())
                .and(FiltroProduto.mesmoAutor("Jeniffer")));
          System.out.println("Livros Filtrados: " + livrosFiltrados);
//
    }


}
