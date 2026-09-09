package ExerciciosExcecoes.Q5;

import java.util.Scanner;

public class Gref {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true)

         try{
            System.out.println("\n Abrindo Arquivo...........");

            System.out.print("\n Digite um numero: ");
            String Texto = sc.nextLine();

           int numero = Integer.parseInt(Texto);
            System.out.println("numero convertido: " + numero);
            break;



        } catch (NumberFormatException e) {
            System.out.println("\n Mensagem Erro");
            System.out.println("o texto nao e um numero valido ");
            System.out.println(e.getMessage());
        }
    }
}
