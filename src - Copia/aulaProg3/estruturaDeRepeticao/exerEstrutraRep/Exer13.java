package exerEstrutraRep;

import java.util.Scanner;

public class Exer13 {
/*Escreva um algoritmo que pergunte ao usuário um número e após, escreva na tela a soma total de 1 até o número lido. Exemplo: Número lido é o 5. Resultado: 1+2+3+4+5 = 15
 */
    public static void main(String[] args){
        Scanner readline = new Scanner(System.in);

        System.out.print("Insira um numero: ");
        int num = readline.nextInt();
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
