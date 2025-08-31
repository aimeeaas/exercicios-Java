import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[10];
        nums[0] = 0;
        nums[1] = 1;

        for (int i = 2; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }

        System.out.println("\nSequencia de Fibonacci: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
