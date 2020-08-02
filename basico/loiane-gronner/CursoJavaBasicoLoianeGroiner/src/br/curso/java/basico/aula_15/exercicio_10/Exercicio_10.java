package exercicio_10;

import java.util.Scanner;

public class Exercicio_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o periodo desejado: M-Matutino ou V-Vespertino ou N- Noturno: ");

		String periodoDigitado = scanner.nextLine();

		switch (periodoDigitado) {
		case "M":
			System.out.println("Bom dia!");
			break;
		case "V":
			System.out.println("Boa tarde!");
			break;
		case "N":
			System.out.println("Boa noite!");
			break;
		default:
			System.out.println("Opção invalida!");
			break;
		}

		scanner.close();
	}

}