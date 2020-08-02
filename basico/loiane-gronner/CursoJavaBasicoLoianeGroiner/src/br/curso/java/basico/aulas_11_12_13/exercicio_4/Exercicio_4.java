import java.util.Scanner;

public class Exercicio_4{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        int nota_1 = scanner.nextInt();

        System.out.println("Informe a segunda nota: ");
        int nota_2 = scanner.nextInt();
        
        System.out.println("Informe a terceira nota: ");
        int nota_3 = scanner.nextInt();
        
        System.out.println("Informe a quarta nota: ");
        int nota_4 = scanner.nextInt();   

        System.out.println("A media das notas e: " + calcularMedia(nota_1, nota_2, nota_3, nota_4));

    }

    private static int calcularMedia (int nota_1, int  nota_2, int nota_3, int nota_4){

        return (nota_1 + nota_2 + nota_3 + nota_4)/4;

    }
}