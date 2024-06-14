//Escreva um algoritmo que leia o código de uma figura geométrica (1 - triângulo, 2 - quadrado, 3 - círculo, 4 - retângulo). Depois de escolhida a figura, leia as informações necessárias para calcular a área da figura correspondente, calcule e escreva o valor da área..
package aulaProg3.exerciciosAula3;

import java.util.Scanner;

public class exer19 {
    public static void main(String[] args){
        Scanner readLine =  new Scanner(System.in);
        System.out.print("Insira um numero\n1-triângulo\n2-quadrado\n3-círculo\n4-retângulo\ninserir: ");
        int vforma = readLine.nextInt();
        switch (vforma){
            case 1 ->System.out.println("*triângulo*");
            case 2 ->System.out.println("*quadrado*");
            case 3 ->System.out.println("*círculo*");
            case 4 ->System.out.println("*retângulo*");
            default -> System.out.println("*diversos*");
        }
}}
