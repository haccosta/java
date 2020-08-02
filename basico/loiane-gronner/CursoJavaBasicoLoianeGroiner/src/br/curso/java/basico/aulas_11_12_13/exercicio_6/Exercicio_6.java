import java.util.Scanner;

public class Exercicio_6{
    
    public static void main (String[] args ){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor do raio: ");
        System.out.println("O valor da área do circulo e: " + calcularAreaCirculo(scanner.nextFloat()));

    }

    public static double calcularAreaCirculo(double raio){

        return Math.PI * Math.pow(raio, 2);

    }
}