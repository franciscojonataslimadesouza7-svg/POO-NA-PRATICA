package default_method_interface;

public class Byd implements VeiculoEletrico{
    @Override
    public void carregar() {
        System.out.println("Byd Carregando %............");
        System.out.println("Teu Pai Sabe Que Tu Gosta de Rapazes");
    }

    @Override
    public void acelerar() {
        System.out.println("Byd Acelerando.............");
    }
}
