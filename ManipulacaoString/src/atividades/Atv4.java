package atividades;

import java.util.Scanner;;

public class Atv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;

        System.out.print("Insira uma frase: ");
        String phrase = sc.nextLine();

        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == 'a' || phrase.charAt(i) == 'e' || phrase.charAt(i) == 'i' || phrase.charAt(i) == 'o'
                    || phrase.charAt(i) == 'u') {
                cont = cont + 1;
            }
        }
        System.out.println("Total de vogais encontradas na frase: " + cont);
    }
}