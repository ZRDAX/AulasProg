package aulaProg3.Vetores;

import java.util.Random;
import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner readLine = new Scanner(System.in);

        Random aleatorio = new Random();
        int[] vetor = new int[10];
        int tamanho = vetor.length;

        System.out.println("Dados do vetor");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = aleatorio.nextInt(30);
            System.out.println(vetor[i] + "");
        }

        System.out.println("Deseja remover: ");
        int remover = readLine.nextInt();
        int posicao = -1;

        for (int i = 0; i < tamanho; i++) {
            if (vetor[i]==remover){
                posicao = i;
            }
            if (posicao>=0){
                for (int j=posicao; j<tamanho-1; j++){
                    vetor[i] = vetor[i+1];
                }
                tamanho--;
                System.out.println("Dados lista ");
                for (int j = 0;j<tamanho;j++){
                    System.out.println(vetor[j] + "");
                }
            }
            else{
                System.out.println(remover+" não esta na lista");
            }

        }

    }
}