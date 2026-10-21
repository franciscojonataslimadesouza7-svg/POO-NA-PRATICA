package ExercicioExcecoes.Q1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q8 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String menu = """
                  \n
                       Opções
                1 - Digitar Numeros Inteiros
                ! - sair
                """;

        while (true){
            System.out.println();
            System.out.println(menu);
            System.out.print("Digite Opção: ");
            String op = sc.nextLine();


            switch (op){
                case "1" -> {
                    try {
                        System.out.println();
                        System.out.println("Digite os Numeros");
                        System.out.println();

                        System.out.print("Digite um Numero Inteiro: ");
                        int num1 = sc.nextInt();
                        System.out.print("Digite um Numero Inteiro: ");
                        int num2 = sc.nextInt();
                        System.out.print("Digite um Numero Inteiro: ");
                        int num3 = sc.nextInt();
                        System.out.print("Digite um Numero Inteiro: ");
                        int num4 = sc.nextInt();
                        System.out.print("Digite um Numero Inteiro: ");
                        int num5 = sc.nextInt();
                        sc.nextLine();

                        System.out.println();

                        System.out.println("Numeros Digitados");
                        System.out.println(num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5);

                        if (num1 < 0 || num2 < 0 || num3 < 0 || num4 < 0 || num5 < 0){
                            throw new IllegalArgumentException("O numero nao pode ser negativo");
                        }

                    }catch (InputMismatchException e){
                        System.out.println("Digite Apenas Numeros " + e.getMessage());
                    }catch (NumberFormatException e){
                        System.out.println("Digite Apenas Numeros Inteiros " + e.getMessage());
                    }catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }

                }

                case "!" ->{
                    System.out.println("Saindo............");
                    return;
                }
            }
        }
    }
}
