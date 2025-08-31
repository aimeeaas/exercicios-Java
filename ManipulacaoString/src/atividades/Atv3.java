package atividades;

import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String word = sc.nextLine();

        String wordNew = word.toLowerCase().trim();

        String wordReverse = "";

        for (int i = wordNew.length() - 1; i >= 0; i--) {
            wordReverse += wordNew.charAt(i);
        }

        if (wordNew.equals(wordReverse)) {
            System.out.println(wordNew + " é um palíndromo!");
        } else {
            System.out.println(wordNew + " não é um palíndromo.");

        }

    }
}
