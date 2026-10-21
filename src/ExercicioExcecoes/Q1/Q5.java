package ExercicioExcecoes.Q1;



public class Q5 {
    static void main(String[] args) {
        String [] nomes = {"joao", "pedro", null, "ana"};

        for (int i = 0; i < nomes.length; i++) {
            try {
                String nome = nomes[i].toUpperCase();
                System.out.println(nome);
            }catch (NullPointerException e){
                System.out.println("null encontrado na lista " + e.getMessage());
            }finally {
                System.out.println("Encerrando Sistema......");
            }

        }

        System.out.println();

        for (String n: nomes){
            try {
                String nome = n.toUpperCase();
                System.out.println(nome);
            }catch (NullPointerException e){
                System.out.println("null encontrado na lista " + e.getMessage());
            }finally {
                System.out.println("Encerrando Sistema......");
            }
        }
    }
}
