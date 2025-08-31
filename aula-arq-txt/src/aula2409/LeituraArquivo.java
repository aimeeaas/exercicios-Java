package aula2409;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeituraArquivo {
    public static void main(String[] args){
        try{
            File arquivo = new File("saida.txt");
            Scanner sc = new Scanner(arquivo);
            while (sc.hasNextLine()) { //enquanto tiver uma próxima linha nesse arquivo, ele vai printar
                String linha = sc.nextLine();
                System.out.println(linha);
            }
            sc.close();
        } catch(FileNotFoundException e){
            System.out.println("Arquivo não encontrado");
            e.printStackTrace();
        }
    }
}
