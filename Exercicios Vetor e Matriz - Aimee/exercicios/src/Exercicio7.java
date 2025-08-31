import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] meetings = new String[5][7];

        for (int i = 0; i < meetings.length; i++) {
            for (int j = 0; j < meetings[i].length; j++) {
                System.out.println("Descrição da reunião do dia " + (i + 1) + " no horário " + (j + 1) + ": ");
                meetings[i][j] = sc.nextLine();
            }
        }

        for (int i = 0; i < meetings.length; i++) {
            for (int j = 0; j < meetings[i].length; j++) {
                System.out.println(
                        "Descrição da reunião do dia " + (i + 1) + " no horário " + (j + 1) + ": " + meetings[i][j]);
            }
        }
    }
}
