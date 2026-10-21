package Static_Default_Method;

public interface Calculadora {
    int calcular(int a, int b);

    static Calculadora somar(){
        return (a, b) -> a + b;
    }
    static  Calculadora multiplicar(){
        return  (a, b) -> a * b;


    }

}
