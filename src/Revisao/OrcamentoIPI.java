package Revisao;

public class OrcamentoIPI {
    private Orcamento orcamento;

    public OrcamentoIPI(Orcamento orcamento){
        this.orcamento = orcamento;
    }

    public double calcularOrcamentoIPI(){
        return this.orcamento.calcularImposto();
    }

}
