package Static_Default_Method;

public class App {
    static void main(String[] args) {
        System.out.println("\n");
        System.out.println("Somando");
        Calculadora somar = Calculadora.somar();
        System.out.println(somar.calcular(5, 10));
        System.out.println("\n");
        System.out.println("Multiplicando");
        Calculadora multiplicar = Calculadora.multiplicar();
        System.out.println(multiplicar.calcular(5, 10));

    }
}
