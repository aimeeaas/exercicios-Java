import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor total da compra: ");
        double total = sc.nextDouble();

        sistemaDesconto(total);
        sc.close();
    }

    public static void sistemaDesconto(double t) {
        double tDesconto = 0;
        if (t <= 100.00) {
            tDesconto = t - (0.05 * t);
        }
        if (t >= 101.00 && t <= 500.00) {
            tDesconto = t - (0.1 * t);
        }
        if (t > 500.00) {
            tDesconto = t - (0.15 * t);
        }

        System.out.println("Valor com desconto aplicado: " + tDesconto);
    }
}
