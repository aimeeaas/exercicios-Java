import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int ac = 0;
        int cont = 0;

        int[][] dadosp = new int[7][2];

        for (int i = 0; i < dadosp.length; i++) {
            System.out.println("Digite sua idade: ");
            dadosp[i][0] = Integer.parseInt(sc.nextLine());
            ac = ac + dadosp[i][0];

            System.out.println("Digite seu peso: ");
            dadosp[i][1] = Integer.parseInt(sc.nextLine());
            if (dadosp[i][1] > 90) {
                cont = cont + 1;
            }
        }

        System.out.println("Média das idades: " + ac / 7);
        System.out.println("Pessoas com mais de 90 quilos: " + cont);
    }
}