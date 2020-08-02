package exercicio_18;
import java.util.Scanner;

public class Exercicio_18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe uma numero: ");

		int numeroDigitado = scanner.nextInt();

		System.out.println("o numero digitado " + numeroDigitado + " é " + (numeroDigitado % 2 == 0 ? "par" : "impar"));
	}

}
