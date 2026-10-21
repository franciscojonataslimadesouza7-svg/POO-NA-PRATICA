package DesafioMonitoria;

public interface Personagem {
    default void atacar(String alvo){}
    default void falaPersonagem(){}

    default void receberDano(double danoPosAtaque){}
}
