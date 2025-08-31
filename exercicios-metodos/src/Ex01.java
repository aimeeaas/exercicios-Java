import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Número 1: ");
		int num1 = sc.nextInt();

		System.out.println("Número 2: ");
		int num2 = sc.nextInt();

		somarNumero(num1, num2);

	}

	public static void somarNumero(int n1, int n2) {
		int soma = n1 + n2;
		System.out.println("A soma é: " + soma);
	}

}
