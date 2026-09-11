package ExerciciosExcecoes.Q10;

import java.nio.channels.ScatteringByteChannel;
import java.util.Enumeration;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("SELECIONE A OPERAÇAO");
            System.out.println("1 - Somar \n" +
                    "2 - Subtrair \n" +
                    "3 - Multiplicar \n" +
                    "4 - Dividir  \n" +
                    "5 - Sair");

            System.out.print("Digite a Operação: ");
            String opcao = sc.next();


            double num1;
            double num2;

            try {
                switch (opcao) {
                    case "1" -> {
                        System.out.print("digite o primeiro numero: ");
                        num1 = sc.nextDouble();


                        System.out.print("digite o segundo numero: ");
                        num2 = sc.nextDouble();

                        double calcularSoma = num1 + num2;
                        System.out.println("O resultado Da soma de " + num1 + " + " + num2 + " = " + calcularSoma);

                    }

                    case "2" -> {
                        System.out.print("digite o primeiro numero: ");
                        num1 = sc.nextDouble();


                        System.out.print("digite o segundo numero: ");
                        num2 = sc.nextDouble();

                        double calcularSubtracao = num1 - num2;
                        System.out.println("O resultado Da subtraçao de " + num1 + " - " + num2 + " = " + calcularSubtracao);

                    }

                    case "3" -> {
                        System.out.print("digite o primeiro numero: ");
                        num1 = sc.nextDouble();

                        System.out.print("digite o segundo numero: ");
                        num2 = sc.nextDouble();

                        double calcularMultiplicacao = num1 * num2;
                        System.out.println("O resultado Da subtraçao de " + num1 + " * " + num2 + " = " + calcularMultiplicacao);
                    }

                    case "4" -> {
                        System.out.print("digite o primeiro numero: ");
                        num1 = sc.nextDouble();

                        System.out.print("digite o segundo numero: ");
                        num2 = sc.nextDouble();

                        if (num1 == 0 || num2 == 0){
                            throw new ValidandodivisaoException("nao e possivl fazer dvisao por zero");
                        }

                        double calcularDivisao = num1 / num2;
                        System.out.println("O resultado Da divisao de " + num1 + " / " + num2 + " = " + calcularDivisao);
                    }

                    case "5" -> {
                        System.out.println("Saindo Da Calculadora..........");
                        return;
                    }

                    default -> System.out.println("opçao invalida");
            }

        }catch (ValidandodivisaoException e){
                System.out.println("nao e possivel fazer divisao por zero " + e.getMessage());
            }catch (InputMismatchException exception){
                sc.next();
                System.out.println("Entrada Invalida, Digite apenas numeros " + exception.getMessage());
            }finally {
                System.out.println("Operação concluida");
            }

        }

}
}