package exercicio_21;

import java.util.Scanner;

public class Exercicio_21 {

	private final static double VALOR_ALCOOL_VENDA = 1.90;
	private final static double VALOR_GASOLINA_VENDA = 2.50;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o tipo de combustivel: A - Alcool ou G - Gasolina: ");

		String opcaoTipoCombustivel = scanner.nextLine();

		System.out.print("Informe a quantidade em litros de combustivel abastecida: ");

		double qtdadeCombustivelAbastecida = scanner.nextDouble();

		switch (opcaoTipoCombustivel) {

		case "A":
			System.out.println("O valor a ser pago e: " + calcularValorCombustivelAlcool(qtdadeCombustivelAbastecida));
			break;

		case "G":
			System.out
					.println("O valor a ser pago e: " + calcularValorCombustivelGasolina(qtdadeCombustivelAbastecida));
			break;

		default:
			System.out.println("Opção Invalida!");
			break;

		}

	}

	private static double calcularValorCombustivelAlcool(double qtdadeCombustivel) {

		if (qtdadeCombustivel <= 20) {

			return (qtdadeCombustivel * VALOR_ALCOOL_VENDA)
					- (((qtdadeCombustivel * VALOR_ALCOOL_VENDA) * 3) / 100);

		} else if (qtdadeCombustivel > 20) {
			return (qtdadeCombustivel * VALOR_ALCOOL_VENDA)
					- (((qtdadeCombustivel * VALOR_ALCOOL_VENDA) * 5) / 100);

		}

		return 0;

	}

	private static double calcularValorCombustivelGasolina(double qtdadeCombustivel) {

		if (qtdadeCombustivel <= 20) {

			return (qtdadeCombustivel * VALOR_GASOLINA_VENDA)
					- (((qtdadeCombustivel * VALOR_GASOLINA_VENDA) * 4) / 100);

		} else if (qtdadeCombustivel > 20) {
			return (qtdadeCombustivel * VALOR_GASOLINA_VENDA)
					- (((qtdadeCombustivel * VALOR_GASOLINA_VENDA) * 6) / 100);

		}

		return 0;

	}
}
