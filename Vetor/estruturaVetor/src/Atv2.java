import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int cont = 0;
        int nums[] = new int[10];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Digite um número: ");
            nums[i] = Integer.parseInt(sc.nextLine());
            if (nums[i] > 30 && nums[i] < 90) {
                cont = cont + 1;
            }
        }

        System.out.println("Tem " + cont + " números entre 30 e 90");
    }
}
