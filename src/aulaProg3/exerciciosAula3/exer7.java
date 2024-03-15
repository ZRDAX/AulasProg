// Crie um algoritmo que pergunte ao usuário se ele deseja converter uma temperatura de graus Celsius em graus Fahrenheit ou Fahrenheit em Celsius. Em seguida mostre na tela o valor final correspondente à opção escolhida pelo usuário. F = 1.8 * C + 32 | C = (F – 32) / 1.8;
package aulaProg3.exerciciosAula3;

import java.util.Scanner;

public class exer7 {
    public static void main(String[] args){
        Scanner ReadLine =  new Scanner(System.in);

        System.out.print("deseja converter uma temperatura: ");
        System.out.println("1-Celsius em Fahrenheit\n2-Fahrenheit em Celsius.");
        int ent = ReadLine.nextInt();

        float f;
        float c;

        if(ent == 1){
            System.out.print("Informe o celsius:C°");
            c = ReadLine.nextFloat();
            float convertCF = 1.8f * c + 32f;
            System.out.print("C°"+c+" F°"+convertCF);
        }else if (ent == 2){
            f = ReadLine.nextFloat();
            float convertFC =(f - 32) / 1.8f;
            System.out.print("F°"+f+" C°"+convertFC);
        }else
            System.out.println("Entrada invalida");

    }
}
