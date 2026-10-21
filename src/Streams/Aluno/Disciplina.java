package Streams.Aluno;

import java.util.List;
import java.util.Objects;

public class Disciplina {
    private Disciplinas nome;
    private Resultado resultado;
    List<Double> notas;
    private Double Media;

    public Disciplina(){}

    public Disciplina(Disciplinas nome, List<Double> notas, Resultado resultado, Double media) {
        this.nome = nome;
        this.notas = notas;
        this.resultado = resultado;
        this.Media = media;
    }


    public Disciplinas getNome() {
        return nome;
    }

    public void setNome(Disciplinas nome) {
        this.nome = nome;
    }

    public Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    public Double getMedia() {
        return Media;
    }

    public void setMedia(Double media) {
        Media = media;
    }

    public Disciplina(Double media) {
        this.Media = media;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Disciplina that = (Disciplina) o;
        return nome == that.nome;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    @Override
    public String toString() {
        return "\n" +
                "\n nome Disciplina: " + nome +
                "\n resultado: " + resultado +
                "\n notas: " + notas +
                "\n Media: " + Media;
    }
}
