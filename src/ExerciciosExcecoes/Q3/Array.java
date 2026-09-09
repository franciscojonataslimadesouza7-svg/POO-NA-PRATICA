package ExerciciosExcecoes.Q3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            try{
                String [] nome = new String[]{"jose", "josa", "sajo", "uis", "jonatas"};
                int opcao = 0;
                System.out.print("Digite (-1 - sair, 0 - continuar): ");
                opcao = sc.nextInt();


                if (opcao == -1){
                    System.out.println("Encerrando Sistema.........");
                    break;
                }

                System.out.print("digite um indice entre 0 e 4: ");
                int posicao = sc.nextInt();
                System.out.println(nome[posicao]);




            } catch (Exception e) {
                System.out.println("Indice do array Invalido " + e.getMessage());
            }
        }





    }



}
