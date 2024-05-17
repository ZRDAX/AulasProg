package exerEstrutraRep;

import java.util.Scanner;

public class Exer15 {
/*Uma loja está levantando o valor total de todas as mercadorias em estoque. Escreva um algoritmo que permita a entrada das seguintes informações:
a) Número total de mercadorias no estoque (quantidade total).
b) Valor de cada mercadoria.
Ao final imprimir o valor total em estoque e a média de valor das mercadorias

 */
    public static void main(String[] args){
        Scanner readline = new Scanner(System.in);

        int estoque, valorM, i;
        int contV = 0;
        char res;
        do {
            System.out.print("em estoque:");
            estoque = readline.nextInt();

            for (i = 0; i<estoque; i++) {
                System.out.print("Valor do produto:");
                valorM = readline.nextInt();
                contV = contV+valorM;
            }
            int contM = contV/estoque;
            System.out.print("estoque total = "+estoque+" media de valor das mercadorias "+contM);

            System.out.print("\nefetuar o cálculo para mais mercadorias?[s/n]? ");
            res = readline.next().charAt(0);
        }while (res=='s' || res=='S');
    }
}
