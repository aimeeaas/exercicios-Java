
import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma nota: ");
		int nota = Integer.parseInt(sc.nextLine());

		while (nota < 0 || nota > 10) {
			System.out.println("Nota Inv�lida, digite outra nota: ");
			nota = Integer.parseInt(sc.nextLine());
		}
		System.out.println("Nota V�lida!");
	}

}
