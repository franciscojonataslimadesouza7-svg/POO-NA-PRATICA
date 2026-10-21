package ExercicioExcecoes.Q1.Q9;

public class Aluno {
    private String nome;
    private int idade;
    private double media;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.media = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}
