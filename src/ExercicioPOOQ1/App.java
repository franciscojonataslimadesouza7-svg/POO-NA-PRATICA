package ExercicioPOOQ1;

public class App {
    public static void main(String[] args) {
       Cliente cli = new Cliente("jonatas", "3262656566", "554384683", "246545346");

       ContaCorrente ContCr = new ContaCorrente(cli, "037", "35438254544", 1000.00, 2000.00);

       ContaPoupanca ContPp = new ContaPoupanca(cli, "037", "537468783387", 1500, 0.07);

        System.out.println("---Dados Conta ContaCorrente---");
        System.out.println(ContCr);
        System.out.println("\n");

        System.out.println("--Dados Conta Poupança---");
        System.out.println(ContPp);
        System.out.println("\n");

        System.out.println("---Conta Corrente---");
        ContCr.depositar(500);
        ContCr.sacar(1500);
        ContCr.sacar(5000.00);

        System.out.println("\n");

        System.out.println("---Conta Poupança---");

        ContPp.depositar(500.00);
        ContPp.aplicarRendimento();
        ContPp.sacar(600.00);



    }
}
