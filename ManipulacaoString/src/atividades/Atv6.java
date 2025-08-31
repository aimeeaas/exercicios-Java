package atividades;

import java.util.Scanner;

public class Atv6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Crie uma senha: ");
            String password = sc.nextLine();

            int size = password.length();

            if (size >= 8 && upperCase(password) && lowerCase(password) && number(password)) {
                System.out.print("A senha foi criada!");
            } else {
                System.out.print("A senha não pode ser criada!");
            }

        } catch (Exception e) {
            System.out.println("Erro! Tente novamente");
        }
    }

    public static boolean upperCase(String password) {
        for (int i = 0; i < password.length(); i++) {
            char pass = password.charAt(i);
            if (pass >= 'A' && pass <= 'Z') {
                return true;
            }
        }
        return false;
    }

    public static boolean lowerCase(String password) {
        for (int i = 0; i < password.length(); i++) {
            char pass = password.charAt(i);
            if (pass >= 'a' && pass <= 'z') {
                return true;
            }
        }
        return false;
    }

    public static boolean number(String password) {
        for (int i = 0; i < password.length(); i++) {
            char pass = password.charAt(i);
            if (pass >= '0' && pass <= '9') {
                return true;
            }
        }
        return false;
    }
}
