package ExercicioPOOQ5;

public class App {
    public static void main(String[] args) {
        Gato g = new Gato("patolino", 150);

        System.out.println("Gato");

        g.EmitirSom();
        g.mover();

        System.out.println("\n-------------------\n");

        Cachorro C = new Cachorro("Gaginho", 160);
        System.out.println("Cachorro");
        C.EmitirSom();
        C.mover();
    }
}
