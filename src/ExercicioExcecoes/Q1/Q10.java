package ExercicioExcecoes.Q1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Q10 {
    static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Digite Uma Data dd/MM/yyyy:  ");
            String date = sc.nextLine();

            SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
            sf.setLenient(false);
            Date data = sf.parse(date);

            String dataFormatada = sf.format(data);

            System.out.println("Data Formatada " + dataFormatada);
        }catch (ParseException e){
            System.out.println("Texto Digitado Invalido Digite dd/MM/yyyy " + e.getMessage());
        }
    }
}
