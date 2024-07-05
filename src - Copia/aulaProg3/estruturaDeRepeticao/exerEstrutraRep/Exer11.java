package exerEstrutraRep;

import java.util.Scanner;

public class Exer11 {
/*Escreva um algoritmo que leia um número calcule e imprima a tabuada dele (1 a 10)
 */
    public static void main(String[] args){
        Scanner readline = new Scanner(System.in);

        System.out.print("Insira um numero: ");
        int num = readline.nextInt();

        int i;
         for (i =1; i<=10; i++){
             System.out.println(num*i);
         }
    }
}
