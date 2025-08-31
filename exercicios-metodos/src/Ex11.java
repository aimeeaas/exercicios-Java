import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        int op;
        double valor, cotacao;
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor que deseja converter: ");
        valor = sc.nextDouble();
        System.out.println("Cotação da moeda: ");
        cotacao = sc.nextDouble();

        System.out.println("Menu: ");
        System.out.println("1- Reais -> Dólares");
        System.out.println("2- Dólares -> Reais");
        System.out.println("3- Reais -> Euros");
        System.out.println("4- Euros -> Reais");
        op = sc.nextInt();

        if (op == 1) {
            reaisDolares(valor, cotacao);
        } else if (op == 2) {
            dolaresReais(valor, cotacao);
        } else if (op == 3) {
            reaisEuros(valor, cotacao);
        } else if (op == 4) {
            eurosReais(valor, cotacao);
        }

        sc.close();
    }

    public static void reaisDolares(double val, double cot) {
        double conversao = val / cot;
        System.out.println("R$  " + val + " é igual a " + " $ " + conversao);
    }

    public static void dolaresReais(double val, double cot) {
        double conversao = cot * val;
        System.out.println("$ " + val + " é igual a " + " R$ " + conversao);
    }

    public static void reaisEuros(double val, double cot) {
        double conversao = val / cot;
        System.out.println("R$ " + val + " é igual a " + " € " + conversao);
    }

    public static void eurosReais(double val, double cot) {
        double conversao = val * cot;
        System.out.println("€ " + val + " é igual a " + " R$ " + conversao);
    }

}
