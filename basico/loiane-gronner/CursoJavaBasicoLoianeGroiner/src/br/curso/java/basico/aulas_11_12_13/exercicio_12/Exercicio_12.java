import java.util.Scanner;

public class Exercicio_12{
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println ("Informe o valor da altura");

        double alturaInformada = scanner.nextDouble();

        System.out.println("O valor do peso ideial para a altura informada é " + calcularPesoIdeal(alturaInformada));




    }

    private static double calcularPesoIdeal(double alturaInformada){
        return (72.7* alturaInformada) - 58;
    }
}