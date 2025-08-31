import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        double temp;
        int op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Para converter Celsius digite 1 e para Fahrenheit digite 2: ");
        op = sc.nextInt();

        if (op == 1){
            System.out.println("Temperatura em Celsius: ");
            temp = sc.nextDouble();
            converteC(temp);
        }
        if (op == 2){
            System.out.println("Temperatura em Fahrenheit: ");
            temp = sc.nextDouble();
            converteF(temp);
        }

    sc.close();
    }

    public static void converteC(double celsius){
        double f = (celsius*(9.0/5.0))+32;
        System.out.println(celsius + "°C equivale a " + f + "°F");
    }
    public static void converteF(double fahrenheit){
        double c = (fahrenheit-32)*5/9;
        System.out.println(fahrenheit + "°F equivale a " + c + "°C");
    }
}