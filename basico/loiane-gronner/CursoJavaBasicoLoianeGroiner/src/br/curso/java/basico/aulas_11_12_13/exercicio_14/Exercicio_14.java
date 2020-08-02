import java.util.Scanner;

public class Exercicio_14{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tamalho do arquivo em megaytes ");

        double tamanhoDoArquivo = scanner.nextDouble();

        System.out.println("Informe a velocidade do link da internet");

        double velocidadeLinkInternet = scanner.nextDouble();

        System.out.println("O tempo de download do arquivo e: " + calcularTempoDownloadArquivo(tamanhoDoArquivo, velocidadeLinkInternet));

    }

    private static double calcularTaxaDeTransferencia(double velocidadeLinkInternet){
        return (velocidadeLinkInternet * 1024) / 8;

    }

    private static double calcularTempoDownloadArquivo(double tamanhoDoArquivo, double velocidadeLinkInternet){
        double tamanhoEmKbArquivo = tamanhoDoArquivo * 1024;
        double tempoDownloadSegundos = tamanhoEmKbArquivo / calcularTaxaDeTransferencia(velocidadeLinkInternet);
        return tempoDownloadSegundos / 60;

    }
}