import java.util.Scanner;

public class estruturasVetor {
    public static void main(String[] args) {

        /* Formas de declarar um array ou vetor */
        double salarios[] = new double[5];

        @SuppressWarnings("unused")
        int[] pontos;
        pontos = new int[5];

        @SuppressWarnings("unused")
        String[] nomes = new String[3];

        /* Atribuindo valor a um índice do vetor */
        salarios[0] = 2500.00;

        double[] despesas = { 3250, 600.5, 1435.34, 3200, 760 };

        for (int i = 0; i < despesas.length; i++) {
            System.out.println("Valor despesa: " + despesas[i]);
        }

        /* Matriz é uma Array de arranjos */
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        double[][] notas = new double[2][4];

        /* Laço de entrada de valores */
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Nota: ");
                notas[i][j] = Double.parseDouble(sc.nextLine());
            }
        }
        /* Laço de saída */
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Nota: " + notas[i][j]);
            }
        }
    }
}
