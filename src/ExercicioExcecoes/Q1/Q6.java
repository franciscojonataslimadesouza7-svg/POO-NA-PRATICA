package ExercicioExcecoes.Q1;

import excecoes.NaoPodeDividirPorZeroException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q6 {
    static void main(String[] args) {
        String menu = """
                1 - soma 
                2 - subtração
                3 - multiplicação
                4 - divisao
                0 - Sair
                """;

        Scanner sc = new Scanner(System.in);



        while (true){

            System.out.println(menu);
            System.out.print("Qual Operaçao Deseja Fazer: ");
            int op = sc.nextInt();
            switch (op){

                case 1 -> {
                    try {
                        System.out.println();
                        System.out.println("Soma");

                        System.out.print("Digite o Primeiro Numero: ");
                        int num1 = sc.nextInt();

                        System.out.print("Digite o Segundo Numero: ");
                        int num2 = sc.nextInt();

                        System.out.println();

                        System.out.println("Operação");
                        System.out.println(num1 +  " + " + num2);
                        System.out.println("Resultado: " + somar(num1, num2));

                    }catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }catch (InputMismatchException e){
                        System.out.println(e.getMessage());
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }finally {
                        System.out.println();
                        System.out.println("Encerrando Sistema......");
                        System.out.println();
                    }
                }

                case 2 -> {
                    try {
                        System.out.println();
                        System.out.println("Subtração");

                        System.out.println();

                        System.out.println("Digite o Primeiro Numero: ");
                        int num1 = sc.nextInt();

                        System.out.println("Digite o Segundo Numero: ");
                        int num2 = sc.nextInt();



                        System.out.println();

                        System.out.println("Operação");
                        System.out.println(num1 +  " - " + num2);
                        System.out.println("Resultado " + sub(num1, num2));

                    }catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }finally {
                        System.out.println();
                        System.out.println("Encerrando Operação.......");
                        System.out.println();
                    }


                }

                case 3 -> {
                    try {
                        System.out.println();
                        System.out.println("Multiplicação");

                        System.out.println();

                        System.out.println("Digite o Primeiro Numero: ");
                        int num1 = sc.nextInt();

                        System.out.println("Digite o Segundo Numero: ");
                        int num2 = sc.nextInt();

                        System.out.println();

                        System.out.println("Operação");
                        System.out.println(num1 +  " * " + num2);
                        System.out.println("Resultado " + mult(num1, num2));

                    }catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }finally {
                        System.out.println();
                        System.out.println("Encerrando Sistema......");
                        System.out.println();
                    }
                }

                case 4 -> {
                    try {
                        System.out.println();
                        System.out.println("Divisão");

                        System.out.println();

                        System.out.println("Digite o Primeiro Numero: ");
                        int num1 = sc.nextInt();

                        System.out.println("Digite o Segundo Numero: ");
                        int num2 = sc.nextInt();



                        System.out.println("Operação");
                        System.out.println(num1 +  " * " + num2);
                        System.out.println(div(num1, num2));


                    }catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }catch (NaoPodeDividirPorZeroException e){
                        System.out.println(e.getMessage());
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }finally {
                        System.out.println();
                        System.out.println("Encerrando Sistema......");
                        System.out.println();
                    }
                }

                case 0 -> {
                    System.out.println();
                    System.out.println("Saindo........");
                    return;
                }
        }


        }



    }

    static double somar(int n1, int n2){
       if (n1 < 0 || n2 < 0){
           throw new IllegalArgumentException("Nao pode utilizar numeros negativos");
       }
       return n1 + n2;
    }
    static double sub(int n1, int n2){
       if (n1 < 0 || n2 < 0){
           throw new IllegalArgumentException("Nao pode utilizar numeros negativos");
       }
       return n1 - n2;
    }
    static double mult(int n1, int n2){
       if (n1 < 0 || n2 < 0){
           throw new IllegalArgumentException("Nao pode utilizar numeros negativos");
       }
       return n1 * n2;
    }

    static double div(int n1, int n2){
       if (n1 < 0 || n2 < 0){
           throw new IllegalArgumentException("Nao pode utilizar numeros negativos");
       }

       if(n2 == 0){
           throw new NaoPodeDividirPorZeroException("Nao pode Divisao por zero");
       }
       return n1 / n2;

    }

}
