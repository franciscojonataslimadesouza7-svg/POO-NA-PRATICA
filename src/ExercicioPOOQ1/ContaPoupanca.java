package ExercicioPOOQ1;

public class ContaPoupanca extends ContaBancaria{
    private double taxaRendimento;

    public ContaPoupanca(Cliente cliente, String agencia, String conta, double saldo, double taxaRendimento) {
        super(cliente, agencia, conta, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento(){
        return taxaRendimento;
    }

    public void setTaxaRendimento(){
        this.taxaRendimento = taxaRendimento;
    }

    public double AplicarRendimento(double taxaRendimento){
        return getSaldo() + getSaldo() * taxaRendimento;

    }

    public void aplicarRendimento(){
        double rendimento = getSaldo() * taxaRendimento;
        setSaldo(getSaldo() + rendimento);
        System.out.println("Rendimento Aplicado R$: " + rendimento);
        System.out.println("Saldo Atual R$: " + getSaldo());
    }


}
