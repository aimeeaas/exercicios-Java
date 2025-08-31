import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args){
        String texto;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma frase: ");
        texto = sc.nextLine();

        int numeroVogais = contarVogais(texto);
        int numeroConsoantes = contarConsoantes(texto);

        System.out.println("O número de vogais é " + numeroVogais + " e o de consoantes é " + numeroConsoantes );

        sc.close();
    }
    public static int contarVogais(String vogal){
        String frase = vogal.toLowerCase();
        int cont = 0;
        for (int i = 0; i<frase.length(); i++){
            char c = frase.charAt(i);
            if (c == 'a' || c == 'á' || c == 'ã' || c == 'à' || c == 'â' || c == 'é' || c == 'e' || c == 'ê' || c == 'i' || c == 'í' || c == 'o' || c == 'ó' || c == 'ô' || c == 'u' || c == 'ú'){
                cont ++;
            }
        }
        return cont;
    }

    public static int contarConsoantes(String consoante){
        String frase = consoante.toLowerCase();
        int cont = 0;
        for (int i = 0; i<frase.length(); i++){
            char c = frase.charAt(i);
            if (c == 'b' || c == 'c' || c == 'd'|| c == 'f'|| c == 'g'|| c == 'h'|| c == 'j'|| c == 'k'|| c == 'l'|| c == 'm'|| c == 'n'|| c == 'p'|| c == 'q'|| c == 'r'|| c == 's'|| c == 't'|| c == 'v'|| c == 'w'|| c == 'x'|| c == 'y'|| c == 'z'){
                cont++;
            }
        }
        return cont;
    }
}
