package Revisao;

public class Main {
    public static void main(String[] args) {
        Orcamento orcamento1= new Orcamento(4.5, 500);
        Orcamento orcamento2= new Orcamento(2.5, 700);

        OrcamentoICMS Icms = new OrcamentoICMS(orcamento1);
        OrcamentoICMS IPI = new OrcamentoICMS(orcamento2);

        System.out.println("ICMS: " + Icms.calcularIcms());
        System.out.println("IPI: " + IPI.calcularIcms());

    }
}
