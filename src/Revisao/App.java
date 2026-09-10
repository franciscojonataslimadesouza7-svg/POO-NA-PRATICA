package Revisao;

public class App {
    public static void main(String[] args) {

        Personagem hero1 = new Personagem();
        hero1.setNome("jonatas");
        hero1.setVida(10);
        hero1.atacar();

        Personagem hero2 = new Personagem("jobson", 50);

        System.out.println("\n Heroi 1");

        System.out.println(hero1);
        hero1.atacar();

        System.out.println("\n Heroi 2");
        System.out.println(hero2);
        hero2.atacar();

        System.out.println("-------------------------------------------");

        System.out.println("\n Guerreiro");
        try {
            Guerreiro g = new Guerreiro("Jonatas2", 100, true);

            System.out.println(g);
            g.atacar();

            System.out.println("\n Bruxo");

            Bruxo b = new Bruxo("Kaio", 10, true);
            System.out.println(b);
            b.atacar();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }


    }
}
