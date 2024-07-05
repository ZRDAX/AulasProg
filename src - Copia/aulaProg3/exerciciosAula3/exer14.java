//A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).
package aulaProg3.exerciciosAula3;

import java.util.Scanner;

public class exer14 {
    public static void main(String[] args){
        Scanner readLine =  new Scanner(System.in);

        System.out.print("Insira suas horas trabalhadas: ");
        int hrstra = readLine.nextInt();
        int dindin;
        int hrsextra;
        int hrstrab;
        if (hrstra == 40){
            dindin =  hrstra*100;
            System.out.println("Seu dinheiro $"+dindin);
        } else if (hrstra >40) {
            hrsextra = hrstra-40;
            hrstrab = hrstra-hrsextra;
            dindin = (hrstrab+hrsextra)*100;
            System.out.println("Seu dinheiro $"+dindin);
        }

    }
}
