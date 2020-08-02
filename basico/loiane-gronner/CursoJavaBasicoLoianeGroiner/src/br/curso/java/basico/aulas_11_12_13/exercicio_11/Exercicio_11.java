import java.util.Scanner;

public class Exercicio_11{
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println ("Informe um número inteiro: ");

        int primeiroNumeroInteiro = scanner.nextInt();

        System.out.println("Informe um segundo número inteiro");

        int segundoNumeroInteiro = scanner.nextInt();

        System.out.println("Agora informe um numero real");

        double terceiroNumeroReal = scanner.nextDouble();


        int resultadoPrimeiraTarefa = (primeiroNumeroInteiro * 2) * (segundoNumeroInteiro/2);
        double resultadoSegundaTarefa = (primeiroNumeroInteiro * 3) + terceiroNumeroReal;
        double resultadoTerceiraTarefa = Math.pow(terceiroNumeroReal, 3);

        System.out.println("Resultado da primeira tarefa: " + resultadoPrimeiraTarefa);
        System.out.println("Resultado da segunda tarefa: " + resultadoSegundaTarefa);
        System.out.println("Resultado da terceira tarefa: " + resultadoTerceiraTarefa);

    }


}