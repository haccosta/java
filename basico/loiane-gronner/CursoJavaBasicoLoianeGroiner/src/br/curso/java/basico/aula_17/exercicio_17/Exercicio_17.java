/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.curso.java.basico.aula_17.exercicio_17;

import java.util.Scanner;

/**
 *
 * @author Handerson
 */
public class Exercicio_17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero: ");

        int numeroDigitado = scanner.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= numeroDigitado; i++) {
            fatorial *= i;
            System.out.println("Fatorial de " + i + "=" + fatorial);
        }
    }

}
