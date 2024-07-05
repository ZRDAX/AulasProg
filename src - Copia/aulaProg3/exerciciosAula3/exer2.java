//Faça um programa que leia o nome e a idade de 1 nadador e exiba na tela o nome da categoria a qual este nadador pertence. A categoria dos nadadores é dada pela seguinte tabela:
package aulaProg3.exerciciosAula3;

import java.util.Scanner;

public class exer2 {
    public static void main(String[] args){
        Scanner ReadLine =  new Scanner(System.in);

        System.out.print("Insira sua Idade: ");
        int idade = ReadLine.nextInt();

        if (idade<5){
            System.out.println("Idade não Alcançada");
        } else if (idade<7) {
            System.out.println("Infantil A");
        }else if (idade<10) {
            System.out.println("Infantil B");
        }else if (idade<13) {
            System.out.println("Juvenil A");
        }else if (idade<17) {
            System.out.println("Juvenil B");
        }else
            System.out.println("Adulto");

    }
}
