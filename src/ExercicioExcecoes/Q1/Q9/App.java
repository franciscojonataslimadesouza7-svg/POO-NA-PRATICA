package ExercicioExcecoes.Q1.Q9;


import java.util.*;


public class App {

    static double calcularMedia(List<Double> nums){
        if (nums == null || nums.isEmpty()){
                throw new IllegalArgumentException("A Lista Esta Vazia ");

        }

        double soma = 0;

        for (Double n : nums){
            soma += n;
        }
        return soma / nums.size();
    }



    static int validarIdade(int idadeAluno){
        if (idadeAluno <= 0){
            throw new IllegalArgumentException("Idade Invalida");
        }
        return idadeAluno;
    }



    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            try {
                System.out.print("Digite Seu Nome: ");
                String nomeAluno = sc.nextLine();

                String nome = Optional.ofNullable(nomeAluno)
                        .filter(n -> !n.trim().isEmpty())
                                .orElseThrow(() -> new IllegalArgumentException("Campo Obrigatorio"));

                System.out.print("Digite Sua Idade: ");
                int idadeAluno = sc.nextInt();

                validarIdade(idadeAluno);

                try {
                    List<Double> nums = new ArrayList<>();

                    System.out.print("Digite a Nota 1: ");
                    double nota1 = sc.nextDouble();
                    System.out.print("Digite a Nota 2: ");
                    double nota2 = sc.nextDouble();
                    System.out.print("Digite a Nota 3: ");
                    double nota3 = sc.nextDouble();

                    nums.add(nota1);
                    nums.add(nota2);
                    nums.add(nota3);

                    double media = calcularMedia(nums);

                    Aluno a = new Aluno(nome, idadeAluno);
                    a.setMedia(media);

                    System.out.println(
                            "\n" +
                                    "Situação Aluno" +
                                    "\n Aluno: " + a.getNome() +
                                    "\n Notas: " + nums +
                                    "\n Idade: " + a.getIdade() +
                                    "\n anos Media: " + a.getMedia());
                }catch (InputMismatchException e){
                    System.out.println("Nota Invalida " + e.getMessage());
                }




            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }catch (InputMismatchException e){
                System.out.println("Digite Apenas Numeros " + e.getMessage());
            }


    }

}
