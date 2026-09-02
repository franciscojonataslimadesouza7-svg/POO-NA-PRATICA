package Classes_objetos.dominio;

public class Contatos {
    String Email;
    String telefone;

    @Override
    public String toString() {
        return "\n----Contatos Cliente---- " +
                "\n Email: '" + Email + '\'' +
                " \ntelefone: '" + telefone + '\'';
    }
}
