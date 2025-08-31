import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] lands = new int[3][3];
        int a = 0;
        int f = 0;
        int m = 0;

        for (int i = 0; i < lands.length; i++) {
            for (int j = 0; j < lands[i].length; j++) {
                System.out.println("Insira o terreno 1, 2 ou 3  na posição " + i + " " + j + ": ");
                lands[i][j] = Integer.parseInt(sc.nextLine());

                switch (lands[i][j]) {
                    case 1:
                        a++;
                        break;
                    case 2:
                        f++;
                        break;
                    case 3:
                        m++;
                        break;
                }
            }
        }
        System.out.println("Existem " + a + " terrenos de água, " + f + " terrenos de floresta e " + m
                + " terrenos de montanha");
    }
}
