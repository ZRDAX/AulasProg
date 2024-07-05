package exerEstrutraRep;

import java.util.Scanner;

public class Exer12 {
/*Escreva um algoritmo que leia um número e diga se ele é primo ou não.
 */
    public static void main(String[] args){
        Scanner readline = new Scanner(System.in);

        System.out.print("Insira um numero: ");
        int num = readline.nextInt();
        int v =1;
        int div = 0;
        if (num > 0) {
            while (v <= num) {
                if (num % v == 0){
                    div++;
                }
                v++;
            }
        }
        if (div == 2){
            System.out.println("O numero "+num+" é primo");
        }else
            System.out.println("O numero "+num+" não é primo");
    }
}
