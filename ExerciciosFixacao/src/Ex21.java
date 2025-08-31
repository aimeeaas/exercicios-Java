import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex21 {
    public static void main(String[] args) {
        try {
            FileWriter arquivo = new FileWriter("saida.txt", true);
            PrintWriter escreve = new PrintWriter(arquivo);
            escreve.println("Olá, Mundo!");
            escreve.close();
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo!");
            e.printStackTrace();
        }
    }
}
