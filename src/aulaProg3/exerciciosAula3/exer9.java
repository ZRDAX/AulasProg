//9) Receba três valores fornecidos pelo usuário que representarão os lados de um triângulo.
//Verifique se os valores formam um triângulo e classifique esse triângulo como:
//a) Equilátero: três lados iguais.
//b) Isósceles: dois lados iguais.
//c) Escaleno: três lados diferentes. Lembre-se de que, para formar um triângulo, nenhum dos lados pode ser igual a zero, um lado não pode ser maior do que a soma dos outros dois.
package aulaProg3.exerciciosAula3;

import java.util.Scanner;

public class exer9 {
    public static void main(String[] args){
        Scanner readLine =  new Scanner(System.in);

        System.out.print("Insira primeiro lado: ");
        float l1 = readLine.nextFloat();
        System.out.print("Insira segundo lado: ");
        float l2 = readLine.nextFloat();
        System.out.print("Insira terceiro lado: ");
        float l3 = readLine.nextFloat();

        if(l1 == l2 && l2 == l3){
            System.out.println("É Equilátero");
        }else if(l1 != l2 && l2 != l3 && l3 != l1){
            System.out.println("É Isósceles");
        }else
            System.out.println("É Escaleno");
    }
}
