package ExerciciosExcecoes.Q8;

public class ContaBancaria {
    public double saldo;

    public void sacar(double valor) throws SaldoInsuficienteException{

        if (valor > saldo){
          throw new SaldoInsuficienteException("Saldo Insuficiente");
        }

        if (valor < 0){
            throw new SaldoInsuficienteException("valor invalido");
        }
        saldo -= valor;

    }
}
