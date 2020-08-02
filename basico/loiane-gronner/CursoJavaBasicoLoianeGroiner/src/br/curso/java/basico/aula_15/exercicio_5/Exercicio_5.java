package exercicio_5;

import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");

        double nota_1 = scanner.nextDouble();

        System.out.println("Informe a segunda nova: ");

        double nota_2 = scanner.nextDouble();

        double media = (nota_1 + nota_2) / 2;

        if (media == 10.0) {

            System.out.println("Aprovado com Distincao");

        } else if (media >= 7.0) {

            System.out.println("Aprovado");

        } else {
            System.out.println("Reprovado");

        }

    }
}