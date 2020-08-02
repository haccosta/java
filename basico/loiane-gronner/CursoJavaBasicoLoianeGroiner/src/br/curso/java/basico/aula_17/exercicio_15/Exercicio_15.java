/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.curso.java.basico.aula_17.exercicio_15;

/**
 *
 * @author Handerson
 */
public class Exercicio_15 {

    public static void main(String[] args) {

        for (int i = 0; i < 30; i++) {

            System.out.print("(" + i + "):" + calcularFibonacci(i) + "\t");

        }

    }

    private static int calcularFibonacci(int numero) {
        if (numero < 2) {
            return numero;
        } else {
            return calcularFibonacci(numero - 1) + calcularFibonacci(numero - 2);

        }
    }

}
