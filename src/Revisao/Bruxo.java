package Revisao;

public class Bruxo extends Personagem{

    private boolean magia;

    public Bruxo(){}


    public Bruxo(String nome, int vida, boolean magia){
        super(nome, vida);
        this.magia = magia;
    }

    public boolean isMagia() {
        return magia;
    }

    public void setMagia(boolean magia) {
        this.magia = magia;
    }

    public void atacar(){
        System.out.println(super.getNome() + " lançando o feitiço");
    }


    @Override
    public String toString() {
        return
                "\n nome: " + super.getNome() +
                "\n magia: " + magia +
                "\n vida: " + super.getVida();
    }
}
