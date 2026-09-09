package ExerciciosExcecoes.Q4;

import java.util.Scanner;

public class Mc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Digite o primeiro: ");
                String num1 = sc.next();
                System.out.print("Digite o segundo numero: ");
                String num2 = sc.next();
                System.out.println("O resultado da divisao de " + num1 + " / " + num2 + " e: " + Integer.parseInt(num1) / Integer.parseInt(num2));

                break;



            } catch (NumberFormatException e) {
                System.out.println("voce digitou letra (entrada nao numerica) " + e.getMessage());
                System.out.println(" Digite Apenas Numeros");

            } catch (ArithmeticException ex) {
                System.out.println("voce nao pode dividir por 0 " + ex.getMessage());

            }
        }
    }
}
