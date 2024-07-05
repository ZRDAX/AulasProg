package aulaProg3.Metodos;

import java.util.Random;
import java.util.Scanner;

public class ExemploMetodosEx2 {

    //static int somaVetor(int[] vetor){
        int soma = 0;
        //for (int i =0; vetor.length; i++){
        //}
        //return resp;
   // }

    static void gerarVetor(int[] vetor){
        Random aleatorio = new Random();
        for (int i=0; i<vetor.length; i++){
            vetor[i] = aleatorio.nextInt(20);
        }
    }

    public static String soma(String s1, String s2){
        return s1+" "+s2;
    }

    public static void main(String[] args) {
        Scanner readLine = new Scanner(System.in);

        int[] lista = {1,4,5,9};
       // int soma = somaVetor(lista);
       // System.out.println(soma);
        int[] novoVetor = new int[10];
        gerarVetor(novoVetor);
        for (int i = 0; i<novoVetor.length; i++){
            System.out.println(novoVetor[i]+" ");
        }
    }
}
