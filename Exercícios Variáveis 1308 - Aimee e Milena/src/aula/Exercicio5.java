package aula;

import java.util.Scanner;

public class Exercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double n1;
		double p1;
		double n2;
		double p2;
		double n3;
		double p3;
		double med;
		
		Scanner entrada;
		entrada = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		n1 = entrada.nextDouble();
		System.out.println("Digite o peso da primeira nota: ");
		p1 = entrada.nextDouble();
		System.out.println("Digite a segunda nota: ");
		n2 = entrada.nextDouble();
		System.out.println("Digite o peso da segunda nota:");
		p2 = entrada.nextDouble();
		System.out.println("Digite a terceira nota: ");
		n3 = entrada.nextDouble();
		System.out.println("Digite o peso da terceira nota:");
		p3 = entrada.nextDouble();
		
		med = ((n1*p1)+(n2*p2)+(n3*p3))/(p1+p2+p3);
		System.out.println("A média das notas: " + med);
	}

}
