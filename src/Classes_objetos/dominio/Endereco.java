package Classes_objetos.dominio;

public class Endereco {
    String rua;
    String numeroDaCasa;

    String Bairro;
    String cidade;
    String Complemento;
    String Cep;
    @Override
    public String toString() {
        return "\n----Endereço Cliente----" +
                "\nrua:'" + rua + '\'' +
                "\n numeroDaCasa:'" + numeroDaCasa + '\'' +
                "\n Bairro:'" + Bairro + '\'' +
                "\n cidade:'" + cidade + '\'' +
                "\n Complemento:'" + Complemento + '\'' +
                "\n Cep:'" + Cep + '\'';
    }

}
