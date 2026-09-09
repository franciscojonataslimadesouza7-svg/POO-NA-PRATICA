package ExerciciosExcecoes.Q6;

public class Irn {
    public static void main(String[] args) {
            try{
                String msg = null;
                System.out.println(msg.length());

            } catch (NullPointerException e){
                System.out.println("o valor da String não foi definido");
            }

    }
}
