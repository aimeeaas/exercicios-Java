package aula;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		double n1;
		double n2;
		double n3;
		double m = 0;
		
		Scanner entrada;
		entrada = new Scanner(System.in);
		
		System.out.println("Digite 3 numeros: ");
		n1 = entrada.nextDouble();
		n2 = entrada.nextDouble();
		n3 = entrada.nextDouble();
		
		if(n1 > n2 && n1>n3){
			m = n1;
		}
		if(n2 > n1 && n2>n3){
			m = n2;
		}
		if(n3 > n2 && n3>n1){
			m = n3;
		}
		
		System.out.println("O maior é " + m);
	}

}
