import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class calculoIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pede ao usuário a data de nascimento no formato dd/MM/yyyy
        System.out.print("Digite sua data de nascimento (dd/MM/yyyy): ");
        String dataNascimentoStr = sc.nextLine();

        // Converte a string para um objeto LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr, formatter);

        // Obtém a data atual
        LocalDate dataAtual = LocalDate.now();

        // Calcula a diferença entre as datas (idade)
        Period periodo = Period.between(dataNascimento, dataAtual);

        // Exibe a idade
        System.out.println("Você tem " + periodo.getYears() + " anos.");

        sc.close();
    }
}