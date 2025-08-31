import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];

        try {
            preencherMatriz(matriz);
            exibirMatriz(matriz);
        } catch (NumberFormatException e) {
            System.out.println("Erro!");
        }
    }

    public static void preencherMatriz(int[][] m) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 9 números inteiros:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        sc.close();
    }

    public static void exibirMatriz(int[][] ma) {
        System.out.println("\nMatriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(ma[i][j] + " ");
            }
            System.out.println();
        }

    }
}
