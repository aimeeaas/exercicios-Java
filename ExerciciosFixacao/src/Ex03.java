import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;

        System.out.println("Digite uma frase: ");
        frase = sc.nextLine();

    
        System.out.println("Tamanho da frase: " + frase.length() + "\n" + "Frase em maiúsculo: " + frase.toUpperCase() + "\nFrase em minúsculo: " + frase.toLowerCase());

        sc.close();

    }
    
}
