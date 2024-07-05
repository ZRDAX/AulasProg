package aulaProg3.exemploSCase;

import java.util.Scanner;

public class ExemploTres {
    public static void main(String[] args){
        Scanner ReadLine = new Scanner(System.in);

        System.out.print("Informe seu perfil: ");
        String perfil = ReadLine.nextLine();

        switch (perfil){
            case "admin" -> System.out.println("Perfil Sudo");
            case "user" -> System.out.println("Perfil User");
            default -> System.out.println("Perfil Ghost");
        }
    }
}
