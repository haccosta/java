/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.curso.java.basico.aula_17.exercicio_8;

import java.util.Scanner;

/**
 *
 * @author Handerson
 */
public class Exercicio_8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int somaNumero = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe um numero :");
            int numeroDigitado = scanner.nextInt();

            somaNumero = somaNumero + numeroDigitado;

        }

        System.out.println("A soma dos numeros é :" + somaNumero);
        System.out.println("A media dos numeros é: " + somaNumero / 5);
    }

}
