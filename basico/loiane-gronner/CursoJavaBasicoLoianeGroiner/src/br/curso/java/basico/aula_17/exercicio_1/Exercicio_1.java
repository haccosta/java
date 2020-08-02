/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.curso.java.basico.aula_17.exercicio_1;

import java.util.Scanner;

/**
 *
 * @author Handerson
 */
public class Exercicio_1 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        
        double notaDigitada = 0;
               
        do{
         System.out.print("Informe uma nota entre 0 e 10: ");
         notaDigitada = scanner.nextDouble();
        }while(notaDigitada < 0 || notaDigitada > 10);
        
    }
    
}
