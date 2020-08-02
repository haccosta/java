package exercicio_9;

import java.util.Scanner;

public class Exercicio_9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Informe o primeiro numero: ");

        int numero_1 = scanner.nextInt();

        System.out.println("Informe o segundo numero: ");

        int numero_2 = scanner.nextInt();

        System.out.println("Informe o terceiro numero: ");

        int numero_3 = scanner.nextInt();


        if( ( numero_1 > numero_2 && numero_1 > numero_3 ) && ( numero_2 > numero_3 ) ) { //  numero_1 > numero_2 > numero_3
            System.out.println(numero_1);
            System.out.println(numero_2);
            System.out.println(numero_3);
        }
        else if( ( numero_1 > numero_2 && numero_1 > numero_3 ) && ( numero_3 > numero_2 ) ) { // numero_1 > numero_3 > numero_2
            System.out.println(numero_1);
            System.out.println(numero_3);
            System.out.println(numero_2);
        }
        else if( ( numero_2 > numero_1 && numero_2 > numero_3 ) && ( numero_1 > numero_3 ) ) { //numero_2 > numero_1 > numero_3
            System.out.println(numero_2);
            System.out.println(numero_1);
            System.out.println(numero_3);
        }
        else if( ( numero_2 > numero_1 && numero_2 > numero_3 ) && ( numero_3 > numero_1 ) ) { // numero_2 > numero_3 > numero_1
            System.out.println(numero_2);
            System.out.println(numero_3);
            System.out.println(numero_1);
        }
        else if( ( numero_3 > numero_1 && numero_3 > numero_2 ) && ( numero_1 > numero_2 ) ) { // numero_3 > numero_1 > numero_2
            System.out.println(numero_3);
            System.out.println(numero_1);
            System.out.println(numero_2);
        }
        else if( ( numero_3 > numero_1 && numero_3 > numero_2 ) && ( numero_2 > numero_1 ) ) { // numero_3 > numero_2 > numero_1
            System.out.println(numero_3);
            System.out.println(numero_2);
            System.out.println(numero_1);
        }   


    }
}