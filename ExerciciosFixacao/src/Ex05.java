import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num;

        System.out.println("Insira um número no formato decimal: ");
        num = sc.nextDouble();

        DecimalFormat formatoDecimal = new DecimalFormat("0.00");
        String numeroFormatado = formatoDecimal.format(num);

        System.out.println("Número formatado (2 casas decimais): " + numeroFormatado);

        sc.close();
    }
    
}
