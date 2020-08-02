package exercicio_14;

import java.util.Scanner;

public class Exercicio_14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe a primeira nota: ");
		double primeiraNota = scanner.nextDouble();

		System.out.println("Informe a segunda nota: ");
		double segundaNota = scanner.nextDouble();

		double mediaNota = (primeiraNota + segundaNota) / 2;
		StringBuffer conceitoNota = new StringBuffer();
		StringBuffer situacaoAluno = new StringBuffer();

		if (mediaNota >= 9) {
			conceitoNota.append("A");
			situacaoAluno.append("Aprovado");
		} else if (mediaNota < 9 && mediaNota >= 7.5) {
			conceitoNota.append("B");
			situacaoAluno.append("Aprovado");

		} else if (mediaNota < 7.5 && mediaNota >= 6) {
			conceitoNota.append("C");
			situacaoAluno.append("Aprovado");

		} else if (mediaNota < 6 && mediaNota >= 4) {
			conceitoNota.append("D");
			situacaoAluno.append("Aprovado");

		} else if (mediaNota < 4 && mediaNota == 0) {
			conceitoNota.append("E");
			situacaoAluno.append("Aprovado");

		}
		
		System.out.println("O conceito do aluno e: " + conceitoNota.toString());
		System.out.println("A situacao do aluno e: " + situacaoAluno.toString());

	}

}
