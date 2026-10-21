package Streams.Aluno;

import Optional.Genero;
import Streams.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    static void main(String[] args) {
        List<Boletim> boletims = getBoletim();
        boletims.forEach(Boletim::calcularResultado);

        List<Boletim> aprovados = boletims.stream()
                .filter(b -> b.getDisciplinas().stream()
                        .allMatch(d-> d.getResultado().equals(Resultado.APROVADO))
                ).toList();

//        System.out.println(aprovados);

        boletims.forEach(b -> {
            b.getDisciplinas().forEach(d -> System.out.println(d.getNome()));
        });

        Set<Disciplina> comFlatMap = boletims.stream()
                .flatMap(b -> b.getDisciplinas().stream())
                .collect(Collectors.toSet());

        System.out.println();

        System.out.println("*********** Com Flat ***********");

//        System.out.println(comFlatMap);

        comFlatMap.forEach(d -> System.out.println(d.getNome()) );

        System.out.println("*********** Agrupado Por Valores ***********");

        Map<Pessoa, List<Boletim>> AgrupandoPorAluno =
                boletims.stream().collect(Collectors.groupingBy(Boletim::getPessoa));

        AgrupandoPorAluno.forEach(((pessoa, x) -> {
            System.out.println("Aluno: " + pessoa.getNome());
            x.forEach(b -> System.out.println(b.getDisciplinas()));
            System.out.println();
        }));

    }



    public static List<Boletim> getBoletim(){
        Pessoa ana = new Pessoa("ana", 25, Genero.FEMININO, "ana@gmail.com" );
        Pessoa Pedro = new Pessoa("Pedro", 15, Genero.MASCULINO, "Pedro@gmail.com" );
        Pessoa Maria = new Pessoa("Maria", 40, Genero.FEMININO, "Maria@gmail.com" );
        Pessoa Fernanda = new Pessoa("Fernanda", 16, Genero.FEMININO, "Fernanda@gmail.com" );
        Pessoa Antonio = new Pessoa("Antonio", 38, Genero.MASCULINO, "antonio@gmail.com" );
        Pessoa joaoaura= new Pessoa("joaoaura", 49, Genero.MASCULINO, "joaoaura@gmail.com" );

        Boletim boletimAna = new Boletim(ana, List.of(new Disciplina(Disciplinas.ALGORITMOELOGICADEPROGRAMACAO,
                List.of(5.5, 8.5, 9.5), null, 0.0),
                new Disciplina(Disciplinas.BANCODEDADOS,
                        List.of(7.0, 7.5, 8.5), null, 0.0)));

        Boletim boletimPedro = new Boletim(Pedro, List.of(new Disciplina(Disciplinas.PROGRAMACAOORIENTADAAOBJETOS,
                List.of(5.5, 8.5, 9.5), null, 0.0),
                new Disciplina(Disciplinas.CALCULOI,
                        List.of(6.5, 7.5, 8.5), null, 0.0)));


        Boletim boletimMaria = new Boletim(Maria, List.of(new Disciplina(Disciplinas.ALGORITMOELOGICADEPROGRAMACAO,
                List.of(5.5, 8.5, 9.5), null, 0.0),
                new Disciplina(Disciplinas.BANCODEDADOS,
                        List.of(6.5, 7.5, 9.0), null, 0.0)));


        Boletim boletimFernanda = new Boletim(Fernanda, List.of(new Disciplina(Disciplinas.BANCODEDADOS,
                List.of(5.5, 8.5, 9.5), null, 0.0),
                new Disciplina(Disciplinas.CALCULOI,
                        List.of(1.0, 1.5, 2.0), null, 0.0)));


        Boletim boletimAntonio = new Boletim(Antonio, List.of(new Disciplina(Disciplinas.ALGORITMOELOGICADEPROGRAMACAO,
                List.of(8.5, 1.5, 10.0), null, 0.0),
                new Disciplina(Disciplinas.CALCULOI,
                        List.of(7.0, 6.5, 1.0), null, 0.0)));

        Boletim boletimjoaoaura = new Boletim(joaoaura, List.of(new Disciplina(Disciplinas.PROGRAMACAOORIENTADAAOBJETOS,
                List.of(9.5, 7.5, 7.0), null, 0.0),
                new Disciplina(Disciplinas.CALCULOI,
                        List.of(7.0, 7.5, 8.8), null, 0.0)));

        List<Boletim> boletims =
                new ArrayList<>(List.of(boletimAna, boletimAntonio, boletimFernanda, boletimjoaoaura, boletimPedro, boletimMaria));
       return boletims;
    }

}
