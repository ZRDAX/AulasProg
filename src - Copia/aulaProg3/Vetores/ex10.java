package aulaProg3.Vetores;

import java.util.Random;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner readLine = new Scanner(System.in);

        Random aleatorio = new Random();
        int[] vx = new int[10];
        int[] vy = new int[10];
        int[] vr = new int[20];

        System.out.println("Dados do vetor x");
        for (int i = 0; i < vx.length; i++) {
            vx[i] = aleatorio.nextInt(20);
            System.out.println(vx[i] + "");
        }

        System.out.println("Dados do vetor y");
        for (int i = 0; i < vy.length; i++) {
            vy[i] = aleatorio.nextInt(20);
            System.out.println(vy[i] + "");
        }

        int contx = 0;
        int conty = 0;
        System.out.println("Dados do vetor r");
        for (int i = 0; i < vr.length; i++) {
            if (i%2==0){
                vr[i] = vx[contx];
                contx++;
            }
            else{
                vr[i] = vy[conty];
                conty++;
            }
            System.out.println(vr[i] + "");
        }

    }
}