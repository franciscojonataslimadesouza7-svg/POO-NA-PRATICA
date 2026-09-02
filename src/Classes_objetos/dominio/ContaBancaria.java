package Classes_objetos.dominio;

public class ContaBancaria {
    String agencia;
    String numeroDaConta;
    public String titular;
    double saldo;
    String tipoConta;
    DadosCliente dadosCliente;

    public void depositar(Double valorDeposito){
       if(valorDeposito <= 0){
           System.out.println("valor de deposito invalido");
           return;
       }
        saldo += valorDeposito;


    }



    @Override
    public String toString() {
        return "---- Dados ContaBancaria----: " +
                "\nagencia: '" + agencia + '\'' +
                "\n numeroDaConta: '" + numeroDaConta + '\'' +
                "\n titular:'" + titular + '\'' +
                "\n saldo: " + saldo +
                "\n tipoConta: '" + tipoConta + '\'' +
                " dadosCliente: " + dadosCliente;
    }

//    public void exibirDetalhes(){
//        System.out.println("Agencia: " + agencia);
//        System.out.println("Numero Da Conta: " + numeroDaConta);
//        System.out.println("Tipo De Conta: " + tipoConta);
//        System.out.println("Titular: " + titular);
//        System.out.println("Saldo R$: " + saldo);
//        System.out.println("Tipo De Conta: " + tipoConta);
//        System.out.println("nome completo: " + dadosCliente.nomeCompleto);
//        System.out.println("Email: " + dadosCliente.contatos.Email);
//        System.out.println("numero de telefone: " + dadosCliente.contatos.telefone);
//        System.out.println("rua: " + dadosCliente.endereco.rua);
//        System.out.println("numero da casa: " + dadosCliente.endereco.numeroDaCasa);
//        System.out.println("cidade: " + dadosCliente.endereco.cidade);
//        System.out.println("bairro: "+ dadosCliente.endereco.Bairro);
//        System.out.println("CEP: " + dadosCliente.endereco.Cep);
//        System.out.println("complemento: " + dadosCliente.endereco.Complemento);
//        System.out.println("RG: " + dadosCliente.RG);
//        System.out.println("CPF: " + dadosCliente.CPF);
//
//    }




}

