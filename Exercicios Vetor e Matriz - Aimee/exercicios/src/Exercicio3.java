import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float[] temps = new float[7];
        float a = Float.MIN_VALUE;
        float b = Float.MAX_VALUE;

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Insira a temperatura: ");
            temps[i] = Float.parseFloat(sc.nextLine());

            if (temps[i] > a) {
                a = temps[i];
            }

            if (temps[i] < b) {
                b = temps[i];
            }
        }
        System.out.println("Temperatura mais alta: " + a + " e Temperatura mais baixa: " + b);
    }
}
