import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int scores[] = new int[5];

        for (int i = 0; i < scores.length; i++) {
            System.out.println("Insira uma Nota: ");
            scores[i] = Integer.parseInt(sc.nextLine());
            sum = sum + scores[i];
        }

        System.out.println("A média das notas é: " + sum / 5);
    }
}