// Faça um programa que solicite ao usuário digitar dois valores, em seguida, exiba na tela qual dos dois é o maior. OBS: o usuário poderá informar valores iguais, logo, o sistema deve dizer que foram digitados valores iguais.
package aulaProg3.exerciciosAula3;

import java.util.Scanner;

public class exer6 {
    public static void main(String[] args){
        Scanner ReadLine =  new Scanner(System.in);

        System.out.print("Insira numero 1: ");
        System.out.print("Insira numero 2: ");
        int ent1 = ReadLine.nextInt();
        int ent2 = ReadLine.nextInt();

        if(ent1 > ent2){
            System.out.println("1-"+ent1+"2-"+ent2);
        }else if (ent2 > ent1){
            System.out.println("2-"+ent2+"1-"+ent1);
        }else
            System.out.println("os dois tem o mesmo valor");

    }
}
