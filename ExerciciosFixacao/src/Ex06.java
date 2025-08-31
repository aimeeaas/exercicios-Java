import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;

        System.out.println("Qual a sua idade?");
        idade = sc.nextInt();
        verificaIdade(idade);
        
        sc.close();

    }

    public static void verificaIdade(int id){
        if (id<18) {
            System.out.println("Menor de idade");
        } else if(id>=18 && id<=65){
            System.out.println("Adulto");
        }else{
            System.out.println("Idoso");
        }
    }

    
}
