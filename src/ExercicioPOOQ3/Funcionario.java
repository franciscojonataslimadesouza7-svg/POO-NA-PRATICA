package ExercicioPOOQ3;

public class Funcionario {
    private String NomeFuncionario;
    private String cpf;
    private double SalarioBase;
    private double AliquotaBonus;
    private double TotalVendas;

    public Funcionario(String NomeFuncionario, String cpf, double SalarioBase, double AliquotaBonus){
        this.NomeFuncionario = NomeFuncionario;
        this.cpf = cpf;
        this.SalarioBase = SalarioBase;
        this.AliquotaBonus = AliquotaBonus;


    }

    public String getNomeFuncionario() {
        return NomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        NomeFuncionario = nomeFuncionario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        SalarioBase = salarioBase;
    }

    public double getAliquotaBonus() {
        return AliquotaBonus;
    }

    public void setAliquotaBonus(double aliquotaBonus) {
        AliquotaBonus = aliquotaBonus;
    }

    public double getTotalVendas() {
        return TotalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        TotalVendas = totalVendas;
    }

    public double CalcularSalario(){
        return SalarioBase + (AliquotaBonus * TotalVendas);
    }

    public double CalcularBonus(){
        return getAliquotaBonus() * getTotalVendas();
    }
}
