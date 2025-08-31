package aula;

import java.util.Scanner;

public class Exercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double c;
		double f;
		
		Scanner entrada;
		entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		c = entrada.nextDouble();
		
		f = (c*9/5 ) + 32;
		System.out.println("Conversão em Fahrenheit: " + f + "°F");
	}

}
