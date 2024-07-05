package exerEstrutraRep;

import java.util.Scanner;

public class Exer4 {
/*Escreva um algoritmo para ler uma idade, mas o algoritmo deve aceitar somente idade válida, ou seja, o algoritmo deve “validar” a leitura da idade. Idade válida tem que ser maior que 0 e menor que 150. Escrever a idade lida.
 */
    public static void main(String[] args){
        Scanner readline = new Scanner(System.in);
        int idade;
        do {
            System.out.print("Insira sua idade:");
            idade = readline.nextInt();
            if (idade<0 || idade>150)
                System.out.println("Nota inválida!");
        }while (idade<0 || idade>150);

    }

}
