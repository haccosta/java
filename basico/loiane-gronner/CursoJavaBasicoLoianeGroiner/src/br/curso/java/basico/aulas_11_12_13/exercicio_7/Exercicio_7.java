import java.util.Scanner;

public class Exercicio_7 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a medida do lado do quadrado: ");

        double lado = scanner.nextDouble();

        System.out.println("A area do quadrado é" + calcularAreaQuadrado(lado));
        System.out.println("O dobro da area é: " + calcularDobroAreaQuadrado(lado));
    
    }

    private static double calcularAreaQuadrado(double lado){

        return Math.pow(lado, 2);
    }

    private static double calcularDobroAreaQuadrado (double area){

        return calcularAreaQuadrado(area) * 2;

    }
}