package ExercicioPOOQ3;

public class Vendedor extends Funcionario {

    public Vendedor(String NomeFuncionario, String cpf, double SalarioBase, double AliquotaBonus) {
        super(NomeFuncionario, cpf, SalarioBase, 0.01);
    }

    @Override
    public double CalcularSalario() {
       return getSalarioBase() + (getAliquotaBonus() * getTotalVendas());
    }
}
