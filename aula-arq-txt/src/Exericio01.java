import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exericio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nomes;
        for (int i = 0; i < 5; i++) {
            try {
                FileWriter arquivo = new FileWriter("alunos.txt", true);
                PrintWriter escreve = new PrintWriter(arquivo);
                System.out.println("Escreva o " + (i + 1) + "° nome: ");
                nomes = sc.nextLine();
                escreve.println(nomes);
                escreve.close();
            } catch (IOException e) {
                System.out.println("Erro ao escrever no arquivo!");
                e.printStackTrace();
            }
        }

    }

}
