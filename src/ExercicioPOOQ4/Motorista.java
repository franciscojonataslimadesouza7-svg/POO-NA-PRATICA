package ExercicioPOOQ4;

public class Motorista {
    private String nome;
    private String NumeroCnh;

    public Motorista(String nome, String NumeroCnh){
        this.nome = nome;
        this.NumeroCnh = NumeroCnh;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroCnh(){
        return NumeroCnh;
    }

    public void setNumeroCnh(String numeroCnh) {
        NumeroCnh = numeroCnh;
    }

    @Override
    public String toString() {
        return
                "\n nome: " + nome +
                "\n NumeroCnh: " + NumeroCnh;
    }
}
