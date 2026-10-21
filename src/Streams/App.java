package Streams;

import Optional.Genero;

import java.util.List;

public class App {
    public static List<Pessoa> getPessoas(){
        return List.of(
            new Pessoa("Jose", 20, Genero.MASCULINO, "jose@email.com" ),
            new Pessoa("Maria", 52, Genero.FEMININO, "maria@email.com" ),
            new Pessoa("Lara", 16, Genero.FEMININO, "lara@email.com" ),
            new Pessoa("Luiz", 17, Genero.MASCULINO, "luiz@email.com" ),
            new Pessoa("Roberta", 35, Genero.FEMININO, "roberto@email.com" )
        );
    }
    static void main(String[] args) {
        List<Pessoa> pessoas = getPessoas(); // ler prmeiro, depois tipa e atribui o tipo por inferencia

        pessoas.forEach(p -> System.out.println(p));  // expressao lambda
//        pessoas.forEach(System.out::println); // sout pela referencia ao metodo


        List<Pessoa> generoFeminino = pessoas.stream()
                .filter(p -> p.getGenero()
                        .equals(Genero.FEMININO) && p.getIdade() > 18).toList();

        System.out.println("Todo o Objeto  " + generoFeminino);

        System.out.println();

        List<String> generoFemininoSomenteNomeEIdade = pessoas.stream()
                .filter(p -> p.getGenero()
                        .equals(Genero.FEMININO))
                        .map(Pessoa::getNome).toList();

        System.out.println("Pelo Nome");
        System.out.println();
        System.out.println(generoFemininoSomenteNomeEIdade);
    }
}
