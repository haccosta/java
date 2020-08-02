/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.curso.java.basico.aula_17.exercicio_16;

/**
 *
 * @author Handerson
 */
public class Exercicio_16 {

    public static void main(String[] args) {

        for (int i = 0; i < 500; i++) {

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
