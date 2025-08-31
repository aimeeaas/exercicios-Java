package aula2409;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscritaArquivo {
    public static void main(String[] args) {
        try {
            FileWriter arquivo = new FileWriter("saida.txt", true);
            PrintWriter escreve = new PrintWriter(arquivo);
            escreve.println("Escrevendo em um arquivo...");
            escreve.println("Testando esse arquivo");
            escreve.println("ABC");
            escreve.close();
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo!");
            e.printStackTrace();
        }
    }
}