import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] sales = new int[4][4];

        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                System.out.println("Semana " + (i + 1) + " valor da venda do produto " + (j + 1) + ": ");
                sales[i][j] = Integer.parseInt(sc.nextLine());
            }
        }

        for (int i = 0; i < sales.length; i++) {
            int sumWeek = 0;
            for (int j = 0; j < sales[i].length; j++) {
                sumWeek = sumWeek + sales[i][j];
            }
            System.out.println("\nSoma da Semana " + (i + 1) + ": " + sumWeek);
        }

        for (int j = 0; j < sales[0].length; j++) {
            int sumProduct = 0;
            for (int i = 0; i < sales.length; i++) {
                sumProduct = sumProduct + sales[i][j];
            }
            System.out.println("\nSoma do Produto " + (j + 1) + ": " + sumProduct);
        }
    }
}
