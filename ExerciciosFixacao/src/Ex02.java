import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;

        System.out.println("Nome: ");
        nome = sc.nextLine();
        System.out.println("Idade: ");
        idade = sc.nextInt();

        System.out.println("Olá, " + nome + "! " + "Você tem " + idade + " anos");

        sc.close();
    }
    
}
