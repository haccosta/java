package exercicio_17;

import java.util.Scanner;

public class Exercicio_17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe um ano: ");

		int anoDigitado = scanner.nextInt();

		if (((anoDigitado % 4 == 0) || anoDigitado % 400 == 0) && (anoDigitado % 100 != 0)) {
			System.out.println("O ano " + anoDigitado + " bissexto");

		} else {

			System.out.println("O ano " + anoDigitado + " nao e bissexto");
		}

	}

}
