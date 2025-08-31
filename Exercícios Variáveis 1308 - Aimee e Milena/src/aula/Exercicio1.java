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
		
		System.out.println("Digite um número:");
		num1 = entrada.nextDouble();
		System.out.println("Digite um número:");
		num2 = entrada.nextDouble();
		
		System.out.println("Adição: " + (num1 + num2));
		System.out.println("Subtração: " + (num1 - num2));
		System.out.println("Multiplicação: " + (num1 * num2));
		System.out.println("Divisão: " + (num1/num2));

	}

}
