import java.util.Scanner;
    public class Ex07 {
        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);

            int [] nota = new int[3];
            int [] peso = new int[3];

            for(int i=0; i<3; i++){
                System.out.println("Digite a nota "  + (i + 1) + ": ");
                nota[i] = sc.nextInt();

                System.out.println("Peso da nota " + (i + 1) + ": ");
                peso[i] = sc.nextInt();
            }

            double media = calculaMedia(nota, peso);

            if (media > 7.0){
                System.out.println("Aluno Aprovado! Média: " +media);
            }else{
                System.out.println("Aluno Reprovado! Média: " +media);
            }

            sc.close();

        }

        public static double calculaMedia(int[] nota, int[] peso) {
            double somaNota = 0;
            double somaPeso = 0;
            for (int i = 0; i < 3; i++) {
                somaNota += nota[i] * peso[i];
                somaPeso += peso[i];
            }
            return somaNota / somaPeso;
        }

    }
