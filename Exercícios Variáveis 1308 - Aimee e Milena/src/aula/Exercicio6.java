package aula;

import java.util.Scanner;

public class Exercicio6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String nome;
		String sobrenome;
		int idade;
		
		Scanner entrada;
		entrada = new Scanner(System.in);
		
		System.out.println("Digite nome, sobrenome e idade: ");
		nome = entrada.next();
		sobrenome = entrada.next();
		idade = entrada.nextInt();
		
		System.out.println("Seu nome é " + nome + " " + sobrenome + " e sua idade é " + idade + " anos");

	}

}
