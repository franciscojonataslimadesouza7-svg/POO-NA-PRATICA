package ExercicioPOOQ7;

public class App {
    public static void main(String[] args) {
        LampadaIntelignte l = new LampadaIntelignte();
        System.out.println("\n---Funcionamento Lampada---\n");
        l.ligar();
        l.ajustarIntesidade(50);
        l.mudarCor("Azul");
    }
}
