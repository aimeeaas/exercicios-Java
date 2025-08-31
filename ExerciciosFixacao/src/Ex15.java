import java.util.ArrayList;
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Quantos nomes deseja inserir na lista?");
            int qtd = Integer.parseInt(sc.nextLine());

            System.out.println("Insira os nomes:");
            for (int i = 0; i < qtd; i++) {
                names.add(sc.nextLine());
            }

            imprimirLista(names);

        } catch (Exception e) {
            System.out.println("Erro! Deve ser uma String");
        }

        sc.close();
    }

    public static void imprimirLista(ArrayList<String> names) {
        System.out.println("\nNOMES:");
        for (String n : names) {
            System.out.println(n);
        }

    }
}
