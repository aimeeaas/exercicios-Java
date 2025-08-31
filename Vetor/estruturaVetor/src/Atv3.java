import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int ac = 0;
        int cont = 0;
        int contIdade = 0;
        int contAltura = 0;
        int[][] pessoas = new int[10][3];

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Digite sua idade: ");
            pessoas[i][0] = Integer.parseInt((sc.nextLine()));

            System.out.println("Digite seu peso: ");
            pessoas[i][1] = Integer.parseInt((sc.nextLine()));

            System.out.println("Digite sua altura: ");
            pessoas[i][2] = Integer.parseInt((sc.nextLine()));

            ac = ac + pessoas[i][0];

            if (pessoas[i][1] > 90 && pessoas[i][2] < 150) {
                cont = cont + 1;
            }

            if (pessoas[i][2] > 190) {
                contAltura = contAltura + 1;
                if (pessoas[i][0] > 10 && pessoas[i][0] < 30) {
                    contIdade = contIdade + 1;
                }
            }
        }

        double porcentagem = contIdade * 100 / contAltura;

        System.out.println("Média das idades: " + ac / 10);
        System.out.println("Pessoas com peso superior a 90 quilos e altura inferior a 1.50: " + cont);
        System.out.println("Porcentagem: " + porcentagem + "%");
    }
}
