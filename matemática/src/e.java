import java.util.Scanner;

public class e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira uma string: ");
        String word = sc.nextLine().toLowerCase();

        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }

        if (word.equals(reverse)) {
            System.out.println("palindromo");
        } else {
            System.out.println("não é palindromo");
        }

        sc.close();
    }
}
