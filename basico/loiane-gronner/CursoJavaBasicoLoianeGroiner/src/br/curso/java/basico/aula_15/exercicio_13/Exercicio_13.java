package exercicio_13;

import java.util.Scanner;

public class Exercicio_13 {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("Informe um valor numerico para o dia da semana");
		
		int numeroDiaSemana = scanner.nextInt();
		
		switch(numeroDiaSemana) {
		case 1:
			System.out.println("O valor informado corresponde ao Domingo");
			break;
		case 2:
			System.out.println("O valor informado corresponde ao Segunda-Feira");
			break;
		case 3:
			System.out.println("O valor informado corresponde ao Terça-Feira");
			break;
		case 4:
			System.out.println("O valor informado corresponde ao Quarta-Feira");
			break;
		case 5:
			System.out.println("O valor informado corresponde ao Quinta-Feira");
			break;
		case 6:
			System.out.println("O valor informado corresponde ao Sexta-Feira");
			break;
		case 7:
			System.out.println("O valor informado corresponde ao Sábado");
			break;
		default:
			System.out.println("O valor invalido!");
		}

	}

}
