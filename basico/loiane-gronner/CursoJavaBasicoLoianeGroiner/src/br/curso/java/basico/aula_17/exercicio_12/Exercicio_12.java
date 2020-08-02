/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.curso.java.basico.aula_17.exercicio_12;

import java.util.Scanner;

/**
 *
 * @author Handerson
 */
public class Exercicio_12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean invalido = false;
        do {
            System.out.println("Informe o numero que será a base da tabuada: ");
            int baseTabuada = scanner.nextInt();

            if (baseTabuada < 1 || baseTabuada > 10) {
                invalido = true;
            } else {
                System.out.print("Tabuada de " + baseTabuada + ": \n\n");
                for (int i = 1; i <= 10; i++) {
                    System.out.println( baseTabuada + " X " + i + " = " + (baseTabuada * i));
                }

                invalido = false;
            }

        } while (invalido);

    }

}
