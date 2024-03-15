//Ler o código de um produto e exibir seu tipo de acordo com a tabela a seguir:
package aulaProg3.exerciciosAula3;

import java.util.Scanner;

public class exer12 {
    public static void main(String[] args){
        Scanner readLine =  new Scanner(System.in);

        System.out.print("Insira um numero\n1-caderno\n2-lapis\n3-borracha\ninserir: ");

        int ope = readLine.nextInt();
        switch (ope){
            case 1 ->System.out.println("*caderno*");
            case 2 ->System.out.println("*lapis*");
            case 3 ->System.out.println("*borracha*");
            default -> System.out.println("*diversos*");
        }
    }
}
