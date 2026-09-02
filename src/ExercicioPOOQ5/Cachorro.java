package ExercicioPOOQ5;

public class Cachorro extends Animal{
    public Cachorro(String Nome, int Idade) {
        super(Nome, Idade);
    }

    @Override
    public void EmitirSom() {
    System.out.println("AU AU!");
    }

    @Override
    public void mover() {
        System.out.println("Correendo Atras Da Bola..............");
    }
}
