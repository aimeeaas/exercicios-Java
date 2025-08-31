package aula;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valor;
		
		System.out.println("Informe um valor: ");
		valor = Integer.parseInt(sc.nextLine());
		
		if(valor%2 == 0){
			System.out.println(valor + " é par");
		}
		else{
			System.out.println(valor + " é ímpar");
		}

	}

}