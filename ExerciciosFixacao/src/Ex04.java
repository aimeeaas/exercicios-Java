import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra01, palavra02;

        System.out.println("1° Frase: ");
        palavra01 = sc.nextLine();
        System.out.println("2° Frase: ");
        palavra02 = sc.nextLine();


        if (palavra01.equalsIgnoreCase(palavra02)) {
            System.out.println("As palavras são iguais");
        }else{
            System.out.println("As palavras não são iguais");
        }

        sc.close();
    }
    
}
