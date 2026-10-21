package default_method_interface;

public class Ferrari implements VeiculoCombustao {

    @Override
    public void abastecer() {
        System.out.println("Ferrari Abastecendo......");
    }

    @Override
    public void acelerar() {
        System.out.println("Ferrari Acelerando.........");
    }
}
