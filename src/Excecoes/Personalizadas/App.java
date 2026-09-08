package Excecoes.Personalizadas;
import Excecoes.Personalizadas.Cadastro;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Cadastro c = new Cadastro();
        while (true){
            try {

                Scanner sc = new Scanner(System.in);

                System.out.print("digite seu nome: ");
                String nome = sc.nextLine();

                if (nome.isBlank()){
                    throw new CadastroInvalidoException("o nome nao pode ser null ou vazio");
                }
                if (nome.length() < 3){
                    System.out.println("nome menor que 3 caracteres");
                }

                System.out.print("digite seu cpf: ");
                String cpf = sc.nextLine();


                if (cpf.isBlank()){
                    throw new CadastroInvalidoException("CPF nao pode ser null ou vazio");
                }


                if (cpf.length() != 11){
                    throw new CadastroInvalidoException("CPF invalido");
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());

            }
        }
        }


}
