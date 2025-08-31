
import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Digite uma senha: ");
		String senha = sc.nextLine();

		while (nome.equals(senha)) {
			System.out.println("Erro! Tente novamente: ");
			nome = sc.nextLine();
			senha = sc.nextLine();
		}
		System.out.println("Cadsatrado com Sucesso!");
	}
}
