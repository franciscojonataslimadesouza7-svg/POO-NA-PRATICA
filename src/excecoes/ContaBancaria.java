package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaBancaria {
    private double saldo;

    static void main(String[] args) {

//        try {
//            int [] numeros = {50, 20, 40};
//
//            System.out.println(numeros[5]);
//        }catch (IndexOutOfBoundsException e){
//            System.out.println("o seu Array e de 3 posiçoes nao existe a posição 5");
//        }

//        try {
//            int num1 = 10;
//            int num2 = 0;
//            System.out.println(num1/num2);
//        } catch (ArithmeticException) {
//            System.out.println("Nao e possivel divisao por 0");
//
//        }
//        System.out.println("Operaçao Iniciada");
//        int num1 = 10;
//        int num2 = 0;
//        System.out.println("Parametro recebidos");
//        System.out.println(num1/num2);
//        System.out.println("Calculo realizado");




//       // erro de logica n1 + n2 / 2
//        double n1 = 8, n2 = 6;
//        double media = (n1 + n2) / 2;
//        System.out.println(media);

        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Digite o dividendo: ");
                int dividendo = sc.nextInt();

                System.out.print("Digite o Divisor: ");
                int divisor = sc.nextInt();
                System.out.println(calcular(dividendo, divisor));
                return;
                //se eu nao souber qual exceçao eu uso Exception que e a super classe das excecoes
            } catch (NaoPodeDividirPorZeroException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Digite Apenas Numeros Inteiros" + e.getMessage());
                sc.nextLine();
            } finally {
                System.out.println("Operação...........");
            }
        }
    }
    static double calcular(int n1, int n2){
        try {
            return n1/n2;

        } catch (Exception e) {
            throw new NaoPodeDividirPorZeroException("Nao pode divisao por zero Digite Apenas numeros Diferentes de zero" + e.getMessage());
        }
    }

}
