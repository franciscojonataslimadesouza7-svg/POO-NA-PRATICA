package ExerciciosExcecoes.Q7;
import  ExerciciosExcecoes.Q7.IdadeInvalida;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IdadeInvalida id = new IdadeInvalida();

        System.out.print("Digite Sua Idade: ");
        int idade = sc.nextInt();

        try{
            id.cadastrarIdade(idade);

        } catch (IdadeInvalidaException e) {
            System.out.println(e.getMessage());
        }


    }
}
