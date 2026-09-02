package Classes_objetos.dominio;


public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria contaDoJonatas = new ContaBancaria();
        contaDoJonatas.dadosCliente = new DadosCliente();
        contaDoJonatas.dadosCliente.endereco = new Endereco();
        contaDoJonatas.dadosCliente.contatos = new Contatos();



        contaDoJonatas.agencia = "234-x";
        contaDoJonatas.numeroDaConta = "123546";
        contaDoJonatas.titular = "jonatas";
        contaDoJonatas.tipoConta = "conta corrente";
        contaDoJonatas.saldo = 1500.00;


        contaDoJonatas.dadosCliente.nomeCompleto = "francisco jonatas";
        contaDoJonatas.dadosCliente.RG = "653245";
        contaDoJonatas.dadosCliente.CPF = "654562";
        contaDoJonatas.dadosCliente.contatos.Email = "franciscojonataslimadesouza7@gmail.com";
        contaDoJonatas.dadosCliente.contatos.telefone = "(88) 9 8818-5449";


        contaDoJonatas.dadosCliente.endereco.rua = "rua zeca felizardo";
        contaDoJonatas.dadosCliente.endereco.numeroDaCasa = "26";
        contaDoJonatas.dadosCliente.endereco.Bairro = "centro";
        contaDoJonatas.dadosCliente.endereco.cidade = "ipaumirim";
        contaDoJonatas.dadosCliente.endereco.Complemento = "em frente a estatua";
        contaDoJonatas.dadosCliente.endereco.Cep = "63340-000";





        ContaBancaria contaUsuario = new ContaBancaria();
        contaUsuario.dadosCliente = new DadosCliente();
        contaUsuario.dadosCliente.endereco = new Endereco();
        contaUsuario.dadosCliente.contatos = new Contatos();


        contaUsuario.agencia = "234-x";
        contaUsuario.numeroDaConta = "123546";
        contaUsuario.titular = "joao";
        contaUsuario.dadosCliente.nomeCompleto = "jose joao";
        contaUsuario.tipoConta = "conta poupança";
        contaUsuario.saldo = 1500.00;
        contaUsuario.dadosCliente.contatos.Email = "josejoao8@gmail.com";
        contaUsuario.dadosCliente.contatos.telefone = "(88) 9 5449-88188";
        contaUsuario.dadosCliente.endereco.rua = "rua nonato rolim";
        contaUsuario.dadosCliente.endereco.Bairro = "centro";
        contaUsuario.dadosCliente.endereco.cidade = "ipaumirim";
        contaUsuario.dadosCliente.endereco.numeroDaCasa = "26";
        contaUsuario.dadosCliente.endereco.Cep = "63340-000";
        contaUsuario.dadosCliente.endereco.Complemento = "em frente a budega";
        contaUsuario.dadosCliente.CPF = "423-221-115.54";
        contaUsuario.dadosCliente.RG = "423-221-115.54";


        System.out.println("\n---------------------------------------SALDO INICIAS DAS CONTAS---------------------------------------");


        System.out.println("saldo inicial da conta de jonatas R$: " + contaDoJonatas.saldo);
        System.out.println("saldo inicial da conta de joao R$: " + contaUsuario.saldo);

        System.out.println("--------------------------------------------------------------------------------------");

        contaDoJonatas.depositar(-500.0);
        contaUsuario.depositar(-150.0);

        System.out.println(contaDoJonatas);;
        System.out.println("-------------------------");
        System.out.println(contaUsuario);



    }

}
