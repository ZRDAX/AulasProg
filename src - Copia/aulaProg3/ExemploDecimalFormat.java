package aulaProg3;

import java.text.DecimalFormat;

public class ExemploDecimalFormat {
    public static void main(String[] args){

        double numeroUm = 21324324.4567;
        double numeroDois = 234.44;
        double numeroTres =(float)1/2;
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");
        System.out.println(df.format(numeroUm));
        System.out.println(df.format(numeroDois));
        System.out.println(df.format(numeroTres));

    }
}
