package ExercicioPOOQ1;

public class ContaBancaria{
    private Cliente cliente;
    private String agencia;
    private String conta;
    private double saldo;

    public ContaBancaria(){

    }

    public ContaBancaria(Cliente cliente, String agencia, String conta, double saldo) {
        this.cliente = cliente;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia){
        this.agencia = agencia;
    }

    public String getConta(){
        return conta;
    }

    public void setConta(String conta){
        this.conta = conta;

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return
                "\n cliente: " + cliente +
                "\n agencia: " + agencia +
                "\n conta: " + conta +
                "\n saldo: " + saldo;
    }

    public void depositar(double deposito){
        if (deposito <= 0){
            System.out.println("valor do deposito invalido");
            return;
        }
        this.saldo += deposito;
        System.out.println("Deposito De R$: " + deposito + " Realizado com sucesso");
        System.out.println("Saldo Atual R$: " + this.saldo);
    }

    public void sacar(double valor){
        if (valor <= 0){
            System.out.println("valor de saque invalido tente novamente");
            return;

        }if (valor > saldo) {
            System.out.println("saque nao autorizado, saldo insuficiente");
            System.out.println("saldo disponivel R$: " + this.saldo);
            return;

        }
        saldo -= valor;
        System.out.println("Saque De R$: " + valor + " Realizado com sucesso");
        System.out.println("Saldo Atual R$: " + this.saldo);
    }
}


