package exercicio_4;

import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe uma letra:");

        String letraDigitada = scanner.nextLine();

        if ("a".equalsIgnoreCase(letraDigitada) || "e".equalsIgnoreCase(letraDigitada)
                || "i".equalsIgnoreCase(letraDigitada) || "o".equalsIgnoreCase(letraDigitada)
                || "u".equalsIgnoreCase(letraDigitada)) {
            System.out.println("Essa letra é uma vogal");

        } else {
            System.out.println("Essa letra é uma consoante");
        }

    }
}