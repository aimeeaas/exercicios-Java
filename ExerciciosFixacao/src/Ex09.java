import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite um número: ");
            int num = Integer.parseInt(sc.nextLine());

            tabuada(num);
            sc.close();

        } catch (NumberFormatException e) {
            System.out.println("Erro! Digite um número inteiro");
        }
    }

    public static void tabuada(int n) {
        int i = 1;
        while (i <= 10) {
            System.out.println(i + " x " + n + " = " + i * n);
            i += 1;
        }
    }
}
