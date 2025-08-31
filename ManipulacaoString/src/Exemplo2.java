import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite um número: ");
            int n1 = Integer.parseInt(sc.nextLine());

            System.out.println("Digite outro número: ");
            int n2 = Integer.parseInt(sc.nextLine());

            try {
                int d = n1 / n2;
                System.out.println(d);
            } catch (ArithmeticException e) {
                System.out.println("Erro! Não é válido divisão por 0 (zero)");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
