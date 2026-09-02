package ExercicioPOOQ3;

public class App {
    public static void main(String[] args) {
        Funcionario func = new Funcionario("jonatas", "56468446", 1620.00, 0.02);
        func.setTotalVendas(20000);

        System.out.println("\n-------------------- Folha De Pagamento Funcionario --------------------\n");
        System.out.println("Nome Funcionario: " + func.getNomeFuncionario());
        System.out.println("CPF Funcionario: " + func.getCpf());
        System.out.println("Total Vendas Mês: " + func.getTotalVendas());
        System.out.println("Salario Base Funcionario: " + func.getSalarioBase());
        System.out.println("Aliquota Bonus: " + func.getAliquotaBonus() * 100 + "%");
        System.out.println("Bonus: " + func.CalcularBonus() );
        System.out.println("Salario Funcionario R$: " + func.CalcularSalario());


        Gerente ger = new Gerente("kaio", "5658546844", 2500.00, 0.005);
        ger.setTotalVendas(10000);

        System.out.println("\n-------------------- Folha De Pagamento Gerente --------------------\n");
        System.out.println("Nome Gerente: " + ger.getNomeFuncionario());
        System.out.println("CPF Gerente: " + ger.getCpf());
        System.out.println("Total De Vendas Mês: " + ger.getTotalVendas());
        System.out.println("Salario Base Gerente R$: " + ger.getSalarioBase());
        System.out.println("Bonus Aliquota R$: " + ger.getAliquotaBonus() * 100 + "%");
        System.out.println("Bonus: " + ger.CalcularBonus() );
        System.out.println("Salario Gerente R$: " + ger.CalcularSalario());

        System.out.println("------------------------------------------------------------------");

        Vendedor vend = new Vendedor("luis", "4657464688", 1621.00, 0.01);
        vend.setTotalVendas(5000);

        System.out.println("\n-------------------- Folha De Pagamento Vendedor --------------------\n");
        System.out.println("Nome Vendedor: " + vend.getNomeFuncionario());
        System.out.println("CPF Vendedor: " + vend.getCpf());
        System.out.println("Total de vendas Mês: " + vend.getTotalVendas());
        System.out.println("Salario Base Vendedor R$: " + vend.getSalarioBase());
        System.out.println("Bonus Aliquota R$: " + vend.getAliquotaBonus() * 100 + "%");
        System.out.println("Bonus: " + vend.CalcularBonus() );
        System.out.println("Salario Vendedor R$: " + vend.CalcularSalario());
    }

}
