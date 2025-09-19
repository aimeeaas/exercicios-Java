public class Exercicio2 {
    public static void main(String[] args) {
        double[] dados = { 10, 20, 30, 40, 50, 60, 70 };

        System.out.println("Média: " + Estatisticas.media(dados));
        System.out.println("Desvio padrão: " + Estatisticas.desvioPadrao(dados));
        System.out.println("Mediana: " + Estatisticas.mediana(dados));
        System.out.println("1º Quartil: " + Estatisticas.quartil1(dados));
        System.out.println("3º Quartil: " + Estatisticas.quartil3(dados));
    }
}
