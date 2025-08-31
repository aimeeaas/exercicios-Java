import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        try {
            System.out.println("Digite cinco números inteiros:");
            for (int i = 0; i < 5; i++) {
                numbers.add(Integer.parseInt(sc.nextLine()));
            }

            Collections.sort(numbers);
            System.out.println("Números em ordem crescente: " + numbers);

        } catch (NumberFormatException e) {
            System.out.println("Erro! Digite novamente");
        }

        sc.close();
    }
}
