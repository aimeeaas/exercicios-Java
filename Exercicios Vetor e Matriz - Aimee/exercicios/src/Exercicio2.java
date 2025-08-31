import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] purchases = new String[8];

        for (int i = 0; i < purchases.length; i++) {
            System.out.println("Insira um item da compra: ");
            purchases[i] = sc.nextLine();
        }
        System.out.println("\nLista de Compras: ");
        for (int i = 0; i < purchases.length; i++) {
            System.out.println(purchases[i]);
        }
    }
}
