package Encapsulamento;

public class App {
     public static void main() {

         Pessoa pessoa1 = new Pessoa("jonatas","62332442340", "franc@gmail.com", "88988185449");
//         pessoa.setNome("jonatas");
//         pessoa.setCPF("623.324.423-40");
//         pessoa.setTelefone("(88)98818-5449");

         System.out.println(pessoa1);

         System.out.println("\n---------------------------------------------------\n");

         Pessoa pessoa2 = new Pessoa("jonatas", "62332442340", "88988515746");
         pessoa2.getEmail();

         System.out.println(pessoa2);

         System.out.println("\n---------------------------------------------------\n");

         Pessoa pessoa3 = new Pessoa("jonatas", "franciscojonatas2@gmail.com");
         pessoa3.getTelefone();
         pessoa3.getCPF();

         System.out.println(pessoa3);






//         System.out.println("Nome:" + " " +  pessoa.getNome());
//         System.out.println("CPF:" + " " + pessoa.getCPF());
//         System.out.println("Telefone: " + " " + pessoa.getTelefone());

         // get retornar o valor do atributo
         // set que altera o valor do atributo





    }




}
