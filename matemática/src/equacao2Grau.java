import java.util.Scanner;

public class equacao2Grau {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // Exibir resultado de delta e das raízes

        System.out.print("Digite um número: ");
        int a = Integer.parseInt(sc.nextLine());

        System.out.print("Digite um número: ");
        int b = Integer.parseInt(sc.nextLine());

        System.out.print("Digite um número: ");
        int c = Integer.parseInt(sc.nextLine());

        double d = Math.pow(b, 2) - 4 * a * c;

        double bhp = (-b + Math.sqrt(d)) / (2 * a);
        double bhn = (-b - Math.sqrt(d)) / (2 * a);

        if (d < 0) {
            System.out.println("Valor Delta: " + d);
            System.out.println("Não existem raízes reais");
        }
        if (d == 0) {
            System.out.println("Valor Delta: " + d);
            System.out.println("A raíz é " + bhp);
        }
        if (d > 0) {
            System.out.println("Valor Delta: " + d);
            System.out.println("As raízes são " + bhp + " e " + bhn);
        }

        sc.close();
    }
}