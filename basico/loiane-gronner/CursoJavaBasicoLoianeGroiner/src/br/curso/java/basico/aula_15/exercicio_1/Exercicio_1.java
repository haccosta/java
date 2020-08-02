package br.curso.java.basico.aula_15.exercicio_1;

import java.util.Scanner;

public class Exercicio_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o primeiro numero: ");
		int primeiroNumeroDigitado = scanner.nextInt();

		System.out.println("Informe o segundo numero: ");

		int segundoNumeroDigitado = scanner.nextInt();

		System.out.println("O numero maior e: "
				+ (primeiroNumeroDigitado > segundoNumeroDigitado ? primeiroNumeroDigitado : segundoNumeroDigitado));

	}

}
