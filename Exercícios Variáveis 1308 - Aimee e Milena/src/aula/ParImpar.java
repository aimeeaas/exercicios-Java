package aula;

import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		//obj. do tipo Scanner
		Scanner sc = new Scanner(System.in);
		
		int valor;
		//entrada de dados
		System.out.println("Informe um valor: ");
		valor = Integer.parseInt(sc.nextLine());
		
		//verifica se o numero e par ou impar
		if(valor%2 == 0){
			System.out.println(valor + " é par");
		}
		else{
			System.out.println(valor + " é ímpar");
		}

	}

}
