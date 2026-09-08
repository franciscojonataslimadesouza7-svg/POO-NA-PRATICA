package Excecoes.Personalizadas;

import java.util.Scanner;

public class Cadastro {
    public void cadastrar(String nome, String cpf){
        if (nome.isBlank()){
            throw new CadastroInvalidoException("o nome nao pode ser null ou vazio");
        }
        if (cpf.length() != 11){
            throw new CadastroInvalidoException("CPF invalido, Tem Que Ser 11 Digitos");
        }
        System.out.println("Cadastro do usuario: " + nome + "Portador Do CPF: " + cpf);
    }
}
