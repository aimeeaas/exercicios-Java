import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        try {
            System.out.println("Digite 5 números inteiros:");
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = Integer.parseInt(sc.nextLine());
            }

            imprimirVetor(numbers);

        } catch (NumberFormatException e) {
            System.out.println("Número Inválido!");
        }
        sc.close();
    }

    public static void imprimirVetor(int[] numbers) {
        System.out.println("Elementos do Vetor:");
        for (int nums : numbers) {
            System.out.println(nums);
        }

    }
}
