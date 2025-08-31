import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite um número: ");
            int num = Integer.parseInt(sc.nextLine());

            lacoRepeticao(num);
            sc.close();

        } catch (NumberFormatException e) {
            System.out.println("Erro! Digite um número inteiro");
        }
    }

    public static void lacoRepeticao(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
