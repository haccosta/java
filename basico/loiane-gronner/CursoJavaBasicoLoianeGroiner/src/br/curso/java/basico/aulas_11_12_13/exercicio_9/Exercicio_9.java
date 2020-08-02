import java.util.Scanner;

public class Exercicio_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor em graus Farenheit: ");

        double valorFarenheit = scanner.nextDouble();

        System.out.println(
                "O valor convertido para graus Celsius e: " + converterGrausFarenheitEmCelsius(valorFarenheit));

    }

    private static double converterGrausFarenheitEmCelsius(double grausFarenheit) {
        return (5 * (grausFarenheit - 32) / 9);

    }
}