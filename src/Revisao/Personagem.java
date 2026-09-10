package Revisao;

public class Personagem {
    private String nome;
    private int vida;

    public Personagem(){}

    public Personagem(String nome, int vida) {
        if (nome.length() <= 2){
            throw new RuntimeException("nome tem que ser maior que 3 caracteres");
        }
        this.nome = nome;
        this.vida = vida;
    }

    public void atacar(){
        System.out.println(nome + " em ataque com a vida em " + vida);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return
                "\n nome Personagem: " + nome +
                "\n vida: " + vida + "HP";
    }
}
