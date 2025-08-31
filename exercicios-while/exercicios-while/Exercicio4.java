
import java.util.Locale;

public class Exercicio4 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		double a = 80000;
		double b = 200000;
		int cont = 0;

		while (a <= b) {
			a = (a * 0.03) + a;
			b = (b * 0.015) + b;
			cont++;
		}
		System.out.println("Serão necessários " + cont + " anos!");

	}

}
