//Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem crescente
package aulaProg3.exerciciosAula3;

import java.util.Scanner;

public class exer17 {
    public static void main(String[] args){
        Scanner readLine =  new Scanner(System.in);
        System.out.println("informe tres valores?");
        System.out.print("1:");
        float v1 = readLine.nextFloat();
        System.out.print("2:");
        float v2 = readLine.nextFloat();
        System.out.print("3:");
        float v3 = readLine.nextFloat();

        if (v1 < v2 && v2 < v3){
            System.out.printf("v1 = %.2f v2 = %.2f v3 = %.2f", v1,v2,v3);
        } else if (v3 < v2 && v2 < v1) {
            System.out.printf("v3 = %.2f v2 = %.2f v1 = %.2f", v3,v2,v1);
        }
    }
}
