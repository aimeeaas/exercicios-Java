
import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println(" Escolha 1 ou 0 ");
        String op = sc.nextLine();

        while (!op.equals("1") && !op.equals("0")) {
            System.out.println(" Selecione uma nova opção: 1 ou 0 ");
            op = sc.nextLine();
        }

    }
}
