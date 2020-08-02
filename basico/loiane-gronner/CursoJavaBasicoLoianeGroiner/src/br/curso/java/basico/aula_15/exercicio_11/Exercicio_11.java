package exercicio_11;

import java.util.Scanner;

public class Exercicio_11 {

    private static final int VALOR_AUMENTO_FAIXA_1 = 20;
    private static final int VALOR_AUMENTO_FAIXA_2 = 15;
    private static final int VALOR_AUMENTO_FAIXA_3 = 10;
    private static final int VALOR_AUMENTO_FAIXA_4 = 5;

    private static final double VALOR_SALARIO_FAIXA_1 = 280;
    private static final double VALOR_SALARIO_FAIXA_2 = 700;
    private static final double VALOR_SALARIO_FAIXA_3 = 1500;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o salario: ");

        double valorSalarioInforme = scanner.nextDouble();
        double valorAumentoSalario = 0;
        double valorPorcentagemAumento = 0;

        if (valorSalarioInforme < VALOR_SALARIO_FAIXA_1) {

            valorAumentoSalario = (valorSalarioInforme * VALOR_AUMENTO_FAIXA_1) / 100;
            valorPorcentagemAumento = VALOR_AUMENTO_FAIXA_1;

        } else if (valorSalarioInforme >= VALOR_SALARIO_FAIXA_1 && valorSalarioInforme < VALOR_SALARIO_FAIXA_2) {

            valorAumentoSalario = (valorSalarioInforme * VALOR_AUMENTO_FAIXA_2) / 100;
            valorPorcentagemAumento = VALOR_AUMENTO_FAIXA_2;

        } else if (valorSalarioInforme >= VALOR_SALARIO_FAIXA_2 && valorSalarioInforme < VALOR_SALARIO_FAIXA_3) {

            valorAumentoSalario = (valorSalarioInforme * VALOR_AUMENTO_FAIXA_3) / 100;
            valorPorcentagemAumento = VALOR_AUMENTO_FAIXA_3;

        } else if (valorSalarioInforme >= VALOR_SALARIO_FAIXA_3) {

            valorAumentoSalario = (valorSalarioInforme * VALOR_AUMENTO_FAIXA_4) / 100;
            valorPorcentagemAumento = VALOR_AUMENTO_FAIXA_4;
        }

        System.out.println("Valor do salario sem reajuste: " + valorSalarioInforme);
        System.out.println("Valor da porcentagem aplicada: " + valorPorcentagemAumento);
        System.out.println("Valor do reajuste: " + valorAumentoSalario);
        System.out.println("Valor do salario com reajuste: " + (valorAumentoSalario + valorSalarioInforme));

        scanner.close();

    }
}