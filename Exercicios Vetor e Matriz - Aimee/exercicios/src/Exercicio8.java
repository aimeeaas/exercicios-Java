import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] scores = new int[3][4];

        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                System.out.println("Aluno " + (i + 1) + " Discplina " + (j + 1) + " Nota: ");
                scores[i][j] = Integer.parseInt(sc.nextLine());
            }
        }

        for (int i = 0; i < scores.length; i++) {
            int sumStudents = 0;
            for (int j = 0; j < scores[i].length; j++) {
                sumStudents = sumStudents + scores[i][j];
            }
            System.out.println("\nMédia das notas do aluno " + (i + 1) + ": " + ((double) sumStudents / 4));
        }

        for (int j = 0; j < scores[0].length; j++) {
            int sumCourse = 0;
            for (int i = 0; i < scores.length; i++) {
                sumCourse = sumCourse + scores[i][j];
            }
            System.out.println("\nMédia das notas na disciplina " + (j + 1) + ": " + ((double) sumCourse / 3));
        }
    }
}
