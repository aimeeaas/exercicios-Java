
    public class Ex04 {
        public static void main(String[] args){

            int[] numeros = {10, 20};

            System.out.println("Antes: ");
            System.out.println("número 1 = " + numeros[0]);
            System.out.println("número 2 = " + numeros[1]);

            trocaValores(numeros);

            System.out.println("Depois: ");
            System.out.println("número 1 = " + numeros[0]);
            System.out.println("número 2 = " + numeros[1]);
        }

        public static void trocaValores(int[] numeros) {
            int troca = numeros[0];
            numeros[0] = numeros[1];
            numeros[1] = troca;
        }

    }
