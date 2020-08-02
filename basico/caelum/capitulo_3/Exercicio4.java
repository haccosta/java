public class Exercicio4 {
    public static void main(String args[]) {
        long fat = 1;
        int valor = 30; 
        for (int i = 2; i <= valor; i++) {
            fat *= i;
        }

        System.out.print("Valor da Fatorial e:" + fat);
    }
}