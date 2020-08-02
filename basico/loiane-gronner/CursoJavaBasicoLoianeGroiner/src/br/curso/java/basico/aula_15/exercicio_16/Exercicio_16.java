package exercicio_16;

import java.util.Scanner;

public class Exercicio_16 {
	public static void main(String[] args) {
		int a, b, c, delta, d = -4, b2, v2;
		double r2, r1;
		// Renomeando importações
		Scanner sc = new Scanner(System.in);

		// Capturando variáveis
		System.out.print("Digite o termo \"a\": ");
		a = sc.nextInt();
		System.out.print("Digite o termo \"b\": ");
		b = sc.nextInt();
		System.out.print("Digite o termo \"c\": ");
		c = sc.nextInt();

		System.out.println("");

		// Fórmula de Báskara - (Resoluções - Cálculos -Resoluções)
		System.out.println("APLICAÇÃO DA FÓRMULA DE BÁSKARA: ");
		System.out.println("Resolução da Fórmula de Báskara: b²-4.a.c ");
		System.out.println("Resolução da Fórmula de Báskara: " + b + "²" + d + "*" + a + "*" + c);
		b2 = (int) Math.pow(2,b);
		v2 = ((-4) * (a) * (c));
		delta = (b * b) + ((-4) * (a) * (c));
		if (v2 > 0) {
			System.out.println("Resolução da Fórmula de Báskara: " + b2 + "+" + v2);
		} else
			System.out.println("Resolução da Fórmula de Báskara: " + b2 + "-" + v2);
		System.out.println("Resolução da Fórmula de Báskara: " + (delta));

		System.out.println("");

		// Fórmula Geral da Equação de segundo grau.
		System.out.println("Resultados das raízes: ");
		if (delta < 0) {
			System.out.println("Não existe raíz real, Delta=0");
		} else {
			r1 = (-b + Math.sqrt(delta)) / (2 * a);
			System.out.println("A 1º raíz é: " + r1);
			r2 = (-b - Math.sqrt(delta)) / (2 * a);
			System.out.println("A 2º raíz é: " + r2);

		}
	}
}
