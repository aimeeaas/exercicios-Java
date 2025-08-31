package atividades;

import java.util.Scanner;

public class Atv9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira uma frase: ");
        String txt = sc.nextLine();

        int size = txt.length();

        int cont = 0;
        for (int i = 0; i < txt.length(); i++) {
            if (!Character.isWhitespace(txt.charAt(i))) {
                cont++;
            }
        }

        System.out.println("Contando os espaços: " + size + '\n' + "Sem contar os espaços: " + cont);
    }
}
