import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args){
        int novasenha, senha;
        Scanner sc = new Scanner(System.in);

        System.out.println("Crie uma senha formada por 4 números inteiros");
        novasenha = sc.nextInt();

        do {
            System.out.print("Digite sua senha: ");
            senha = sc.nextInt();

            if (senha == novasenha){
                System.out.print("Senha Correta!");
            } else {
                System.out.println("Senha Incorreta! Tente Novamente: ");
            }
        } while (senha!=novasenha);
    }
}
