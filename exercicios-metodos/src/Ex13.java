import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva uma palavra: ");
        String word = sc.nextLine().toLowerCase();

        palindromo(word);

        sc.close();
    }

    public static void palindromo(String w) {
        String newWord = "";
        for (int i = w.length() - 1; i >= 0; i--) {
            newWord += w.charAt(i);
        }
        if (w.equals(newWord)) {
            System.out.println(w + " é um palíndromo!");
        } else {
            System.out.println(w + " não é um palíndromo.");

        }
    }
}
