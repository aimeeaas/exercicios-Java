import java.util.Scanner;

public class r {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            try {
                String confirm;

                do {
                    System.out.print("Digite um número: ");
                    Double n1 = Double.parseDouble(sc.nextLine());

                    System.out.print("Digite mais um número: ");
                    Double n2 = Double.parseDouble(sc.nextLine());

                    Double sum = n1 + n2;
                    Double sub = n1 - n2;
                    Double mult = n1 * n2;
                    Double div = n1 / n2;

                    System.out.println(sum);
                    System.out.println(sub);
                    System.out.println(mult);
                    System.out.printf("%.2f \n", div);

                    System.out.println("Deseja continuar?");
                    confirm = sc.nextLine().toLowerCase();

                } while (confirm.equals("sim"));
            } // usando Double não precisa desse catch pois ele já retorna um valor especial,
              // o "Infinity"
            catch (ArithmeticException e) {
                System.out.println("Erro!");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
