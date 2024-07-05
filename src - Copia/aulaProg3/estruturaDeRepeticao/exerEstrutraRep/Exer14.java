package exerEstrutraRep;

import java.util.Scanner;

public class Exer14 {
/*Melhore o exercício da questão anterior para aceitar somente valores maiores que zero para o número lido.
 */
    public static void main(String[] args){
        Scanner readline = new Scanner(System.in);

        System.out.print("Insira um numero: ");
        int num = readline.nextInt();
        while (num <=0){
            System.out.print("Insira um numero novamente: ");
            num = readline.nextInt();
        }
        int soma = 0;
        int i;
         for (i =1; i<=num; i++){
             soma += i;
             System.out.print(i);
             if(i!=num){
                 System.out.print("+");
             }
         }
        System.out.print("="+soma);
    }
}
