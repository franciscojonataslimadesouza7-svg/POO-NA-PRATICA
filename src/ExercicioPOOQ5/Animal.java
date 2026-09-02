package ExercicioPOOQ5;

public class Animal {
    private String Nome;
    private int Idade;

    public Animal(String Nome, int Idade){
        this.Nome = Nome;
        this.Idade = Idade;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome){
        this.Nome = nome;
    }

    public int getIdade(){
        return Idade;
    }

    public void setIdade(int idade) {
        this.Idade = idade;
    }

    public void EmitirSom(){

    }

    public void mover(){

    }
}
