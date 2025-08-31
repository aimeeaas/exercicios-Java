import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Número inicial: ");
		int num = sc.nextInt();

		String contagem = contagemRegressiva(num);
		System.out.println(contagem);
	}

	public static String contagemRegressiva(int n) {
		String c = "";
		for (int i = n - 1; i >= 0; i--) {
			c += i + " ";
		}
		return c;
	}

}
