//Criar um programa para identificar o valor a ser pago por um plano de saúde dada a idade do conveniado considerando que todos pagam R$ 100 mais um adicional conforme os seguintes dados:
//a) crianças com menos de 10 anos pagam R$80;
//b) conveniados com idade entre 10 e 30 anos pagam R$50;
//c) conveniados com idade entre 40 e 60 anos pagam R$ 95;
//d) conveniados com mais de 60 anos pagam R$130.
package aulaProg3.exerciciosAula3;

import java.util.Scanner;

public class exer13 {
    public static void main(String[] args){
        Scanner readLine =  new Scanner(System.in);

        System.out.print("Insira sua Idade: ");
        int idade = readLine.nextInt();
        int valorPS = 100;
        if (idade<=10){
            System.out.println("valor:"+(valorPS+80));
        } else if (idade<=30) {
            System.out.println("valor:"+(valorPS+50));
        }else if (idade>=40 && idade<=60) {
            System.out.println("valor:"+(valorPS+95));
        }else if (idade>60) {
            System.out.println("valor:"+(valorPS+130));
        }else
            System.out.println("morreu");
    }
}
