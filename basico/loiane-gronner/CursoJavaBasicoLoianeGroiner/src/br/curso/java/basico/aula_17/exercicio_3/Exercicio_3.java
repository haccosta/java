/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.curso.java.basico.aula_17.exercicio_3;

import java.util.Scanner;

/**
 *
 * @author Handerson
 */
public class Exercicio_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean invalido;

        do {
            invalido = false;

            System.out.print("Favor informe seu nome: ");
            String nomeDigitado = scanner.nextLine();

            System.out.print("Favor sua idade: ");
            int idadeDigitada = scanner.nextInt();

            System.out.print("Favor seu salario: ");
            double salarioDigitado = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Favor seu sexo: ");
            String sexoDigitado = scanner.nextLine();

            System.out.print("Favor seu estado civil: ");
            String estadoCivilDigitado = scanner.nextLine();

            if (nomeDigitado.length() < 3) {
                invalido = true;
            }

            if (idadeDigitada < 0 || idadeDigitada > 150) {
                invalido = true;
            }

            if (salarioDigitado < 0) {
                invalido = true;
            }

            if (!"F".equalsIgnoreCase(sexoDigitado) && !"M".equalsIgnoreCase(sexoDigitado)) {
                invalido = true;

            }

            if (!"S".endsWith(estadoCivilDigitado)
                    && !"C".equalsIgnoreCase(estadoCivilDigitado)
                    && !"V".equalsIgnoreCase(estadoCivilDigitado)
                    && !"D".equalsIgnoreCase(estadoCivilDigitado)) {
                invalido = true;

            }

        } while (invalido);

    }

}
