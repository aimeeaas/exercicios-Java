import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vetorNums = new int[10];
        int ma, me;

        try {
            System.out.println("Digite 10 números:");
            vetorNums[0] = Integer.parseInt(sc.nextLine());
            ma = vetorNums[0];
            me = vetorNums[0];

            for (int i = 1; i < vetorNums.length; i++) {
                vetorNums[i] = Integer.parseInt(sc.nextLine());

                if (vetorNums[i] > ma) {
                    ma = vetorNums[i];
                }

                if (vetorNums[i] < me) {
                    me = vetorNums[i];
                }
            }

            System.out.println("Maior número = " + ma + "\nMenor número = " + me);

        } catch (NumberFormatException e) {
            System.out.println("Erro na entrada do valor!");
        }
        sc.close();
    }

}
