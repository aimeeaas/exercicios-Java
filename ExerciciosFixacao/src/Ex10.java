import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int acum = 0;
        boolean stop = false;

        System.out.println("Digite números positivos: ");
        do {
            int nums = Integer.parseInt(sc.nextLine());
            acum = acum + nums;

            if (nums == 0) {
                stop = true;
            }
        } while (stop != true);

        System.out.println("Soma dos números: " + acum);
        sc.close();
    }
}
