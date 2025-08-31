package aula;

import java.util.Scanner;

public class Exercicios11 {
	public static void main(String[] args) {
		int nt;
		
		Scanner entrada;
		entrada = new Scanner(System.in);
		
		System.out.println("Digite uma nota de 0 a 100: ");
		nt = entrada.nextInt();
		
		if(nt >= 0 && nt <= 100){
			if(nt >= 90 && nt <= 100){
				System.out.println("A");
			}
			if(nt >= 80 && nt <= 89){
				System.out.println("B");
			}
			if(nt >= 70 && nt <= 79){
				System.out.println("C");
			}
			if(nt >= 60 && nt <= 69){
				System.out.println("D");
			}
			if(nt >= 0 && nt <= 59){
				System.out.println("E");
			}
		}

	}

}
