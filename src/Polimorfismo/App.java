package Polimorfismo;

public class App {
    public static void main(String[] args) {
        Gato g = new Gato();
        System.out.println("Gato");

        g.comer();
        g.emitirsom();

        Cachorro c = new Cachorro();
        System.out.println("\n Cachorro");

        c.comer();
        c.emitirsom();
    }
}
