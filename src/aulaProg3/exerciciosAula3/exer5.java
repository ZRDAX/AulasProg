//Crie um programa que teste se o valor que usuário digitou está entre 10 e 15 e exibe alguma mensagem na tela.
package aulaProg3.exerciciosAula3;

import java.util.Scanner;

public class exer5 {
    public static void main(String[] args){
        Scanner ReadLine =  new Scanner(System.in);

        System.out.print("Insira um numero: ");
        int ent = ReadLine.nextInt();

        if(ent >10 && ent<15){
            System.out.println("alguma mensagem na tela");
        }else
            System.out.println("não esta entre 10 e 15");

    }
}
