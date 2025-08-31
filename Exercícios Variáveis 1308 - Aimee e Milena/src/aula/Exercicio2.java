package aula;

import java.util.Scanner;

public class Exercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double n1;
		double n2;
		double n3;
		
		Scanner entrada;
		entrada = new Scanner(System.in);
		
		System.out.println("Digite uma nota:");
		n1 = entrada.nextDouble();
		System.out.println("Digite uma nota:");
		n2 = entrada.nextDouble();
		System.out.println("Digite uma nota:");
		n3 = entrada.nextDouble();
		

		System.out.println("Média das notas: " + (n1+n2+n3)/3);
	}

}
