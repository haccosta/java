package exercicio_23;

import java.util.Scanner;

public class Exercicio_23 {
	private static final double VALOR_KG_DESCONTO_ABAIXO_5_FILE_DUPLO = 4.9;
	private static final double VALOR_KG_DESCONTO_ACIMA_5_FILE_DUPLO = 5.8;
	private static final double VALOR_KG_DESCONTO_ABAIXO_5_ALCATRA = 5.9;
	private static final double VALOR_KG_DESCONTO_ACIMA_5_ALCATRA = 6.8;
	private static final double VALOR_KG_DESCONTO_ABAIXO_5_PICANHA = 6.9;
	private static final double VALOR_KG_DESCONTO_ACIMA_5_PICANHA = 7.8;
	private static final double VALOR_DESCONTO_ADICIONAL_TOTAL_COMPRA = 5;
	private static final int FAIXA_EM_KG_DESCONTO = 5;
	private static final StringBuilder descricaoProduto = new StringBuilder();
	private static final StringBuilder descricaoPagamento = new StringBuilder();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o tipo de carne comprada: FD - File Duplo, A - Alcatra ou P - Picanha: ");
		String opcaoCarne = scanner.nextLine();

		System.out.print("Informe a quantidade em kg da opção de carne selecionada: ");
		double qtdadeCarne = scanner.nextDouble();
		scanner.nextLine();

		System.out.print("Informe a forma de pagamento: D - Dinheiro, CT - Cartão Tabajara: ");
		String formaPagamento = scanner.nextLine();
		
		preencherTipoPagamento(formaPagamento);

		double valorParcialCompra = 0;
		StringBuilder descricaoProduto = new StringBuilder();

		switch (opcaoCarne) {
		case "FD":
			valorParcialCompra = calcularPrecoFileDuplo(qtdadeCarne);
			preencherProdutoComprado("File Duplo");
			break;
		case "A":
			valorParcialCompra = calcularPrecoAlcatra(qtdadeCarne);
			preencherProdutoComprado("Alcatra");
			break;
		case "P":
			valorParcialCompra = calcularPrecoPicanha(qtdadeCarne);
			preencherProdutoComprado("Picanha");
			break;

		default:
			System.out.println("Opção Invalida!");
			break;

		}
		
		System.out.print("\n---------------------------------------------------------------------\n");

		System.out.println("Produto: " + descricaoProduto.toString() + qtdadeCarne + " kg ");
		System.out.println("Valor Total da Compra: R$" + valorParcialCompra);
		System.out.println("Tipo de Pagamento: " + descricaoPagamento.toString());
		System.out.println("Valor Desconto: "
				+ ("CT".equalsIgnoreCase(formaPagamento) ? VALOR_DESCONTO_ADICIONAL_TOTAL_COMPRA : 0));
		System.out.println(
				"Valor a Pagar R$: " + +calcularValorTotalCompra(qtdadeCarne, valorParcialCompra, formaPagamento));

	}

	private static double calcularPrecoFileDuplo(double qtdadeMacaComprada) {

		if (qtdadeMacaComprada > FAIXA_EM_KG_DESCONTO) {

			return qtdadeMacaComprada * VALOR_KG_DESCONTO_ACIMA_5_FILE_DUPLO;

		} else {
			return qtdadeMacaComprada * VALOR_KG_DESCONTO_ABAIXO_5_FILE_DUPLO;
		}

	}

	private static double calcularPrecoAlcatra(double qtdadeMacaComprada) {

		if (qtdadeMacaComprada > FAIXA_EM_KG_DESCONTO) {

			return qtdadeMacaComprada * VALOR_KG_DESCONTO_ACIMA_5_ALCATRA;

		} else {
			return qtdadeMacaComprada * VALOR_KG_DESCONTO_ABAIXO_5_ALCATRA;
		}

	}

	private static double calcularPrecoPicanha(double qtdadeMacaComprada) {

		if (qtdadeMacaComprada > FAIXA_EM_KG_DESCONTO) {

			return qtdadeMacaComprada * VALOR_KG_DESCONTO_ACIMA_5_PICANHA;

		} else {
			return qtdadeMacaComprada * VALOR_KG_DESCONTO_ABAIXO_5_PICANHA;
		}

	}

	private static double calcularValorTotalCompra(double qtdadeComprada, double totalParcialCompra,
			String formaPagamento) {

		if ("CT".equalsIgnoreCase(formaPagamento)) {
			return totalParcialCompra - ((totalParcialCompra * VALOR_DESCONTO_ADICIONAL_TOTAL_COMPRA) / 100);
		}

		return totalParcialCompra;

	}

	private static StringBuilder preencherProdutoComprado(String nomeProduto) {
		return descricaoProduto.append(nomeProduto);

	}

	private static StringBuilder preencherTipoPagamento(String nomeFormaPagamento) {

		if ("CT".equalsIgnoreCase(nomeFormaPagamento)) {
			return descricaoPagamento.append("Cartão Tabajara");

		} else {
			return descricaoPagamento.append("Dinheiro");
		}
	}
}
