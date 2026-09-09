package ExerciciosExcecoes.Q8;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ContaBancaria cb = new ContaBancaria();
        cb.saldo = 10000;

        Scanner sc = new Scanner(System.in);

        while (true){
            try{
                System.out.print("Digite Valor a Sacar: ");
                double valor = sc.nextDouble();
                cb.sacar(valor);
                System.out.println("saque de: " + valor + " Realizado Com Sucesso!");
                System.out.println("saldo atual: " + cb.saldo);
                break;

            } catch (SaldoInsuficienteException e) {
                System.out.println(e.getMessage());
            }
        }
        }


}
