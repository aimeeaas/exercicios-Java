import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int reviews[] = new int[5];

        for (int i = 0; i < reviews.length; i++) {
            System.out.println("Insira a avaliação do " + (i + 1) + "° produto: ");
            reviews[i] = Integer.parseInt(sc.nextLine());
            sum = sum + reviews[i];
        }

        System.out.println("A média das avaliações é: " + sum / 5);
    }
}