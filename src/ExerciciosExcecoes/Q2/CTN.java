package ExerciciosExcecoes.Q2;

import java.util.Scanner;

public class CTN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            try{
                System.out.print("Digite sua idade: ");
                String idade = sc.next();
                System.out.println("Idade: " + Integer.parseInt(idade));
                break;


            } catch (Exception e) {
                System.out.println("idade invalida " + e.getMessage());
                System.out.println("\n Digite Apenas Numeros");
            }
        }
    }
}
