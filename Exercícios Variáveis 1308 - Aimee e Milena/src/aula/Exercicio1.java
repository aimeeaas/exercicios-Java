package aula;

import java.util.Scanner;

public class Exercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double num1;
		double num2;
		
		Scanner entrada;
		entrada = new Scanner(System.in);
		
		System.out.println("Digite um n�mero:");
		num1 = entrada.nextDouble();
		System.out.println("Digite um n�mero:");
		num2 = entrada.nextDouble();
		
		System.out.println("Adi��o: " + (num1 + num2));
		System.out.println("Subtra��o: " + (num1 - num2));
		System.out.println("Multiplica��o: " + (num1 * num2));
		System.out.println("Divis�o: " + (num1/num2));

	}

}
