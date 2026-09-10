package ExerciciosExcecoes.Q9;

public class CarrinhoDeCompras {
    private String nome;
    private int quantidade;
    private double preco;

    public CarrinhoDeCompras(){}


    public CarrinhoDeCompras(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void adicionaritem(String nome, int quantidade, double preco){

        if (quantidade <= 0){
            throw new validarProduotException("Quantidade: " + quantidade + " invalida");
        }

        if (preco < 0){
            throw new validarProduotException("preço invalido");

        }
        System.out.println("compra realizada com sucesso ");

        System.out.println("Produto " + nome + " quantidade " + quantidade + " preço R$: " + preco);




    }
}
