/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.curso.java.basico.aula_17.exercicio_4;

/**
 *
 * @author Handerson
 */
public class Exercicio_4 {

    public static void main(String[] args) {

        double populacaoA = 80000;
        double populacaoB = 200000;
        int totalAno = 0;

        while (populacaoA <= populacaoB) {

            populacaoA = populacaoA + ((populacaoA * 3) / 100);
            populacaoB = populacaoB + ((populacaoB * 1.5) / 100);
            
            totalAno++;

        }
        
        System.out.println("O numero de anos necessário é: " + totalAno);

    }

}
