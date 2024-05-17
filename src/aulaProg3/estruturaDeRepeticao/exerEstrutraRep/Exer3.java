package exerEstrutraRep;

import java.util.Scanner;

public class Exer3 {
/*Escreva um algoritmo para ler um valor entre 1 (inclusive) e 10 (inclusive). Se o valor lido não estiver entre 1 (inclusive) e 10 (inclusive), deve ser lido um novo valor. Após a leitura do valor, escrever o valor lido na tela.
 */
    public static void main(String[] args){
        Scanner readline = new Scanner(System.in);
        int ires;
        do {
            System.out.print("Escreva um numero:");
            ires = readline.nextInt();
        }while (ires<1 || ires>10);

    }

}
