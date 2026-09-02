package ExercicioPOOQ3;

public class Gerente extends Funcionario{
    public Gerente(String NomeFuncionario, String CPF, double SalarioBase, double AliquotaBonus) {
        super(NomeFuncionario, CPF, SalarioBase, 0.005);
    }

    @Override
    public double CalcularSalario() {
        return getSalarioBase() + (getAliquotaBonus() * getTotalVendas());

    }


}
