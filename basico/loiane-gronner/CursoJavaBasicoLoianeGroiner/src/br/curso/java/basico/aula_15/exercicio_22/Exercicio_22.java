package exercicio_22;

import java.util.Scanner;

public class Exercicio_22 {

	private static final double VALOR_KG_DESCONTO_ABAIXO_5_MACA = 1.8;
	private static final double VALOR_KG_DESCONTO_ACIMA_5_MACA = 1.5;
	private static final double VALOR_KG_DESCONTO_ABAIXO_5_MORANGO = 2.5;
	private static final double VALOR_KG_DESCONTO_ACIMA_5_MORANGO = 2.2;
	private static final double VALOR_DESCONTO_ADICIONAL_TOTAL_COMPRA = 10;
	private static final int FAIXA_EM_KG_DESCONTO = 5;
	private static final int FAIXA_EM_KG_TOTAL_DESCONTO = 20;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe a quantidade em kg de maças compradas pelo cliente :");
		double qtdadeMacaComprada = scanner.nextDouble();

		System.out.println("Informe a quantidade em kg de morangos comprados pelo cliente :");
		double qtdadeMorangoComprado = scanner.nextDouble();

		double valorParcialMaca = calcularPrecoMaca(qtdadeMacaComprada);
		double valorParcialMorango = calcularPrecoMorango(qtdadeMorangoComprado);
		double valorParcialCompra = valorParcialMaca + valorParcialMorango;
		double qtdadeTotalCompra = qtdadeMacaComprada + qtdadeMorangoComprado;

		System.out.println(
				"O valor total da compra é: " + calcularValorTotalCompra(qtdadeTotalCompra, valorParcialCompra));

	}

	private static double calcularPrecoMaca(double qtdadeMacaComprada) {

		if (qtdadeMacaComprada > FAIXA_EM_KG_DESCONTO) {

			return qtdadeMacaComprada * VALOR_KG_DESCONTO_ACIMA_5_MACA;

		} else {
			return qtdadeMacaComprada * VALOR_KG_DESCONTO_ABAIXO_5_MACA;
		}

	}

	private static double calcularPrecoMorango(double qtdadeMorangoComprado) {

		if (qtdadeMorangoComprado > FAIXA_EM_KG_DESCONTO) {

			return qtdadeMorangoComprado * VALOR_KG_DESCONTO_ACIMA_5_MORANGO;

		} else {
			return qtdadeMorangoComprado * VALOR_KG_DESCONTO_ABAIXO_5_MORANGO;
		}

	}

	private static double calcularValorTotalCompra(double qtdadeComprada, double totalParcialCompra) {

		if (qtdadeComprada > FAIXA_EM_KG_TOTAL_DESCONTO) {
			return totalParcialCompra - ((totalParcialCompra * VALOR_DESCONTO_ADICIONAL_TOTAL_COMPRA) / 100);
		}

		return totalParcialCompra;

	}

}
