package Encapsulamento;

import java.util.Objects;

public class Pessoa {
    private String nome;
    private String CPF;
    private String telefone;
    private String email;


    public Pessoa(String nome, String CPF, String email, String telefone) {
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
        this.telefone = telefone;

    }

    public Pessoa(String nome, String CPF, String telefone) {
        this.nome = nome;
        this.CPF = CPF;
        this.telefone = telefone;

    }

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;

    }






    public String getNome() {
        if(nome == null){
            return "o nome esta invalido";

        }
        return nome;

    }


    public void setNome(String nome) {
        if(nome.length() < 2){
            System.out.println("o nome informado e invalido");
            return;
        }
        this.nome = nome;


    }





    public String getCPF() {
        if (CPF == null){
            return "cpf invalido";
        }
        return CPF;
    }

    public void setCPF(String CPF) {
        CPF = CPF.replace(".", "").replace(".", "").replace(".", "").replace("-", "");
        if (CPF.length() != 11){
            System.out.println("cpf invalido");
            return;
        }
        this.CPF = CPF;
    }




    public String getTelefone() {
        if (telefone == null){
            return "telefone invalido";
        }
        return telefone;
    }



    public void setTelefone(String telefone) {
        telefone = telefone.replace("(", "").replace(")", "").replace("-", "");
        if (telefone.length() != 11){
            System.out.println("numero de telefone invalido");
            return;

        }

        this.telefone = telefone;

    }

    public String getEmail() {
        if(Objects.isNull(email)){
            this.email = "email nao cadastrado";
        }


        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    @Override
    public String toString() {
        return "Informações Usuario" +
                "\n nome:'" + nome + '\'' +
                "\n CPF:'" + getCPF() + '\'' +
                "\n telefone:'" + getTelefone() + '\'' +
                " \n email:'" + getEmail() + '\'';
    }
}

