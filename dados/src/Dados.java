public class Dados {
    public static void main(String[] args) throws Exception {
        /*
         * Números e String são incompátiveis então se quiser converter de um para outro
         * tem que fazer da maneira abaixo:
         */
        int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor);

        String valor1 = "40";
        int ida = Integer.parseInt(valor1);
        System.out.println(ida);

        String valor2 = "40.5";
        float idad = Float.parseFloat(valor2);
        System.out.println(idad);
    }
}
