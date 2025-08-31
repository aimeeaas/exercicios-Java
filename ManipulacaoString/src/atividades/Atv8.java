package atividades;

import java.util.Scanner;
import java.util.Random;

public class Atv8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Cria um objeto da classe Random que permite gerar números aleatórios.
        Random rdm = new Random();
        // Gera um número inteiro aleatório no intervalo de 0 a 99, e somando 1 garante
        // que o número estará entre 1 e 100.
        int randomNumber = rdm.nextInt(100) + 1;

        int num = 0;
        boolean acertou = false;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!" + '\n'
                + "Tente adivinhar o número entre 1 e 100 ou Digite '0' para sair do jogo");

        while (!acertou) {

            System.out.print("Adivinhe o número da jogada: ");
            try {
                num = Integer.parseInt(sc.nextLine());

                if (num == 0) {
                    System.out.println("Você escolheu sair. O número secreto era: " + randomNumber);
                }

                if (num > randomNumber) {
                    System.out.println("Palpite alto");
                }
                if (num < randomNumber) {
                    System.out.println("Palpite baixo");
                }
                if (num == randomNumber) {
                    System.out.println("Você acertou!");
                    acertou = true;
                }

            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                sc.next();
            }
        }
    }
}
