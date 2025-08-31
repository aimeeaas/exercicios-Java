import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        // Escrita
        try {
            FileWriter arquivo = new FileWriter("numbers.txt", true);
            PrintWriter escreve = new PrintWriter(arquivo);
            escreve.println(8);
            escreve.println(7);
            escreve.println(6);
            escreve.println(9);
            escreve.println(5);
            escreve.close();
        } catch (IOException e) {
            System.out.println("Erro");
            e.printStackTrace();
        }

        // Leitura
        try {
            FileReader arquivo = new FileReader("numbers.txt");
            Scanner sc = new Scanner(arquivo);

            int[] nums = new int[5];
            int tamanho = 0;

            while (sc.hasNextLine() && tamanho < nums.length) {
                try {
                    nums[tamanho] = Integer.parseInt(sc.nextLine());
                    tamanho++;
                } catch (NumberFormatException e) {
                    System.out.println("Linha inválida");
                }
            }

            sc.close();

            // Cálculo
            int soma = 0;
            for (int i = 0; i < tamanho; i++) {
                soma += nums[i];
            }

            if (tamanho > 0) {
                int media = soma / tamanho;
                System.out.println("Média dos números: " + media);
            } else {
                System.out.println("Não há número válido no arquivo");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Erro");
            e.printStackTrace();
        }

    }
}
