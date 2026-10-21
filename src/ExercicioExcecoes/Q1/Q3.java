package ExercicioExcecoes.Q1;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Q3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String menu = """
                1 - Procurar Num pelo ind do array
                0 - sair
                """;
        while (true){
            System.out.println();
            System.out.println(menu);
            System.out.println("Digite Opçao: ");
            int op = sc.nextInt();

            int i = 0;

            switch (op){
                case 1 -> {
                    try {
                        System.out.println();
                        System.out.print("Digite o Indice do Array: ");
                        i = sc.nextInt();

                        if (i < 0){
                            throw new IllegalArgumentException("Nao Pode Numeros Negativos");
                        }

                        int [] numeros = {1,2,3,4};
                        System.out.println();

                        System.out.println("Numero Da Posiçao: " + numeros[i]);
                        System.out.println();

                    }catch (IndexOutOfBoundsException e){
                        System.out.println("o seu Array e de 4 posiçoes nao existe a posição " + i + e.getMessage());
                    }catch (InputMismatchException e){
                        System.out.println("Digite Apenas Numeros " + e.getMessage());
                    }catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                        System.out.println();
                    }finally {
                        System.out.println("Saindo.............");
                    }
                }

                case 2 -> {
                    System.out.println();
                    System.out.println("Operação Finalizada");
                }
            }
        }
    }
}
