import java.util.ArrayList;
import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Quantos números deseja ter na lista?");
            int tam = Integer.parseInt(sc.nextLine());

            listaSoma(tam);

        } catch (NumberFormatException e) {
            System.out.println("Erro! Digite novamente");
        }
        sc.close();
    }

    public static void listaSoma(int t) {
        Scanner sc1 = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        int acum = 0;

        try {
            System.out.println("Insira os números:");
            for (int i = 0; i < t; i++) {
                nums.add(Integer.parseInt(sc1.nextLine()));
                acum = acum + nums.get(i);
            }

            System.out.println("Soma dos números: " + acum + " :)");
        } catch (NumberFormatException e) {
            System.out.println("Erro! Digite novamente");
        }
        sc1.close();
    }
}
