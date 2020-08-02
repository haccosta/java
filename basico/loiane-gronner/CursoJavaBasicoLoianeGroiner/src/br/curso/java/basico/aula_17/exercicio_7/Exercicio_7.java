/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.curso.java.basico.aula_17.exercicio_7;

import java.util.Scanner;

/**
 *
 * @author Handerson
 */
public class Exercicio_7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        
        int maiorNumero = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe um numero: ");
            
            int numeroDigitado = scanner.nextInt();
            
            if(numeroDigitado >  maiorNumero){
                maiorNumero = numeroDigitado;
            }
            

        }
        
        System.out.println("O maior numero e: " + maiorNumero);

    }

}
