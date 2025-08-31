import java.util.Scanner;

public class ExemploExcecao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Digite um número: ");
			int n = Integer.parseInt(sc.nextLine());
			System.out.println("Você digitou " + n);
		} catch (NumberFormatException e) {
			System.out.println("Erro: Entrada inválida! Não é um número");
		} finally {
			sc.close();
			System.out.println("Scanner fechado!");
		}
	}
	/*
	 * Tipos comuns de exceções:
	 * NullPointerException
	 * ArrayIndexOutOfBoundsException
	 * FileNotFoundException
	 * NumberFormatException
	 * ArithmeticException
	 */

}
