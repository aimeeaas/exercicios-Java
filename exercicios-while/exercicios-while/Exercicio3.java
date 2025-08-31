
import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Nome: ");
		String nome = sc.nextLine();

		System.out.println("Idade: ");
		int idade = Integer.parseInt(sc.nextLine());

		System.out.println("Salário: ");
		double sl = Double.parseDouble(sc.nextLine());

		System.out.println("Sexo: ");
		String sx = sc.nextLine();

		System.out.println("Estado Civil: ");
		String ec = sc.nextLine();

		while (idade < 0 || idade > 150) {
			System.out.println("Idade, Tente novamente: ");
			idade = Integer.parseInt(sc.nextLine());
		}
		while (sl < 0) {
			System.out.println("Salário, Tente novamente: ");
			sl = Integer.parseInt(sc.nextLine());
		}
		while (!sx.equals("f") && !sx.equals("m")) {
			System.out.println("Sexo, Tente novamente: ");
			sx = sc.nextLine();
		}
		while (!ec.equals("s") && !ec.equals("c") && !ec.equals("v") && !ec.equals("d")) {
			System.out.println("Estado Civil, Tente novamente: ");
			ec = sc.nextLine();
		}
		System.out.println("Parabéns " + nome);
	}

}
