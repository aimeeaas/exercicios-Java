package aula;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		int idade;
		
		Scanner entrada;
		entrada = new Scanner(System.in);
		
		System.out.println("Idade: ");
		idade = entrada.nextInt();
		
		if(idade >= 18){
			System.out.println("Maior de Idade");
		}
		else{
			System.out.println("Menor de Idade");
		}

	}

}