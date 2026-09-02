package Classes_objetos.dominio;

public class DadosCliente {
    String nomeCompleto;
    Contatos contatos;
    String RG;
    String CPF;
    Endereco endereco;
    @Override
    public String toString() {
        return "\n---Dados Cliente----" +
                "\n nomeCompleto:'" + nomeCompleto + '\'' +
                "\n contatos:" + contatos +
                "\n RG:'" + RG + '\'' +
                "\n CPF:'" + CPF + '\'' +
                " endereco:" + endereco;
    }











}
