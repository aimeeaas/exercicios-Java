
import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		String dc;

		do {
			System.out.println("País A: ");
			double a = Double.parseDouble(sc.nextLine());

			System.out.println("Taxa A: ");
			double ta = Double.parseDouble(sc.nextLine());

			System.out.println("País B: ");
			double b = Double.parseDouble(sc.nextLine());

			System.out.println("Taxa B: ");
			double tb = Double.parseDouble(sc.nextLine());

			int cont = 0;

			if (a <= 0) {
				System.out.println("País A: ");
				a = Double.parseDouble(sc.nextLine());
			}
			if (b <= 0) {
				System.out.println("País B: ");
				b = Double.parseDouble(sc.nextLine());
			}

			while (a <= b) {
				a += (a * (ta / 100));
				b += (b * (tb / 100));
				cont++;
			}
			System.out.println("Serão necessários " + cont + " anos!");
			System.out.println("Deseja continuar?");
			dc = sc.nextLine();
		} while (dc.equals("Não"));

	}

}
