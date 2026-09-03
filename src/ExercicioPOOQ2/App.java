package ExercicioPOOQ2;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("digite a temperatura atual do ambiente: ");
        double temperaturaAtual = sc.nextDouble();
        while (temperaturaAtual < 16 || temperaturaAtual > 30){
            System.out.println("\n temperatura fora da faixa permitida (16 graus, 30 graus)\n");
            System.out.print("digite a temperatura atual do ambiente: ");

            temperaturaAtual = sc.nextDouble();
        }

        System.out.print("Digite a Temperatura Desejada: ");
        double temperaturadesejada = sc.nextDouble();
        while (temperaturadesejada < 16 || temperaturadesejada > 30){
            System.out.println("\n temperatura fora da faixa permitida (16 graus, 30 graus)\n");

            System.out.print("Digite a Temperatura Desejada: ");
            temperaturaAtual = sc.nextDouble();
        }

        sc.nextLine();




        String Alterarmodo;
        while (true) {
            System.out.print("Digite o modo (Aquecer, Resfriar, Desligar): ");
            Alterarmodo = sc.nextLine();


            if (!Alterarmodo.matches("[a-zA-Z]+")) {
                System.out.println("Valor inválido! Digite apenas letras.");
                continue;
            }



            if (validaEntradaTemp(Alterarmodo)) {
                break;
            } else {
                System.out.println("Modo inválido! Use: Resfriar, Aquecer ou Desligar.");
            }



        }




        Termostato Ar = new Termostato(temperaturaAtual, temperaturadesejada, Alterarmodo);

        System.out.println("----Situação Do Ar-condicionado----");

        Ar.executarCiclo();

        sc.close();

    }
    public static boolean validaEntradaTemp(String validar){
        return (validar.equalsIgnoreCase("Resfriar") ||
                validar.equalsIgnoreCase("Aquecer") ||
                validar.equalsIgnoreCase("Desligar"));


        }
    }

