import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int acumulador1 = 0;
        int acumulador2 = 0;
        int acumulador3 = 0;

        try {
            System.out.print("Digite quantos números quer no vetor: ");
            int n = Integer.parseInt(sc.nextLine());

            int[] vetor = new int[n];
            System.out.println("Digite os números:");
            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = Integer.parseInt(sc.nextLine());

                if (vetor[i] > 0) {
                    acumulador1 += 1;
                } else if (vetor[i] < 0) {
                    acumulador2 += 1;
                } else if (vetor[i] == 0) {
                    acumulador3 += 1;
                }
            }

            System.out.println("\nInformações do Vetor: \nPositivos: " + acumulador1 + "\nNegativos: " + acumulador2
                    + "\nZeros: " + acumulador3);

        } catch (Exception e) {
            System.err.println("Erro!");
        }
        sc.close();
    }
}
