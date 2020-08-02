package exercicio_7;
import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maiorNumero = 0;
        int menorNumero = 0;

        System.out.println("Informe o primeiro numero: ");

        int numero_1 = scanner.nextInt();

        maiorNumero = numero_1;
        menorNumero = numero_1;

        System.out.println("Informe o segundo numero: ");

        int numero_2 = scanner.nextInt();

        if (numero_2 > maiorNumero) {

            maiorNumero = numero_2;

        }

        if (numero_2 < menorNumero) {
            menorNumero = numero_2;
        }

        System.out.println("Informe o terceiro numero: ");

        int numero_3 = scanner.nextInt();

        if (numero_3 > maiorNumero) {

            maiorNumero = numero_3;

        }

        if (numero_3 < menorNumero) {
            menorNumero = numero_3;
        }

        System.out.println("O maior numero e:" + maiorNumero);
        System.out.println("O menor numero e:" + menorNumero);

    }
}