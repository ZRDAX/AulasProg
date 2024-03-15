// Escreva um programa em Java que recebe um inteiro e diga se é par ou ímpar. Use o operador matemático % (resto da divisão ou módulo) e o teste condicional if
package aulaProg3.exerciciosAula3;

import java.util.Scanner;

public class exer4 {
    public static void main(String[] args){
        Scanner ReadLine =  new Scanner(System.in);

        System.out.print("Insira um numero: ");
        int comp = ReadLine.nextInt();

        if(comp % 2 == 0){
            System.out.println("numero Par");
        }else
            System.out.println("Numero Impar");

    }
}
