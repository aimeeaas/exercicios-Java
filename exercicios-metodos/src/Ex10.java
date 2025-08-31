import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){
        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Número inicial: ");
        num1 = sc.nextInt();
        System.out.println("Número final: ");
        num2 = sc.nextInt();

        tabuadaPersonalizada(num1, num2);
    }

    public static void tabuadaPersonalizada(int n1, int n2){
        for (int i = 0; i<=n2; i++){
            int tab = n1*i;
            System.out.println(n1 + " X " + i + " = " + tab);
        }
    }
}
