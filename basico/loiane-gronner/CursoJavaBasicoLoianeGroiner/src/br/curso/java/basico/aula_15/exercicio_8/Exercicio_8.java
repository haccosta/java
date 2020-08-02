package exercicio_8;

import java.util.Scanner;

public class Exercicio_8{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double produtoMaisBarato= 0;

        System.out.println("Informe o preco do arroz");

        double precoProduto_1 = scanner.nextDouble();

        produtoMaisBarato = precoProduto_1;

        System.out.println("Informe o preco do feijao");

        double precoProduto_2 = scanner.nextDouble();

        if(precoProduto_2 < produtoMaisBarato){
            produtoMaisBarato = precoProduto_2;

        }

        System.out.println("Informe o preco do leite");

        double precoProduto_3 = scanner.nextDouble();

        if(precoProduto_3 < produtoMaisBarato){
            produtoMaisBarato = precoProduto_3;

        }

        System.out.println("Produto mais barato é:"+ produtoMaisBarato);

    }
}