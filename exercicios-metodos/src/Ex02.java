import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int num = sc.nextInt();

		int exibe = fatorial(num);
		System.out.println(exibe);

	}

	public static int fatorial(int n) {
		int fat = 1;
		for (int i = 2; i <= n; i++) {
			fat *= i;
		}
		return fat;
	}

}
