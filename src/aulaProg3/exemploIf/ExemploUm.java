package aulaProg3.exemploIf;

import java.util.Scanner;

public class ExemploUm {
    public static void main(String[] args){
        Scanner ReadLine = new Scanner(System.in);
        System.out.print("Inserir nota: ");
        int nota = ReadLine.nextInt();

        if( nota>=0 && nota<=10){
            System.out.println("Nota Válida");
        }
        else{
            System.out.println("Nota Inválida...");
        }
    }
}
