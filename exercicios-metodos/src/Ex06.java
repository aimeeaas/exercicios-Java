import java.util.Scanner;
    public class Ex06 {
        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);

            System.out.println("Digite uma frase: ");
            String frase = sc.nextLine();

            int total = contarLetras(frase);

            System.out.println("A frase contém " + total + " letras.");

            sc.close();

        }

        public static int contarLetras(String frase) {
            int contador = 0;
            for (int i=0; i<frase.length(); i++){
                char qnt = frase.charAt(i);
                if (Character.isLetter(qnt)) {
                    contador++;
                }
            }
            return contador;
        }
    }
