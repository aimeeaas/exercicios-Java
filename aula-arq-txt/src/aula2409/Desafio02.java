package aula2409;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Desafio02 {
    
    public static void main(String[] args) {
        boolean encontrou = false;
        Scanner entrada = new Scanner(System.in);

            System.out.println("Digite uma palavra: ");
            String palavra = entrada.nextLine();

         try{
            File arquivo = new File("saida.txt");
            Scanner sc = new Scanner(arquivo);

            while (sc.hasNextLine()) {
                String linha = sc.nextLine();
                //System.out.println(linha);
                String[] conts = linha.split(" ");

                for(String cont : conts){
                    if (cont.equals(palavra)) {
                        encontrou = true;
                    }
                }
            }
            
            if (encontrou) {
                System.out.println("Palavra encontrada!");
            } else{
                System.out.println("Palavra não encontrada");
            }
            
            sc.close();

        } catch(FileNotFoundException e){
            System.out.println("Arquivo não encontrado");
            e.printStackTrace();
        }
    }

}
