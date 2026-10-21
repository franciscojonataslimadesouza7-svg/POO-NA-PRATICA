package default_method_interface;

public class Fusca64 implements Veiculo {

    @Override
    public void acelerar() {

        System.out.println("Fusca Acelerando.......");

    }

    @Override
    public void abastecer() {

        System.out.println("Fusca Abastecendo.......");
    }
}
