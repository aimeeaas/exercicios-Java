package aula;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
	
	double n1;
	double n2;
	double n3;
	double n4;
	double n5;
	double n6;
	double n7;
	double n8;
	double n9;
	double n10;
	int cont = 0;
	
	Scanner entrada;
	entrada = new Scanner(System.in);
	
	System.out.println("Digite 10 numeros: ");
	n1 = entrada.nextDouble();
	n2 = entrada.nextDouble();
	n3 = entrada.nextDouble();
	n4 = entrada.nextDouble();
	n5 = entrada.nextDouble();
	n6 = entrada.nextDouble();
	n7 = entrada.nextDouble();
	n8 = entrada.nextDouble();
	n9 = entrada.nextDouble();
	n10 = entrada.nextDouble();
	
	if(n1 > 0 ){
		cont = cont + 1;
	}
	if(n2 > 0 ){
		cont = cont + 1;
	}
	if(n3 > 0 ){
		cont = cont + 1;
	}
	if(n4 > 0 ){
		cont = cont + 1;
	}
	if(n5 > 0 ){
		cont = cont + 1;
	}
	if(n6 > 0 ){
		cont = cont + 1;
	}
	if(n7 > 0 ){
		cont = cont + 1;
	}
	if(n8 > 0 ){
		cont = cont + 1;
	}
	if(n9 > 0 ){
		cont = cont + 1;
	}
	if(n10 > 0 ){
		cont = cont + 1;
	}

	System.out.println( cont + " são positivos");

	
	

}
}