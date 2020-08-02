public class BalancoTrimestral {
    public static void main (String args[]){
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;
        int gastosTrimestre = gastosFevereiro + gastosFevereiro + gastosMarco;
        int mediaMensal = gastosTrimestre / 3;

        System.out.println("O gasto do trimestre e:" + gastosTrimestre);
        System.out.println("A media de gasto do trimestre e:" + mediaMensal);


    }
}