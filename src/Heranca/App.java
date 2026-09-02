package Heranca;


public class App {
    public static void main(String[] args){
        PessoaJuridica Pj = new PessoaJuridica();

        Pj.setEndereco(new Endereco("Rua f", "centro", "ipaumirim", 26));
        Pj.setContato(new Contato("88988185449", "francis@gmail.com"));


        Pj.setNome("Spacex");
        Pj.setCnpj("6543546854");

        PessoaFisica pessoaF = new PessoaFisica("jonatas",
                new Endereco("Rua K", "centro", "ipaumirim", 26),
                new Contato("88981804781", "fran@gmail.com"),"84654564564645"
                );

        System.out.println(Pj);
        System.out.println("--------------------------------------------------------");
        System.out.println(pessoaF);





    }
}
