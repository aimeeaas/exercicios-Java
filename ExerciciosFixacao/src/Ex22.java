import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        try {
            FileWriter arquivo = new FileWriter("dados.txt", true);
            PrintWriter escreve = new PrintWriter(arquivo);
            escreve.println("Nome: Aimee A. A. Silva");
            escreve.println("Idade: 19");
            escreve.println("Email: aimeealves77@gmail.com");
            escreve.close();
        } catch (IOException e) {
            System.out.println("Erro!");
            e.printStackTrace();
        }

        try {
            FileReader arquivo = new FileReader("dados.txt");
            Scanner sc = new Scanner(arquivo);
            while (sc.hasNextLine()) {
                String linha = sc.nextLine();
                System.out.println(linha);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado :(");
            e.printStackTrace();
        }

    }
}
