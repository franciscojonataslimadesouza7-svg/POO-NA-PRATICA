package ExercicioQ8;

public class BombaCombustivel {
    private String tipoCombustivel;
    private double valorPorLitro;
    private double quantidadeCombustivelNaBomba;

    public BombaCombustivel(){

    }

    public BombaCombustivel(String tipoCombustivel, double valorPorLitro, double quantidadeCombustivelNaBomba){
        this.tipoCombustivel = tipoCombustivel;
        this.valorPorLitro = valorPorLitro;
        this.quantidadeCombustivelNaBomba = quantidadeCombustivelNaBomba;
    }


    public void abastecerPorValor(double valor){
        double litros = valor / valorPorLitro;

        if (valorPorLitro > quantidadeCombustivelNaBomba){
            System.out.println("Nao ha combustivel suficiente");
        }else {
            quantidadeCombustivelNaBomba -= valorPorLitro;
            System.out.println("Abastecido: " + tipoCombustivel + litros);
        }
    }

    public void abastecerPorlitro(double litros){
        if (litros > quantidadeCombustivelNaBomba){
            System.out.println("Não há combustivel suficiente na bomba.");
        }else {
            double valorTotal = litros * valorPorLitro;
            quantidadeCombustivelNaBomba -= litros;
            System.out.println("Total a pagar: R$: " + valorTotal);
        }

    }


}
