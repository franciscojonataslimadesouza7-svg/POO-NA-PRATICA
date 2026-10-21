package Streams.Aluno;

public enum Disciplinas {
    ALGORITMOELOGICADEPROGRAMACAO("Algoritmo e logica De Programação"),
    PROGRAMACAOORIENTADAAOBJETOS("POO"),
    CALCULOI("Calculo I"),
    BANCODEDADOS("BD");


    private String nomeDisciplina;

    Disciplinas(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }
}
