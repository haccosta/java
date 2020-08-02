import java.util.Scanner;

public class Exercicio_3{
    public static void main (String[] argss){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro numero :");
        int a = scanner.nextInt();
        System.out.println("Informe o segundo numero :");
        int b = scanner.nextInt();
        
        System.out.print("A soma dos numeros e: " + soma(a,b));
    }

    public static int soma (int numero_1, int numero_2){

        return numero_1 + numero_2;

    }
}