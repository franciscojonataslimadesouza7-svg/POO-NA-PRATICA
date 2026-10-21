package refatoracao;

public interface Produto {

    String titulo();
    double valor();
    String autor();

    default double valorTotal(){
        return valor() * valor();
    }

}
