package br.curso.java.basico.aula_15.exercicio_2;

import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero: ");

        int numeroDigitado = scanner.nextInt();

        if (numeroDigitado > 0) {
            System.out.println("Numero e positivo");

        } else {
            System.out.println("Numero e negativo");
        }

    }
}