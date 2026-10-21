package excecoes;

public class NaoPodeDividirPorZeroException extends RuntimeException {
    public NaoPodeDividirPorZeroException(String msg) {
        super(msg);
    }
}
