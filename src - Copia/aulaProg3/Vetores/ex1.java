package aulaProg3.Vetores;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args){
        Scanner readLine =  new Scanner(System.in);

        int[] vx = new int[10];
        int[] vr = new int[10];
        int cr = 0;
        for(int i = 0; i< vx.length; i++){
            System.out.println("vx["+i+"]: ");
            vx[i] = readLine.nextInt();
            if(vx[i]<0){
                vr[cr] = vx[i];
                cr++;
            }
        }
        System.out.println("\nDados no vetor r (numeros negativos):\n");
        for (int i = 0; i<cr; i++){
            System.out.println(vr[i]+" ");
        }
    }
}
