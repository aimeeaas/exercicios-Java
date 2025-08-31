import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c;

        do {
            System.out.print("Quantos números da sequência de Fibonacci deseja ver?");
            int n = sc.nextInt();

            seqFibonacci(n);

            System.out.print("Deseja continuar? (Escolha s/n): ");
            c = sc.next().toLowerCase().charAt(0);
            sc.nextLine();
        } while (c == 's');

    }

    public static void seqFibonacci(int num) {
        int a = 0;
        int b = 1;
        for (int i = 0; i <= num; i++) {
            int seq = a + b;
            a = b;
            b = seq;

            System.out.println(seq);
        }
    }
}
