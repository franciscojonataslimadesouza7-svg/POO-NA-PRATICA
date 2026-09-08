package Excecoes.Personalizadas;

public class CadastroInvalidoException extends RuntimeException {
    public CadastroInvalidoException(String message) {
        super(message);
    }
}
