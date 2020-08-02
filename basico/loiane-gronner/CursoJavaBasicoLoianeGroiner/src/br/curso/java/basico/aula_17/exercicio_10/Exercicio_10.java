/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.curso.java.basico.aula_17.exercicio_10;

import java.util.Scanner;

/**
 *
 * @author Handerson
 */
public class Exercicio_10 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o primeiro numero do intervalo: ");
        int primeiroNumeroDigitado = scanner.nextInt();
        
        System.out.print("Informe o segundo numero do intervalo: ");
        int segundoNumeroDigitado = scanner.nextInt();
        
        int contador = 0;
        for (; primeiroNumeroDigitado < segundoNumeroDigitado; primeiroNumeroDigitado++) {
            
            if (contador != 0) {
                System.out.print(primeiroNumeroDigitado);
            }
            
            contador++;
            
        }
        
    }
}
