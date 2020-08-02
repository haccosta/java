package exercicio_12;

import java.util.Scanner;

public class Exercicio_12 {

	private static final double VALOR_FAIXA_1_SALARIO_IMPOSTO_RENDA = 900;
	private static final double VALOR_FAIXA_2_SALARIO_IMPOSTO_RENDA = 1500;
	private static final double VALOR_FAIXA_3_SALARIO_IMPOSTO_RENDA = 2500;

	private static final int VALOR_FAIXA_1_PERCENTUAL_IMPOSTO_RENDA = 5;
	private static final int VALOR_FAIXA_2_PERCENTUAL_IMPOSTO_RENDA = 10;
	private static final int VALOR_FAIXA_3_PERCENTUAL_IMPOSTO_RENDA = 20;

	private static final int VALOR_DESCONTO_SINDICATO = 3;
	private static final int VALOR_DESCONTO_INSS = 10;
	private static final int VALOR_DESCONTO_FGTS = 11;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o valor da hora :");

		double valorRealHoraPreenchida = scanner.nextDouble();

		System.out.println("Informe o total de horas trabalhadas :");

		double totalHorasPreenchida = scanner.nextDouble();

		double valorSalarioMensal = valorRealHoraPreenchida * totalHorasPreenchida;
		double valorDescontoIRPF = 0;
		double valorCalculadoInss = 0;
		double valorCalculadoFgts = 0;
		double valorDescontoSindicato = 0;
		int percentualrDescontoIRPF = 0;

		if (valorSalarioMensal > VALOR_FAIXA_1_SALARIO_IMPOSTO_RENDA
				&& valorSalarioMensal <= VALOR_FAIXA_2_SALARIO_IMPOSTO_RENDA) {
			valorDescontoIRPF = (valorSalarioMensal * VALOR_FAIXA_1_PERCENTUAL_IMPOSTO_RENDA) / 100;
			percentualrDescontoIRPF = VALOR_FAIXA_1_PERCENTUAL_IMPOSTO_RENDA;

		} else if (valorSalarioMensal > VALOR_FAIXA_2_SALARIO_IMPOSTO_RENDA
				&& valorSalarioMensal <= VALOR_FAIXA_3_SALARIO_IMPOSTO_RENDA) {
			valorDescontoIRPF = (valorSalarioMensal * VALOR_FAIXA_2_PERCENTUAL_IMPOSTO_RENDA) / 100;
			percentualrDescontoIRPF = VALOR_FAIXA_2_PERCENTUAL_IMPOSTO_RENDA;

		} else if (valorSalarioMensal > VALOR_FAIXA_3_SALARIO_IMPOSTO_RENDA) {
			valorDescontoIRPF = (valorSalarioMensal * VALOR_FAIXA_3_PERCENTUAL_IMPOSTO_RENDA) / 100;
			percentualrDescontoIRPF = VALOR_FAIXA_3_PERCENTUAL_IMPOSTO_RENDA;
		}

		valorDescontoSindicato = (VALOR_DESCONTO_SINDICATO * valorSalarioMensal) / 100;
		valorCalculadoInss = (VALOR_DESCONTO_INSS * valorSalarioMensal) / 100;
		valorCalculadoFgts = (VALOR_DESCONTO_FGTS * valorSalarioMensal) / 100;

		System.out.println(
				"Salario Bruto: (" + totalHorasPreenchida + " *" + valorRealHoraPreenchida + ")" + valorSalarioMensal);
		System.out.println("(-) IR (" + percentualrDescontoIRPF + "% )" + valorDescontoIRPF);
		System.out.println("(-) INSS (" + VALOR_DESCONTO_INSS + "%)" + valorCalculadoInss);
		System.out.println("(-) Sindicato (" + VALOR_DESCONTO_SINDICATO + "%)" + valorDescontoSindicato);
		System.out.println("FGTS (" + VALOR_DESCONTO_FGTS + "%)" + valorCalculadoFgts);
		System.out.println("Total de Desconto: " + (valorCalculadoInss + valorDescontoSindicato + valorDescontoIRPF));
		System.out.println("Salario Liquido: "
				+ (valorSalarioMensal - (valorCalculadoInss + valorDescontoSindicato + valorDescontoIRPF)));

	}

}
