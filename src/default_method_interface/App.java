package default_method_interface;

public class App {
    static void main(String[] args) {
        Veiculo fusca = new Fusca64();
        System.out.println("\n");
        System.out.println("Fusca64");
        fusca.abastecer();
        fusca.acelerar();
        System.out.println("\n");

        System.out.println("Minidolph");
        Minidolph md = new Minidolph();
        md.carregar();
        md.acelerar();

        System.out.println("\n");
        System.out.println("Ferrari");

        VeiculoCombustao ferrari = new Ferrari();
        ferrari.abastecer();
        ferrari.acelerar();

        System.out.println("\n");
        System.out.println("Byd");

        VeiculoEletrico Byd = new Byd();
        Byd.carregar();
        Byd.acelerar();
    }
}
