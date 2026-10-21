package ExercicioExcecoes.Q1.Q1;

import excecoes.NaoPodeDividirPorZeroException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            try {
                System.out.print("Digite o Dividendo: ");
                int dividendo = sc.nextInt();


                System.out.print("Digite o Divisor: ");
                int divisor = sc.nextInt();



                System.out.println(calcular(dividendo, divisor));

            }catch (NaoPodeDividirPorZeroException e){
                System.out.println(e.getMessage());

            }catch (InputMismatchException e){
                System.out.println("Entrada Invalida Digite Apenas Numeros Inteiros " + e.getMessage());


            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }

        }


    }

    static double calcular(int n1, int n2){
        System.out.println("n1: " + n1);
        System.out.println("n2: " + n2);
        if(n1 < 0 || n2 < 0){
            throw new IllegalArgumentException("Nao Pode Numeros Negativos, digite apenas numeros positivos");
        }
        try {
            return n1/n2;

        } catch (Exception e) {
            throw new NaoPodeDividirPorZeroException("Nao pode divisao por zero Digite Apenas numeros Diferentes de zero" + e.getMessage());
        }
    }


}
