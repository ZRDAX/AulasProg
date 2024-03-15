package aulaProg3.exemploIf;

import java.util.Scanner;

public class ExemploTres {
    public static void main(String[] args){
        Scanner ReadLine = new Scanner(System.in);

        System.out.print("Informe seu perfil: ");
        String perfil = ReadLine.nextLine();

        if(perfil.equals("admin")){
            System.out.println("Perfil sudo");
        } else if (perfil.equals("user")) {
            System.out.println("Perfil user");
        }else
            System.out.println("Perfil ghostUser");
    }
}
