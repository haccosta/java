package exercicio_19;

import java.util.Scanner;

public class Exercicio_19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Selecione uma das opçoes de operações a seguir: ");
		System.out.println("1 - Adição");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divição");
		System.out.println("Informe a opção: ");

		int opcaoOperacao = scanner.nextInt();

		switch (opcaoOperacao) {

		case 1:
			System.out.println("Informe o primeiro numero: ");
			int primeiroNumero = scanner.nextInt();

			System.out.println("Informe o segundo numero: ");
			int segundoNumero = scanner.nextInt();

			int resultado = primeiroNumero + segundoNumero;

			System.out.println("O valor da soma e: " + resultado);
			System.out.println("O resultado encontrado é um numero " + (resultado % 2 == 0 ? "par" : "impar"));
			System.out.println("O resultado encontrado é um numeto: " + (resultado > 0 ? "positivo" : "negativo"));

			break;
		case 2:
			System.out.println("Informe o primeiro numero: ");
			primeiroNumero = scanner.nextInt();

			System.out.println("Informe o segundo numero: ");
			segundoNumero = scanner.nextInt();

			resultado = primeiroNumero - segundoNumero;

			System.out.println("O valor da subtracao e: " + resultado);
			System.out.println("O resultado encontrado é um numero " + (resultado % 2 == 0 ? "par" : "impar"));
			System.out.println("O resultado encontrado é um numeto: " + (resultado > 0 ? "positivo" : "negativo"));

			break;
		case 3:
			System.out.println("Informe o primeiro numero: ");
			primeiroNumero = scanner.nextInt();

			System.out.println("Informe o segundo numero: ");
			segundoNumero = scanner.nextInt();

			resultado = primeiroNumero * segundoNumero;

			System.out.println("O valor da multiplicacao e: " + resultado);
			System.out.println("O resultado encontrado é um numero " + (resultado % 2 == 0 ? "par" : "impar"));
			System.out.println("O resultado encontrado é um numeto: " + (resultado > 0 ? "positivo" : "negativo"));

			break;
		case 4:
			System.out.println("Informe o primeiro numero: ");
			primeiroNumero = scanner.nextInt();

			System.out.println("Informe o segundo numero: ");
			segundoNumero = scanner.nextInt();

			resultado = primeiroNumero / segundoNumero;

			System.out.println("O valor da divisao e: " + resultado);
			System.out.println("O resultado encontrado é um numero " + (resultado % 2 == 0 ? "par" : "impar"));
			System.out.println("O resultado encontrado é um numeto: " + (resultado > 0 ? "positivo" : "negativo"));

			break;
		default:
			System.out.println("Opção inválida!");

		}

	}

}
