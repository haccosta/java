package exercicio_6;
import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro numero: ");

        int numero_1 = scanner.nextInt();

        System.out.println("Informe o segundo numero: ");

        int numero_2 = scanner.nextInt();

        System.out.println("Informe o terceiro numero: ");

        int numero_3 = scanner.nextInt();

        int maiorNumero = 0;

        if (numero_1 > numero_2 && numero_1 > numero_3) {

            maiorNumero = numero_1;

        } else if (numero_2 > numero_1 && numero_2 > numero_3) {

            maiorNumero = numero_2;

        } else {
            maiorNumero = numero_3;
        }

        System.out.println("O maior numero e:" + maiorNumero);

    }
}