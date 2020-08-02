package exercicio_15;

import java.util.Scanner;

public class Exercicio_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o primeiro lado do triangulo: ");
		double valorPrimeiroLadoTriangulo = scanner.nextDouble();

		System.out.println("Informe o segundo lado do triangulo: ");
		double valorSegundoLadoTriangulo = scanner.nextDouble();

		System.out.println("Informe o terceiro lado do triangulo: ");
		double valorTerceiroLadoTriangulo = scanner.nextDouble();

		if (isTriangulo(valorPrimeiroLadoTriangulo, valorSegundoLadoTriangulo, valorTerceiroLadoTriangulo)) {
			
			System.out.println(retornarTipoTriangulo(valorPrimeiroLadoTriangulo, valorSegundoLadoTriangulo,
					valorTerceiroLadoTriangulo));
		}

	}

	private static boolean isTriangulo(double valorA, double valorB, double valorC) {

		if ((valorA + valorB) > valorC) {

			return true;

		} else if ((valorB + valorC) > valorA) {

			return true;

		} else if ((valorA + valorC) > valorB) {

			return true;

		}

		return false;

	}

	private static String retornarTipoTriangulo(double valorA, double valorB, double valorC) {

		if (valorA == valorB && valorA == valorC) {
			return "Triângulo Equilatero";

		} else if ((valorA == valorB || valorA == valorC)) {

			return "Triângulo Isósceles";

		} else {
			return "Triângulo Escaleno";

		}

	}

}
