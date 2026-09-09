package ExerciciosExcecoes.Q7;

public class IdadeInvalida {


    public void cadastrarIdade(int idade) throws IdadeInvalidaException{
        if(idade < 0 || idade > 120){
            throw new IdadeInvalidaException("idade" + idade + " Anos " + " Invalida" );
        }
        System.out.println("idade: " + idade + " Anos" + " valida");

    }
}
