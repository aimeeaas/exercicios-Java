package aula2409;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        int c = 0;
        try{
            File arquivo = new File("saida.txt");
            Scanner sc = new Scanner(arquivo);
            
            while (sc.hasNextLine()) { //enquanto tiver uma próxima linha nesse arquivo, ele vai printar
                String linha = sc.nextLine();
                String[] conts = linha.split(" ");
                for(String cont : conts){
                    c += 1;
                }
            }
            System.out.println("Tem " + c);
            sc.close();
        } catch(FileNotFoundException e){
            System.out.println("Arquivo não encontrado");
            e.printStackTrace();
        }
        
    }

}
