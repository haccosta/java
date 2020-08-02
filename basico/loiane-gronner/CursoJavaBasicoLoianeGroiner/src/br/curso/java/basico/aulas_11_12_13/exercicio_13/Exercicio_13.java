import java.util.Scanner;

public class Exercicio_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor da hora trabalhada:");

        double valorHoraTrabalhada = scanner.nextDouble();

        System.out.println("informe o total de horas trabalhadas no mes:");

        int totalHorasTrabalhadas = scanner.nextInt();

        double valorSalarioBruto = calcularSalarioBruto(totalHorasTrabalhadas, valorHoraTrabalhada);
        double valorSalarioComDescontoInss = calcularValorInss(valorSalarioBruto);
        double valorSalarioComDescontoIprf = calcularValorIprf(valorSalarioBruto);
        double valorSalarioComDescontoSindicato = calcularValorSindicato(valorSalarioBruto);
        double valorSalarioLiquido = calcularValorSalarioLiquido(valorSalarioBruto, valorSalarioComDescontoInss, valorSalarioComDescontoIprf, valorSalarioComDescontoSindicato);

        System.out.println("O valor do salario bruto e : " + valorSalarioBruto);
        System.out.println("O valor do desconto de INSS e : " + valorSalarioComDescontoInss);
        System.out.println("O valor do desconto de IPRF : " + valorSalarioComDescontoIprf);
        System.out.println("O valor do desconto de Sindicato :" + valorSalarioComDescontoSindicato);
        System.out.println("O valor do salario liquido e : " + valorSalarioLiquido);

    }

    private static double calcularSalarioBruto(int totalHorasTrabalhadas, double valorHoraTrabalhada) {
        return totalHorasTrabalhadas * valorHoraTrabalhada;

    }

    private static double calcularValorInss(double valorSalario) {
        return (valorSalario / 100) * 11;
    }

    private static double calcularValorIprf(double valorSalario) {
        return (valorSalario / 100) * 8;
    }

    private static double calcularValorSindicato(double valorSalario) {
        return (valorSalario /100)  * 5;
    }

    private static double calcularValorSalarioLiquido(double valorSalarioBruto, double valorSalarioComDescontoInss,
            double valorSalarioComDescontoIprf, double valorSalarioComDescontoSindicato) {
        double valorTotalDesconto = valorSalarioComDescontoInss + valorSalarioComDescontoIprf
                + valorSalarioComDescontoSindicato;
        return valorSalarioBruto - valorTotalDesconto;

    }

}