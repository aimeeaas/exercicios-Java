package atividades;

import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int action;
        String txt = "";

        do {
            System.out.println("Digite o que deseja fazer: " + '\n' + "1-Inserir texto " + '\n' + "2-Contar palavras"
                    + '\n' + "3-Sair");
            action = Integer.parseInt(sc.nextLine());

            if (action == 1) {
                System.out.println("Insira o texto: ");
                txt = sc.nextLine();
            }
            if (action == 2) {
                String[] words = txt.trim().split("\\s+");
                System.out.println("Contador de palavras: " + words.length);
            }
        } while (action != 3);

        System.out.println("Fim do Programa");

    }
}
