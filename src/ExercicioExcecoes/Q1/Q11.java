package ExercicioExcecoes.Q1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q11 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();

        System.out.print("Digite nome: ");
        String nome1 = sc.nextLine();
        System.out.print("Digite nome: ");
        String nome2 = sc.nextLine();
        System.out.print("Digite nome: ");
        String nome3 = sc.nextLine();
        System.out.print("Digite nome: ");
        String nome4 = sc.nextLine();
        System.out.print("Digite nome: ");
        String nome5 = sc.nextLine();

        nomes.add(nome1);
        nomes.add(nome2);
        nomes.add(nome3);
        nomes.add(nome4);
        nomes.add(nome5);
    }
}
