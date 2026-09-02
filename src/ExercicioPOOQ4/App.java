package ExercicioPOOQ4;
import ExercicioPOOQ4.Carro;

import java.sql.SQLOutput;

public class App {
    public static void main(String[] args) {
        Motorista M = new Motorista("jonatas", "45465454545354");
        Carro C = new Carro("celta 2006", "wh0-2006", M);

        System.out.println("\n---------------Motorista---------------\n");
        System.out.println("Nome Motorista: " + M.getNome());
        System.out.println("Numero CNH: " + M.getNumeroCnh());
        System.out.println("\n---------------Ações Carro---------------\n");
        C.ligar();
        C.ligar();
        C.desligar();
        C.desligar();



    }
}
