package exerEstrutraRep;

import java.util.Scanner;

public class Exer8 {
/*Escreva um algoritmo para pedir que o usuário digite números positivos, ou seja, ele pode digitar quantos números positivos ele quiser. Para parar de digitar números, ele deve digitar -1. Após o usuário digitar -1, o programa deve escrever na tela quantos números o usuário digitou (a quantidade de números lidos) e a soma total dos números que ele digitou.
 */
    public static void main(String[] args){
        Scanner readline = new Scanner(System.in);
         int cont = 0;
         int soma =0;
         int numPos;

        do {
            System.out.print("Insira um numero: ");
            numPos = readline.nextInt();
            if (numPos != -1){
                cont++;
                soma+=numPos;
            }
        }while (numPos != -1);
        System.out.println(cont+" tentativas "+soma+"");

    }
}
