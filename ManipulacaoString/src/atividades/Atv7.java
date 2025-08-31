package atividades;

import java.util.Scanner;

public class Atv7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c;

        do {
            double temp = readTemp(sc);
            char option = readOption(sc);

            double result;
            if (option == 'C') {
                result = (temp - 32) * 5 / 9;
                System.out.println("A temperatura em Celsius é " + result);
            } else {
                result = (temp * 9 / 5) + 32;
                System.out.println("A temperatura em Fahrenheit é " + result);
            }

            System.out.print("Deseja continuar? (Escolha s/n): ");
            c = sc.next().toLowerCase().charAt(0);
            sc.nextLine();
        } while (c == 's');

        System.out.println("Fim do Programa");
    }

    public static double readTemp(Scanner sc) {
        double temp;
        do {
            System.out.print("Digite uma temperatura: ");
            try {
                temp = Double.parseDouble(sc.nextLine());
                return temp;
            } catch (NumberFormatException e) {
                System.out.println("Temperatura inválida. Digite um número válido.");
            }
        } while (true);
    }

    public static char readOption(Scanner sc) {
        char option;
        do {
            System.out.print("Você quer converter para Celsius ou Fahrenheit? (Escolha C ou F): ");
            option = sc.next().toUpperCase().charAt(0);
            sc.nextLine();
            if (option != 'C' && option != 'F') {
                System.out.println("Opção inválida. Escolha C ou F.");
            }
        } while (option != 'C' && option != 'F');
        return option;
    }
}

/*
 * Limpeza do buffer: Após usar sc.next(), adicionei sc.nextLine() para consumir
 * a linha residual e evitar problemas na próxima leitura.
 */