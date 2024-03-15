//Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.
package aulaProg3.exerciciosAula3;

import java.util.Scanner;

public class exer18 {
    public static void main(String[] args){
        Scanner readLine =  new Scanner(System.in);
        System.out.println("Inforome sua conta");
        System.out.print("saldo:");
        float saldo = readLine.nextFloat();
        System.out.print("debito:");
        float debito = readLine.nextFloat();
        System.out.print("credito:");
        float credito = readLine.nextFloat();
        float saldoAtual = saldo - debito + credito;

        if (saldoAtual >=0){
            System.out.println("Saldo Positivo R$"+saldoAtual);
        } else
            System.out.println("Saldo Negativo R$"+saldoAtual);
    }
}
