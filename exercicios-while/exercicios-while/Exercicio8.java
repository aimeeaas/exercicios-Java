
import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int i = 1;
        int acum = 0;

        while (i <= 5) {
            System.out.println("Digite um número: ");
            @SuppressWarnings("unused")
            int n1 = Integer.parseInt(sc.nextLine());

            acum = acum + n1;
            i++;
        }
        System.out.println("A soma é: " + acum + " e a média é: " + acum / 5);
    }
}