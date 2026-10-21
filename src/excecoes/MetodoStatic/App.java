package excecoes.MetodoStatic;

public class App {
    static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.falar();

       //metodo static posso usar sem instnciar a classe
        Pessoa.caminhar();



    }
}
