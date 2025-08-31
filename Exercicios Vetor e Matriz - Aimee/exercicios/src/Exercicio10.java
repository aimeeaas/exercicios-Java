import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] inventory = new int[3][4];

        for (int i = 0; i < inventory.length; i++) {
            int s = 0;
            for (int j = 0; j < inventory[i].length; j++) {
                System.out.println("Quantidade do produto " + i + " no armazém " + j + ": ");
                inventory[i][j] = Integer.parseInt(sc.nextLine());

                s = s + inventory[i][j];
            }
            System.out.println("\nProduto " + i + " tem " + s + " em todos os armazéns\n");
        }

    }

}
