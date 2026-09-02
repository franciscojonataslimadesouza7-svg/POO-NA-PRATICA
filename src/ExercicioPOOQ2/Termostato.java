package ExercicioPOOQ2;

public class Termostato {
    private double TemperaturaAtual;
    private double TemperaturaDesejada;
    private String modo;


    public Termostato(double TemperaturaAtual, double TemperaturaDesejada, String modo){
        this.TemperaturaAtual = TemperaturaAtual;
        this.defineTemperatura(TemperaturaDesejada);
        this.alterarModo(modo);
    }

    public void defineTemperatura(double temp){
        if (temp < 16){
            this.TemperaturaDesejada = 16;
            System.out.println("temperatura ajustada para 16 graus");
            return;
        }if (temp > 30){
            this.TemperaturaDesejada = 30;
            System.out.println("temperatura ajustada para 30 graus");
        }
        this.TemperaturaDesejada = temp;
    }

    public void alterarModo(String Novomodo){
        if (Novomodo.equalsIgnoreCase("Resfriar") ||
                Novomodo.equalsIgnoreCase("Aquecer") ||
                Novomodo.equalsIgnoreCase("Desligar")){
            this.modo = Novomodo;
            System.out.println("modo alterado " + this.modo);
        }else{
            System.out.println("modo invalido, os validos sao, Resfriar, Aquecer E Desligar");
            this.modo = "desligar";
        }

    }

    public double getTemperaturaAtual() {
        return TemperaturaAtual;
    }

    public void setTemperaturaAtual(double temperaturaAtual) {
        TemperaturaAtual = temperaturaAtual;
    }

    public double getTemperaturaDesejada() {
        return TemperaturaDesejada;
    }

    public void setTemperaturaDesejada(double temperaturaDesejada) {
        TemperaturaDesejada = temperaturaDesejada;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    @Override
    public String toString() {
        return
                "\n TemperaturaAtual: " + TemperaturaAtual +
                "\n TemperaturaDesejada: " + TemperaturaDesejada +
                "\n modo: " + modo;
    }

    public void executarCiclo(){
        System.out.println("Condição atual: Temperatura Atual: " + TemperaturaAtual + "\n" + " A temperatura Que Pra Ser: " + TemperaturaDesejada + "\n" + " Modo: " + modo);

        if (modo.equalsIgnoreCase("Desligado")){
            System.out.println("o sistema esta desligado");
        }

        if (modo.equalsIgnoreCase("Resfriar")){
            if (TemperaturaAtual > TemperaturaDesejada){
                System.out.println("Ar-condicionado Ligado Pra Resfriar o Quarto");
            }else{
                System.out.println("Resfriou o Suficiente Ar-condicionado Desligado");
            }
        }

        if (modo.equalsIgnoreCase("Aquecer")){
            if (TemperaturaAtual < TemperaturaDesejada){
                System.out.println("Ar-condicionado Ligado Pra Aquecer o quarto");
            }else{
                System.out.println("Aqueceu o Suficiente Ar-condicionado Desligado");
            }
        }




    }
}
