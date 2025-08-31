import java.util.Scanner;

public class Ex05 {
        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);

            System.out.println("Digite um número: ");
            int num = sc.nextInt();

            raiz(num);

            sc.close();
        }

        public static void raiz(int num) {
            double resultado = Math.sqrt(num);
            System.out.println("Raiz Quadrada de " + num + " é: " + resultado);
    }
}
