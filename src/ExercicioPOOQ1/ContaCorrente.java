package ExercicioPOOQ1;

public class ContaCorrente extends ContaBancaria{
    private double chequeEspecial;

    public ContaCorrente(Cliente cliente, String agencia, String conta, double saldo, double chequeEspecial) {
        super(cliente, agencia, conta, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }


    public void sacar(double valor) {
        if (valor <= 0){
            System.out.println("saque invalido");
            return;
        }
        double saldodisponivel = getSaldo() + chequeEspecial;

        if (valor > saldodisponivel){
            System.out.println("Saque Nao Autorizado, limite insuficiente");
            System.out.println("Saldo Disponivel Com o Cheque Especial R$: " + saldodisponivel);
            return;
        }

        if (valor > getSaldo()){
            double restante = valor - getSaldo();
            setSaldo(0);
            chequeEspecial -= restante;
        }else {
            setSaldo(getSaldo() - valor);
        }

        System.out.println("Saque de R$: " + valor + " realizado com sucesso");
        System.out.println("saldo Atual R$: " + getSaldo() + " saldo do cheque especial R$: " + chequeEspecial);
    }

}
