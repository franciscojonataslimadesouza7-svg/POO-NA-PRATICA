package default_method_interface;

public interface Veiculo {
    void acelerar();
//    void abastecer();

    default void abastecer(){}

    default void carregar(){}




}
