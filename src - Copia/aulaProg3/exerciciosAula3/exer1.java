// Crie um programa em que o usuário informa o nome de um mês (ex: janeiro) e o programa exibe o número correspondente a esse mesmo mês (ex: 1);

package aulaProg3.exerciciosAula3;

import java.util.Scanner;

public class exer1 {
    public static void main(String[] args){
        Scanner ReadLine =  new Scanner(System.in);

        System.out.print("Insira o nome de um Mês: ");
        String mes = ReadLine.nextLine();

        switch (mes){
            case "Janeiro" ->System.out.println("1");
            case "Fevereiro" ->System.out.println("2");
            case "Março" ->System.out.println("3");
            case "Abril" ->System.out.println("4");
            case "Maio" ->System.out.println("5");
            case "Junho" ->System.out.println("6");
            case "Julho" ->System.out.println("7");
            case "Agosto" ->System.out.println("8");
            case "Setembro" ->System.out.println("9");
            case "Outubro" ->System.out.println("10");
            case "Novembro" ->System.out.println("11");
            case "Dezembro" ->System.out.println("12");
        }

    }
}
