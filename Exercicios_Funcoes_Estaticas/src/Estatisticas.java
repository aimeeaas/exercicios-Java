import java.util.Arrays;

public class Estatisticas {

    // Média
    public static double media(double[] valores) {
        double soma = 0;
        for (double v : valores) { // for-each do Java
            soma += v;
        }
        return soma / valores.length;
    }

    // Desvio padrão (populacional, simples)
    public static double desvioPadrao(double[] valores) {
        double media = media(valores);
        double soma = 0;
        for (double v : valores) {
            soma += (v - media) * (v - media);
        }
        return Math.sqrt(soma / valores.length); // Math.sqrt calcula a raiz quadrada do resultado.
    }

    // Mediana
    public static double mediana(double[] valores) {
        Arrays.sort(valores);
        int n = valores.length;
        if (n % 2 == 0) {
            return (valores[n / 2 - 1] + valores[n / 2]) / 2.0;
        } else {
            return valores[n / 2];
        }
    }

    // Quartil (bem simples: só divide o array em 4 partes)
    public static double quartil1(double[] valores) {
        Arrays.sort(valores);
        return valores[valores.length / 4];
    }

    public static double quartil3(double[] valores) {
        Arrays.sort(valores);
        return valores[(3 * valores.length) / 4];
    }
}
