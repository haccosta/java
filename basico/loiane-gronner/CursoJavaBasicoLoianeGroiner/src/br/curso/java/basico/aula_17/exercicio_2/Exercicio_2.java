/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.curso.java.basico.aula_17.exercicio_2;

import java.util.Scanner;

/**
 *
 * @author Handerson
 */
public class Exercicio_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean invalido = false;

        do {
            System.out.println("Favor informe seu usuario: ");
            String usuarioDigitado = scanner.nextLine();


            System.out.println("Favor informe sua senha: ");
            String senhaDigitada = scanner.nextLine();


            if (usuarioDigitado.equalsIgnoreCase(senhaDigitada)) {
                invalido = true;
            } else {
                invalido = false;
            }

        } while (invalido);

    }

}
