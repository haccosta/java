/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.curso.java.basico.aula_17.exercicio_18;

import java.util.Scanner;

/**
 *
 * @author Handerson
 */
public class Exercicio_18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int numeroDigitado = scanner.nextInt();
        
        System.out.println(isPrimo(numeroDigitado));

   
    }
    
 private static String isPrimo(int numero) {
    for (int j = 2; j < numero; j++) {
        if (numero % j == 0)
            return "Nao e numero primo";   
    }
    return "E numero primo";
}   

}
