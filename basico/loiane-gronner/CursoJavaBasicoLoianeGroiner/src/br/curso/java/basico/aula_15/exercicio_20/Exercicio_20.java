package exercicio_20;

import java.util.Scanner;

public class Exercicio_20 {

	private static int totRespostaPositiva = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Telefonou para a vítima ?");
		String respostaDigitada = scanner.nextLine();
		acumularRespostaPositiva(respostaDigitada);

		System.out.println("Esteve no local do crime");
		respostaDigitada = scanner.nextLine();
		acumularRespostaPositiva(respostaDigitada);

		System.out.println("Mora perto da vítima?");
		respostaDigitada = scanner.nextLine();
		acumularRespostaPositiva(respostaDigitada);

		System.out.println("Devia para a vítima?");
		respostaDigitada = scanner.nextLine();
		acumularRespostaPositiva(respostaDigitada);

		System.out.println("Já trabalhou com a vítima?");
		respostaDigitada = scanner.nextLine();
		acumularRespostaPositiva(respostaDigitada);

		classificarParticipacaoCrime(totRespostaPositiva);
	}

	private static void acumularRespostaPositiva(String respostaDigitada) {
		if ("Sim".equalsIgnoreCase(respostaDigitada)) {
			totRespostaPositiva++;
		}

	}

	private static void classificarParticipacaoCrime(int totRespostaPositiva) {

		if (totRespostaPositiva == 2) {
			System.out.println("Suspeito");
		} else if (totRespostaPositiva == 3 || totRespostaPositiva == 4) {
			System.out.println("Cúmplice");
		} else if (totRespostaPositiva == 5) {
			System.out.println("Assassino");
		} else {
			System.out.println("Inocente");
		}

	}

}
