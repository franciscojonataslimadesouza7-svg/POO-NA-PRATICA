package ExercicioExcecoes.Q1;

import java.util.Scanner;

public class Q7 {
    static void main(String[] args) {
        // String [] coisas = {"12.5", "phguigou", "20.5", "y8fgigby" }
        String [] coisas =  new String[4];


     while (true){
         Scanner sc = new Scanner(System.in);
         System.out.println();
         System.out.println("Digite um Numero Valido: ");
         String num1 = sc.nextLine();
         System.out.println("Digite um Numero Valido: ");
         String num2 = sc.nextLine();
         System.out.println("Digite um Numero Valido: ");
         String num3 = sc.nextLine();
         System.out.println("Digite um Numero Valido: ");
         String num4 = sc.nextLine();


         coisas[0] = num1;
         coisas[1] = num2;
         coisas[2] = num3;
         coisas[3] = num4;


         for(String c : coisas){
             try {
                 double ndecimal = Double.parseDouble(c);
                 System.out.println();
                 System.out.println("Convertido: " + ndecimal);
             }catch (NumberFormatException e){
                 System.out.println("O Elemento " + c + " Nao e Um Numero Valido");
             }
         }
     }


    }
}
