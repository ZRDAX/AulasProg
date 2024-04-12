package aulaProg3.Metodos;

import java.util.Scanner;

public class ExemploMetodosEx1 {

    static int soma(int v1, int v2){
        int resp = v1+v2;
        return resp;
    }

    public static int soma(int v1, int v2, int v3){
        int resp = v1+v2+v3;
        return resp;
    }

    public static String soma(String s1, String s2){
        return s1+" "+s2;
    }

    public static void main(String[] args) {
        Scanner readLine = new Scanner(System.in);
        System.out.println("Digite um número");
        int n1 = readLine.nextInt();
        int n2 = readLine.nextInt();
        int resposta = soma(n1,n2);
        System.out.println("");
    }
}
