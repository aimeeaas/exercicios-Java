import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {
    public static void main (String[] args){
        double num, soma, media=0;
        int i =0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Digite um número real: ");
            num = sc.nextDouble();
            i++;
            media +=num;
            System.out.println("Se deseja encerrar o programa, digite 0, caso contrário, digite um número real");
        } while (num !=0);

        System.out.println("Foram entrados " + (i-1) + " números");
        System.out.println("A média é: " + (media/(i-1)));
    }
}
