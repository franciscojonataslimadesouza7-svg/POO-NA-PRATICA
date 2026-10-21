package Optional;

import java.util.Optional;

public class App {

    // quando eu tenho certeza que tenho o valor Optional.of, quando o valor existi mais pode ser
    // null ou nao, usa o Optional.ofNullable, e Optional vazio Optional.empty() so pra declarar
    // caso eu queira usar vazio.orElse se for vazio eu mando imprimir vazio.orElse("imprima alguma coisa");

    // no Optional.of o valor e obrigatorio

    static void main(String[] args) {
        Pessoa p = new Pessoa("ana", 15, Genero.FEMININO, null);

        Optional<String> valorQueExisti = Optional.of(p.getNome());
//        System.out.println("valorQueExisti: " + valorQueExisti);

        Optional<String> poderSerNuloOuNao = Optional.ofNullable(p.getEmail());
//        System.out.println("poderSerNuloOuNao: " + poderSerNuloOuNao);

        Optional<String> vazio = Optional.empty();
//        System.out.println("Vazio: " + vazio);
//        vazio.orElse("imprima alguma coisa");

        Optional.ofNullable(p.getEmail());

        String email = p.getEmail();
        String contato;

        if(email != null){
            contato = email;
        }else {
            contato = "Usuario Nao Possui email";
        }


        if(Optional.ofNullable(email).isPresent()){
            contato = email;
        }


        Optional.ofNullable(email)
                .ifPresentOrElse(e -> System.out.println("Email Enviado para " + e),
                () -> System.out.println(p.getNome() + " Nao possui Email"));
//                .orElse("Ana não possui email");

        System.out.println(contato);

        if(email == null){
            throw new IllegalArgumentException("Email nao localizado com if-else");
        }

        Optional.ofNullable(email).orElseThrow(() ->
                new IllegalArgumentException("Email Nao Localizado com optional"));

        try{
            System.out.println(validarEmail(email));
        }catch (IllegalArgumentException e){
            System.out.println("Erro " + e.getMessage());
        }
    }

    public static String validarEmail(String email){
        return Optional.ofNullable(email).orElseThrow(() ->
                new IllegalArgumentException("Email Nao Localizado com optional"));
    }


}

