package ExerciciosExcecoes.Q9;

public class App {
    static void main(String[] args) {


    CarrinhoDeCompras c = new CarrinhoDeCompras();

    try{
        c.adicionaritem("notbook", 1, 2500.00);
        c.adicionaritem("celular", 1, 1500.00);
    } catch (validarProduotException e) {
        throw new validarProduotException("validando a  " + e.getMessage());
    }
}

}
