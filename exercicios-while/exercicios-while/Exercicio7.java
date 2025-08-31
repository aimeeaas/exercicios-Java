
import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int i = 1;
		int ma = 0;

		while (i <= 5) {
			System.out.println("Digite um número: ");
			@SuppressWarnings("unused")
			int n1 = Integer.parseInt(sc.nextLine());

			if (n1 > ma) {
				ma = n1;
			}

			i++;
		}
		System.out.println("O maior número é: " + ma);
	}
}
