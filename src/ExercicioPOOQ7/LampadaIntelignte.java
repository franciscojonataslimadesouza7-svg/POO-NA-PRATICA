package ExercicioPOOQ7;

public class LampadaIntelignte {
     private boolean ligada;
     private int intensidade;
     private String cor;

     public LampadaIntelignte(){

     }

     public LampadaIntelignte(boolean ligada, int intensidade, String cor) {
          this.ligada = ligada;
          this.intensidade = intensidade;
          this.cor = cor;
     }

     public boolean isLigada() {
          return ligada;
     }

     public void setLigada(boolean ligada) {
          this.ligada = ligada;
     }

     public int getIntensidade() {
          return intensidade;
     }

     public void setIntensidade(int intensidade) {
          this.intensidade = intensidade;
     }

     public String getCor() {
          return cor;
     }

     public void setCor(String cor) {
          this.cor = cor;
     }

     public void ligar(){
        ligada = true;
          System.out.println("Lampada ligada");
     }

     public void desligar(){
          ligada = false;
          System.out.println("Lampada Desligada");
     }

     public void ajustarIntesidade(int valor){
          if (ligada){
               if (valor >=0 && valor <=100){
                    intensidade = valor;
                    System.out.println("intensidade ajustada pra " + valor + " %");
               }

          } else{
               System.out.println("nao e possivel ajustar intensidade a lampada esta desligada");
          }
     }

     public void mudarCor(String novaCor) {
          if (ligada) {
               cor = novaCor;
               System.out.println("Nova cor: " + novaCor);
          }else{
               System.out.println("Nao e possivel mudar cor, lampada desligada");
          }
     }



//     public void ajustarIntensidadeLuz(){
//          if (ligada){
//               if (controlar >= 0 && controlar <= 100){
//                    intensidade = controlar;
//                    System.out.println("Intensidade ajustada para: " + controlar);
//               } else {
//                    System.out.println("Valor inválido. Use entre 0 e 100.");
//               }
//          } else {
//               System.out.println("Não é possível ajustar. A lâmpada está desligada.");
//          }
//     }
//
//     public void mudarCor(){
//
//          if (ligada){
//               cor = novacor;
//               System.out.println("Cor: " + novacor);
//
//          }else {
//               System.out.println("Luz desligada impossivel informar a cor");
//          }
//     }



}
