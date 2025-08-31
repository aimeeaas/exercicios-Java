
public class ManipulaString {
	public static void main(String[] args) {
		// Principais métodos da classe String:

		/*
		 * length() = Retorna o comprimento (número de caracteres) da string.
		 */
		String texto = "Olá, Mundo!";
		int tamanho = texto.length();
		System.out.println("Tamanho do texto: " + tamanho);

		/*
		 * charAt(int index) = Retorna o caractere na posição especificada pelo índice.
		 * O índice começa em 0.
		 */
		char caractere = texto.charAt(5);
		System.out.println("Caracter: " + caractere);

		/*
		 * substring(int beginIndex, int endIndex) = Retorna uma nova string que é um
		 * trecho (substring) da string original,
		 * começando no índice beginIndex e terminando em endIndex (exclusivo).
		 */
		String parte = texto.substring(4, 9);
		System.out.println("Parte da string: [" + parte + "]");

		/*
		 * toLowerCase() = Retorna a string com todos os caracteres convertidos para
		 * minúsculas.
		 * toUpperCase() = Retorna a string com todos os caracteres convertidos para
		 * maiúsculas.
		 */
		String minusculo = texto.toLowerCase();
		String maiusculo = texto.toUpperCase();
		System.out.println("Texto: " + minusculo);
		System.out.println("Texto: " + maiusculo);

		/*
		 * indexOf(String str) = Retorna o índice da primeira ocorrência da string
		 * especificada (str).
		 * Retorna -1 se a string não for encontrada
		 */
		int indice = texto.indexOf("Mundo");
		System.out.println("Texto: " + indice);

		/*
		 * replace(char oldChar, char newChar) = Retorna uma nova string, substituindo
		 * todas as ocorrências de um
		 * caractere específico (oldChar) por outro caractere (newChar).
		 */
		String novoTexto = texto.replace('o', 'a');
		System.out.println("Texto: " + novoTexto);

		/*
		 * String.format = utilizado para formatação:
		 * Placeholders:
		 * %d - número inteiro (decimal)
		 * %f - número de ponto flutuante (decimal)
		 * %s - String
		 * %n - quebra de linha (equivale a \n)
		 * %c - caractere
		 * 
		 * Para quantidade de casas decimais: %.2f = 2 casas decimais
		 * Para tamanho do campo: %10s - string com tamanho mínimo de 10 caracteres
		 * Valores positivos = espaço antes da string
		 * Valores negativos = espaço depois da string
		 */
		int idade = 20;
		String nome = "João Francisco";
		double salario = 1500.2395;
		String msg = String.format("Meu nome é %s e eu tenho %d anos e o salário é %.2f", nome, idade, salario);
		System.out.println(msg);

	}
}
