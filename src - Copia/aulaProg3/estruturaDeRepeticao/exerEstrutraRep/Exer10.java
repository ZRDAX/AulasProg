package exerEstrutraRep;

import java.util.Scanner;

public class Exer10 {
/*Escreva um algoritmo para ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive). Considere que o N será sempre maior que ZERO.

 */
    public static void main(String[] args){
        Scanner readline = new Scanner(System.in);

        System.out.print("Insira: ");
        int N = readline.nextInt();
        while (N <= 0){
            System.out.print("Insira novamente: ");
            N = readline.nextInt();
        }

        int i;
         for (i =1;i <=N; i++){
             System.out.println(i);
         }
    }
}
