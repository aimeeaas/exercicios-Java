
import java.util.Locale;
import java.util.Scanner;

public class EntradaNum {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int num = Integer.parseInt(sc.nextLine());

		while (num != 0) {
			// Math.pow(num, 2) -> potencia do numero digitado pelo usuario
			System.out.println(Math.pow(num, 2));
			System.out.println("Digite o próximo número: ");
			num = Integer.parseInt(sc.nextLine());
		}
		System.out.println("Fim...");
	}

}
