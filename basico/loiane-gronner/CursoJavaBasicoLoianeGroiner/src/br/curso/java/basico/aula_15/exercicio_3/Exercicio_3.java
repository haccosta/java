package exercicio_3;

import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe uma opção de sexo: F(Feminino) ou M(Masculino)");

        String sexoDigitado = scanner.nextLine();

        if ("F".equalsIgnoreCase(sexoDigitado)) {
            System.out.println("F - Feminino");

        } else if ("M".equalsIgnoreCase(sexoDigitado)) {
            System.out.println("M - Masculino");
        } else {

            System.out.println(" Sexo Inválido");

        }

    }
}