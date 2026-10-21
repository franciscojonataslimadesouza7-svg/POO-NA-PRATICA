package DesafioMonitoria;

public interface Inimigo {
    default void falaInimigo(){}

    default void receberDano(double danoPosAtaquePersonagem){}

    default void atacarPersonagem(String alvo){}
}
