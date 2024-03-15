package aulaProg3.exemploIf;

import java.util.Scanner;

public class ExemploDois {
    public static void main(String[] args){
        Scanner ReadLine = new Scanner(System.in);

        System.out.print("Idade: ");
        int idade = ReadLine.nextInt();

        if(idade < 0 ){
            System.out.println("Idade Inválida");
        } else if (idade<10) {
            System.out.println("Infantil");
        } else if (idade<25) {
            System.out.println("Juvenil");
        } else if (idade<65){
            System.out.println("Adulto");
        }else
            System.out.println("Terceira Idade");

    }
}
