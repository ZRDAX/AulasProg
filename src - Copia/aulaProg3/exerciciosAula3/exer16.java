//Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade média = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar compra'.
package aulaProg3.exerciciosAula3;

import java.util.Scanner;

public class exer16 {
    public static void main(String[] args){
        Scanner readLine =  new Scanner(System.in);
        System.out.println("Qual é a quantidade atual do produto?");
        System.out.print("Atual:");
        int quantAtu = readLine.nextInt();
        System.out.print("Maxima:");
        int quantMax = readLine.nextInt();
        System.out.print("Minima:");
        int quantMin = readLine.nextInt();
        int quantMed= (quantMax+quantMin)/2;

        if (quantMed > quantAtu){
            System.out.println("Não efetuar compra");
        }else
            System.out.println("Efetuar compra");
    }
}
