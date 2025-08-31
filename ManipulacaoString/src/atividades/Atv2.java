package atividades;

import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Digite um número inteiro: ");
            int n = Integer.parseInt(sc.nextLine());
            System.out.println("Entrada Válida!");
        } catch (NumberFormatException e) {
            System.out.println("Erro: Entrada Inválida! Tente novamente");
            sc.next();
        }
    }
}
