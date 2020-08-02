/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.curso.java.basico.aula_17.exercicio_14;

import java.util.Scanner;

/**
 *
 * @author Handerson
 */
public class Exercicio_14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int totalNumeroPares = 0;
        int totalNumeroImpares = 0;
        
        for(int i=1; i<=10; i++){
            System.out.print("Informe um numero inteiro: ");
            
            int numeroDigitado = scanner.nextInt();
            
            if(numeroDigitado%2==0){
                totalNumeroPares++;
                
            }else{
                totalNumeroImpares++;
            }
            
        }
        
        System.out.print("O valor de numeros pares e: " + totalNumeroPares);
        System.out.print("\nO valor de numeros impares e: " + totalNumeroImpares);
        
    }
    
}
