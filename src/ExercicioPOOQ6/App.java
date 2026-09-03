package ExercicioPOOQ6;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("digite o Peso(Kg) Da Encomenda: ");
        double pesoKG = sc.nextDouble();

        System.out.print("Digite a Distancia Em Quilometros(Km): ");
        double distanciaKM = sc.nextDouble();

        System.out.print("digite o valor declarado: ");
        double valorDeclarado = sc.nextDouble();

        Encomenda e = new Encomenda(pesoKG, distanciaKM, valorDeclarado);

        e.calculaFreteExpresso();


    }
}
