package atividades;

import java.util.Scanner;

public class Atv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String confirm;
        try {
            do {
                System.out.print("Digite um número: ");
                int n1 = Integer.parseInt(sc.nextLine());

                System.out.print("Digite um número: ");
                int n2 = Integer.parseInt(sc.nextLine());

                System.out.print("Qual operação deseja realizar? (+, -, *, /): ");
                char op = sc.nextLine().charAt(0);

                if (op == '+') {
                    int sum = n1 + n2;
                    System.out.println("Resultado: " + sum);
                }

                if (op == '-') {
                    int sub = n1 - n2;
                    System.out.println("Resultado: " + sub);
                }

                if (op == '*') {
                    int mult = n1 * n2;
                    System.out.println("Resultado: " + mult);
                }

                if (op == '/') {
                    int spli = n1 / n2;
                    System.out.println("resultado: " + spli);
                }

                System.out.println("Deseja sair? s/n");
                confirm = sc.nextLine();

            } while (confirm.equals("n"));
            System.out.println("Fim do Programa");

        } catch (ArithmeticException e) {
            System.out.println("Erro! Não é válido divisão por 0 (zero)");
            sc.next();
        }

    }
}
