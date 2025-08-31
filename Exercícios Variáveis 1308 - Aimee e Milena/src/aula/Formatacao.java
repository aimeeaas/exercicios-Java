package aula;

public class Formatacao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "Java";
		int dia = 20;
		String mes = "Julho";
		double valor = 25.654;
		
		String saida = String.format("Olá %s, hoje é dia %d do mês %s, com o valor %2.2f", str, dia, mes, valor);
		System.out.println(saida);
	}

}
