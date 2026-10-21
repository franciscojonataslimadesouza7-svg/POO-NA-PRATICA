package Exceptions;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class App {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Pessoa> pessoas = new ArrayList<>();

        try {
            while (true){
                System.out.print("Digite Seu Nome: ");
                String nome = sc.nextLine();

                System.out.print("Digite Sua Idade: ");
                int idade = sc.nextInt();


                if (nome.isBlank()){
                    throw new MinhaExcecaoExecption("Nome Nao Pode Ser Vazio");
                }

                if (idade <= 0){
                    throw new MinhaExcecaoExecption("Idade: " + idade + "Anos, Invalida");
                }

                if (idade < 18 ){
                    throw new MinhaExcecaoExecption("Pessoas Precisam Ser Maior De Idade ");
                }

                System.out.print("Digite Seu CPF: ");
                String cpf = sc.nextLine();

                if (cpf.isBlank()){
                    throw new MinhaExcecaoExecption("CPF Nao Pode Ser Vazio");
                }


                pessoas.add(new Pessoa(nome, cpf, idade));

            }


        }catch (InputMismatchException e){
            System.out.println("A idade precisa ser um numero" + e.getMessage());
        }catch (MinhaExcecaoExecption e){
            System.out.println("Dados Invalidos " + e.getMessage());
            System.out.println(pessoas);
    }
        System.out.println("LOL" + 1);
}
}
