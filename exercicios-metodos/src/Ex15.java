import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cálculo de Tempo de Viagem");
        System.out.print("Digite a distãncia a ser percorrida: ");
        double dist = sc.nextDouble();
        System.out.print("Digite a velocidade média do veículo: ");
        double veloc = sc.nextDouble();

        tempoEstimado(dist, veloc);
        sc.close();
    }

    public static void tempoEstimado(double d, double v) {
        double t = d / v;
        int horas = (int) t;
        int minutos = (int) ((t - horas) * 60);

        System.out.println("O tempo estimado para a viagem é de " + horas + " horas e " + minutos + " minutos.");
    }
}
