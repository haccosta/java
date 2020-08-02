import java.util.Scanner;

public class Exercicio_8{
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println ("Informe o valor da hora trabalhada: ");
        double valorHoraTrabalhada = scanner.nextDouble();

        System.out.println ("Informe o total de horas trabalhadas: ");

        int totalHorasTrabalhadasMes = scanner.nextInt();

        System.out.println("O valor do salario mensal e: " + calcularSalarioMensal(valorHoraTrabalhada, totalHorasTrabalhadasMes));


    }

    private static double calcularSalarioMensal (double valorHoraTrabalhada, int totalHorasTrabalhadasMes){
        return valorHoraTrabalhada * totalHorasTrabalhadasMes;
    }
}