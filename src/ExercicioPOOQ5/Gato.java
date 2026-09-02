package ExercicioPOOQ5;

public class Gato extends Animal{
    public Gato(String Nome, int Idade) {
        super(Nome, Idade);
    }

    @Override
    public void EmitirSom() {
        System.out.println("MIAU MIAU");
    }

    @Override
    public void mover() {
        System.out.println("Correndo No Telhado");
    }
}
