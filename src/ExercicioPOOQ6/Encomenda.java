package ExercicioPOOQ6;

import java.util.Scanner;

public class Encomenda {
    private double pesoKG;
    private double distanciaKM;
    private double valorDeclarado;


    public Encomenda(){

    }

    public Encomenda(Double pesoKG, double distanciaKM, double valorDeclarado){
        this.pesoKG = pesoKG;
        this.distanciaKM = distanciaKM;
        this.valorDeclarado = valorDeclarado;

    }

    public double calcularFretePadrao(){

        return (pesoKG * 5) + (distanciaKM * 0.50);
    }

    private double calcularValorDclarado(){
        return valorDeclarado * 0.01;
    }

    public void calculaFreteExpresso(){
        double fretePadrao = calcularFretePadrao() + 30;

        double fretexpresso = calcularValorDclarado() + fretePadrao;

        System.out.println("Frete Expresso R$: " + fretexpresso);

    }


}
;