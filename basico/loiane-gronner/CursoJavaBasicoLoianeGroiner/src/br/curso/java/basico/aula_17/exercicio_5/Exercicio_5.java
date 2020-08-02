/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.curso.java.basico.aula_17.exercicio_5;

import java.util.Scanner;

/**
 *
 * @author Handerson
 */
public class Exercicio_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Informe o numero da população atual do pais A: ");
        double populacaoA = scanner.nextDouble();
        System.out.print("Informe o valor percentual da taxa de crescimento do pais A: ");
        double taxaCrescimentoA = scanner.nextDouble();
        
        System.out.print("Informe o numero da população atual do pais B: ");
        double populacaoB = scanner.nextDouble();
        System.out.print("Informe o valor percentual da taxa de crescimento do pais B: ");
        double taxaCrescimentoB = scanner.nextDouble();        
        

        int totalAno = 0;

        while (populacaoA <= populacaoB) {

            populacaoA = populacaoA + ((populacaoA * taxaCrescimentoA) / 100);
            populacaoB = populacaoB + ((populacaoB * taxaCrescimentoB) / 100);
            
            totalAno++;

        }
        
        System.out.println("O numero de anos necessário é: " + totalAno);

    }

}
