package aula;

import java.util.Scanner;

public class Exercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double r;
		
		Scanner entrada;
		entrada = new Scanner(System.in);
		
		System.out.println("Digite um valor em Reais: ");
		r = entrada.nextDouble();
		
		System.out.println("Convers�o em D�lar: " + r/5.46);

	}

}
