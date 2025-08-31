package aula;

import java.util.Scanner;

public class EntradaDados {
	/**
	 * class Scanner - data input
	 */
	public static void main(String[] args) {
		String nome;
		String sobrenome;
		String nome1;
		String sobrenome1;
		
		nome = "Aimee";
		sobrenome = "Alves";
		nome1 = "Milena";
		sobrenome1 = "Cristina";
		
		Scanner entrada;
		entrada = new Scanner(System.in);
		System.out.println("Digite seu nome e sobrenome: ");
		/* next() or nextLine(), nextInt(), nextFloat(), etc. 
		 * Estamos atribuindo o novo valor 'entrada.next()' - o que o usuário vai digitar - nas variáveis */
		nome = entrada.next();
		sobrenome = entrada.next();
		System.out.println("Nome e sobrenome: " + nome + " " + sobrenome);
		
		System.out.println("Digite seu nome e sobrenome: ");
		nome1 = entrada.next();
		sobrenome1 = entrada.next();
		System.out.println("Nome e sobrenome: " + nome1 + " " + sobrenome1);

	}

}
