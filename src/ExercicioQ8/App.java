package ExercicioQ8;
import ExercicioQ8.BombaCombustivel;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String opcao;
        String tipoCombustivel = "";
        boolean Opcaovalida = false;

        while (!Opcaovalida) {
            System.out.println("1 - Gasolina Comum");
            System.out.println("2 - Gasolina Aditivada");
            System.out.println("3 - Alcool");
            System.out.println("4 - Disel S-10");
            System.out.println("5 Disel-500");

            System.out.print("\n digite a opçao:  ");
            opcao = sc.next();


            switch (opcao) {
                case "1":
                    tipoCombustivel = "Gasolina Comum";
                    Opcaovalida = true;
                    break;

                case "2":
                    tipoCombustivel = " Gasolina Aditivada";
                    Opcaovalida = true;
                    break;

                case "3":
                    tipoCombustivel = " Alcool";
                    Opcaovalida = true;
                    break;

                case "4":
                    tipoCombustivel = " Disel S-10";
                    Opcaovalida = true;
                    break;

                case "5":
                    tipoCombustivel = " Disel S-500";
                    Opcaovalida = true;
                    break;

                default:
                    System.out.println("Opção Invalida as opçoes são (1 - Gasolina Comum " +
                            "\n 2 - Gasolina Aditivada \n 3 - Alcool \n 4 - Disel S-10 \n 5 Disel-500");
                    System.out.print("digite a opçao correta: ");
                    return;


            }
        }




            System.out.println("Combustivel Escolhido: " + tipoCombustivel);


            System.out.print("Digite Valor Por Litro: ");
            double valorPorLitro = sc.nextDouble();


            System.out.println("Digite Quantidade De Combustivel Na Bomba: ");
            double quantidadeCombustivelNaBomba = sc.nextDouble();


            BombaCombustivel comb = new BombaCombustivel(tipoCombustivel, valorPorLitro, quantidadeCombustivelNaBomba);
            comb.abastecerPorlitro(valorPorLitro);
            comb.abastecerPorValor(quantidadeCombustivelNaBomba);

            sc.close();
        }
    }

