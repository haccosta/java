import java.util.Scanner;

public class Exercicio_10 {
    public static void main (String[] args){
        Scanner  scanner = new Scanner(System.in);

        System.out.println("Informe o valor em graus Celsius");

        double grausCelsius = scanner.nextDouble();

        System.out.println("O valor convertido para graus Farenheit e : " + converterGrausCelsiusEmFarenheit(grausCelsius));

    }

    public static double converterGrausCelsiusEmFarenheit(double grausCelsius){

        return (grausCelsius * 9/5) + 32;

    }
}