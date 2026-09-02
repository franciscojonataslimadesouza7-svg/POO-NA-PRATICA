package ExercicioPOOQ2;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("digite a temperatura atual do ambiente: ");
        double temperaturaAtual = sc.nextDouble();

        System.out.print("Digite a Temperatura Desejada: ");
        double temperaturadesejada = sc.nextDouble();

        sc.nextLine();

        System.out.print("digite o modo (Aquecer, Resfriar, Desligar): ");
        String Alterarmodo = sc.nextLine();


        Termostato Ar = new Termostato(temperaturaAtual, temperaturadesejada, Alterarmodo);

        System.out.println("----Situação Do Ar-condicionado----");

        Ar.executarCiclo();

        sc.close();

    }
}
