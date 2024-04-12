package aulaProg3.Matrizes;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner readLine = new Scanner(System.in);

        int[][] matriz = new int[3][4];
        for (int l= 0; l<3;l++){
            for (int c = 0;c<4;c++){
                System.out.printf("matriz[%d][%d] ", l, c);
                matriz[l][c] = readLine.nextInt();
            }
        }
        System.out.println("Dados na matriz");
        for (int l= 0; l<3;l++){
            for (int c = 0;c<4;c++){
                System.out.printf("%02d ",matriz[l][c]);
            }
            System.out.println();
        }
        int linhas = matriz.length;
        System.out.println("A quantidade de linhas da matriz é "+linhas);
        int colunas = matriz[0].length;
        System.out.println("A quantidade de colunas da matriz é "+colunas);
    }
}
