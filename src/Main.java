import entity.Livro;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String data= "05/09/2023";
        // Define o formatador para o padrão dia/mês/ano
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        try {
            LocalDate anoDePublicacao = LocalDate.parse(data, formatador);
            Livro livro = new Livro("Use a cabeça java!", "Kathy Sierra & Bert Bates", anoDePublicacao);
            System.out.println(livro);
        } catch (DateTimeParseException e) {
            System.err.println("Não foi possível converter a string para LocalDate: " + e.getMessage());
        }


    }
}