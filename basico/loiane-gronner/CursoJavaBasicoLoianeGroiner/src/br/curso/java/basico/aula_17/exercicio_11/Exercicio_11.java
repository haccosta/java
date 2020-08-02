/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.curso.java.basico.aula_17.exercicio_11;

import java.util.Scanner;

/**
 *
 * @author Handerson
 */
public class Exercicio_11 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o primeiro numero do intervalo: ");
        int primeiroNumeroDigitado = scanner.nextInt();
        
        System.out.print("Informe o segundo numero do intervalo: ");
        int segundoNumeroDigitado = scanner.nextInt();
        
        int contador = 0;
        int somaNumeros = 0;
        for (; primeiroNumeroDigitado < segundoNumeroDigitado; primeiroNumeroDigitado++) {
            
            if (contador != 0) {
                System.out.print(primeiroNumeroDigitado);
                somaNumeros = somaNumeros + primeiroNumeroDigitado;
            }
            
            contador++;
            
        }
        
        System.out.print("A soma dos numeros do intervalo é: " + somaNumeros);
        
    }
}
