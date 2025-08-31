
import java.util.Locale;
import java.util.Scanner;

public class DoWhile {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int i = 1;
		double nota1, nota2, media;

		// Exemplo DoWhile
		do {
			System.out.println("Aluno: " + i);
			System.out.println("Nota 1: ");
			nota1 = Double.parseDouble(sc.nextLine());
			System.out.println("Nota 2: ");
			nota2 = Double.parseDouble(sc.nextLine());

			media = (nota1 + nota2) / 2;
			System.out.println("Media: " + media);
			System.out.println("");
			i++;
		} while (i <= 3);
		System.out.println("Fim");
	}

	/*
	 * Exemplo While
	 * while(i<=3){
	 * System.out.println("Aluno: " + i);
	 * System.out.println("Nota 1: ");
	 * nota1 = Double.parseDouble(sc.nextLine());
	 * System.out.println("Nota 2: ");
	 * nota2 = Double.parseDouble(sc.nextLine());
	 * 
	 * media = (nota1 + nota2)/2;
	 * System.out.println("Media: " + media);
	 * System.out.println("");
	 * i++;
	 * };
	 * System.out.println("Fim");
	 * }
	 */

}
