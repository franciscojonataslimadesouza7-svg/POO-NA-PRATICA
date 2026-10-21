package ExercicioExcecoes.Q1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            while (true){
                try {
                    System.out.print("Digite: ");
                    String digite = sc.nextLine();

                    if (digite.isEmpty()){
                        digite = null;
                    }

                    if (digite != null){

                        System.out.println("Comprimento de " + digite + " e " + digite.length());

                    }else {
                        throw new NullPointerException("Campo Obrigatorio");
                    }
                }catch (NullPointerException e){
                    System.out.println(e.getMessage());
                } finally {
                    System.out.println("saindo");
                }
            }





    }
}
