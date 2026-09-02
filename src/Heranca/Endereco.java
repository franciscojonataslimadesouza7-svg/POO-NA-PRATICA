package Heranca;

public class Endereco {
    private String bairro;
    private String rua;
    private String cidade;
    private int numero;

    public Endereco(){

    }

    public Endereco(String rua, String bairro, String cidade, int numero) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    @Override
    public String toString() {
        return "bairro: " + bairro + '\'' +
                ", rua: " + rua + '\'' +
                ", cidade: " + cidade + '\'' +
                ", numero: " + numero +'\'' ;
    }
}
