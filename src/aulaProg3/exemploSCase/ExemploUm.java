package aulaProg3.exemploSCase;

import java.util.Scanner;

public class ExemploUm {
    public static void main(String[] args){
        Scanner ReadLine = new Scanner(System.in);

        System.out.print("Digite um numero de 1-7: ");
        int dia = ReadLine.nextInt();

        switch (dia){
            case 1, 7:
                System.out.println("Fim de Semana");
                break;
            case 2, 3, 4, 5, 6:
                System.out.println("Dia Util");
                break;
            default:
                System.out.println("Entrada Invalida");
                break;
        }

    }
}
