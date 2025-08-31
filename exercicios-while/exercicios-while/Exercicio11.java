
import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int n1 = Integer.parseInt(sc.nextLine());

		System.out.println("Digite um número: ");
		int n2 = Integer.parseInt(sc.nextLine());

		int ma;
		int me;
		int acm = 0;

		if (n1 > n2) {
			ma = n1 - 1;
			me = n2 + 1;
		} else {
			ma = n2 - 1;
			me = n1 + 1;
		}

		while (me <= ma) {
			acm += me;
			me++;
		}
		System.out.print("Soma dos números: " + acm);
	}

}
