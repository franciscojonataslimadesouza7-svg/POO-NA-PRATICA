package ExercicioExcecoes.Q1;

import java.util.Scanner;

public class Q2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            try {
                System.out.println("Digite um numero: ");
                String numero = sc.nextLine();
                if (numero.isBlank()){
                    throw new NullPointerException("o Campo Nao pode ser vazio ");
                }

                int num = Integer.parseInt(numero);
                System.out.println("String Convertido para Inteiro " + num);
                return;

            } catch (NumberFormatException e) {
                System.out.println("Digite Apenas Numeros Inteiros " + e.getMessage());
            }catch (NullPointerException e){
                System.out.println(e.getMessage());

            }finally {
                System.out.println("Encerrando o Tratamento..........");
            }
        }

    }
}
