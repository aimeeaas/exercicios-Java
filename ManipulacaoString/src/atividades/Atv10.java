package atividades;

import java.util.Scanner;

public class Atv10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String word = sc.nextLine();

        String wordReverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            wordReverse += word.charAt(i);
        }
        System.out.println("Palavra inserida: " + word + '\n' + "Palavra inversa: " + wordReverse);
    }
}