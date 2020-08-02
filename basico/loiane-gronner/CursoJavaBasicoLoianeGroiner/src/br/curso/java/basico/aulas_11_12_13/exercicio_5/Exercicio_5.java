import java.util.Scanner;

public class Exercicio_5 {

    private final static int BASE_CENTIMETROS = 100;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor do metro: ");

        System.out.println("Valor convertido em centimetros: " + converterMetroEmCentimetro(scanner.nextInt()));

    }

    public static int converterMetroEmCentimetro(int valorMetro){
        return valorMetro * BASE_CENTIMETROS;
    }
}