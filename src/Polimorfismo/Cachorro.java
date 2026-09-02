package Polimorfismo;

public class Cachorro extends Animal{

    @Override
    public void emitirsom() {
        System.out.println("Au Au!");
    }

    @Override
    public void comer() {
        System.out.println("roe osso...");
    }
}
