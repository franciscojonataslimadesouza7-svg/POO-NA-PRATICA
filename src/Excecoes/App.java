package Excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int opcao;

        String menu ="\n digite -1 para sair ou 0 para continuar";

        while (true){
            try{
                System.out.print(menu + "\n");
                System.out.print("\n Digite: ");
                opcao = sc.nextInt();

                if (opcao == -1){
                    System.out.println("Encerrando Sistema........");
                    break;
                } else if (opcao != -1 && opcao != 0) {
                    System.out.println();
                    System.out.print("\n Valor Invalido Digite (-1 - sair, 0 - Continuar): ");
                    opcao = sc.nextInt();

                }

                System.out.print("\n digite o primeiro numero: ");
                num1 = sc.nextInt();

                System.out.print(" digite o segundo numero: ");
                num2 = sc.nextInt();

                System.out.println("\n Resultado: " + num1/num2  + "\n");

            } catch (InputMismatchException e) {
                System.out.println("digite um numero inteiro positivo");
                sc.next();
            } catch (ArithmeticException e) {
                System.out.println("nao e possivel fazer divisao por zero");;
            }
            }

    }
}
