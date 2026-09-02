package ExercicioPOOQ4;

public class Carro {
    private String Modelo;
    private String Placa;
    private Motorista motorista;
    private boolean ligado;

    public Carro(String Modelo, String Placa, Motorista motorista){
        this.Modelo = Modelo;
        this.Placa = Placa;
        this.motorista = motorista;
        this.ligado = false;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligar(){
        if (motorista == null){
            System.out.println("Não e possivel Ligar o Carro Sem Motorista");
            return;
        }
        if (!ligado){
            ligado = true;
            System.out.println("O Carro Foi ligado");
        }else{
            System.out.println("O Carro Ja Esta Ligado");
        }

    }

    public void desligar(){
        if (motorista == null){
            System.out.println("Não e possivel Desligar o Carro Sem Motorista");
            return;
        }
        if (ligado){
            ligado = false;
            System.out.println("O Carro Foi Desligado");
        }else{
            System.out.println("O Carro Ja Esta Desligado");
        }
    }

    @Override
    public String toString() {
        return
                "\n Modelo: " + Modelo + '\'' +
                "\n Placa: " + Placa + '\'' +
                "\n motorista: " + motorista +
                "\n ligado: " + ligado;
    }
}
