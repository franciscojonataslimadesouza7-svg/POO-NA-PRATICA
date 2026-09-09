package Excecoes.ExemploArray;

public class ExemploArray {
    public static void main(String[] args) {
        try{
            String [] nomes = new String[]{"jose", "jonatas" , "jobson"};
            System.out.println("nome: " + nomes[5]);


        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indice Nao Existente, erro " + e.getMessage());
        } finally {
            // sempre sera executada
            System.out.println("coloque o numero do index entre [0] e [2]");
        }

    }
}
