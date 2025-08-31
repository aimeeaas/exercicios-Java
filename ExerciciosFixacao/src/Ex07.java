import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        try{
            System.out.println("Digite um número de 1 a 7: ");
            num = sc.nextInt();
            diaSemana(num);
            sc.close();

        }catch(InputMismatchException e){
            System.out.println("Erro!");
        }
    }

    public static void diaSemana(int numero){
        switch (numero) {
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            case 1:
                System.out.println("Domingo");
                break;
        }
    }
    
}
