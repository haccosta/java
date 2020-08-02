/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.curso.java.basico.aula_17.exercicio_13;

import java.util.Scanner;

/**
 *
 * @author Handerson
 */
public class Exercicio_13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe a base da potencia: ");
        int basePotenciaDigitada = scanner.nextInt();
        
        System.out.print("Informe a expoente da potencia: ");
        int expoentePotenciaDigitada = scanner.nextInt();

        int valorPotencia = 1;
        for(int i =1; i<= expoentePotenciaDigitada; i++){
            valorPotencia *= basePotenciaDigitada;
            
        }
        
        System.out.println("O valor da potencia é: " + valorPotencia);
        
    }
    
}
