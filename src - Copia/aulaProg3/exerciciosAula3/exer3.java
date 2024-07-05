//Usando o comando de seleção condicional simples “IF”, faça um programa que leia uma senha de 8 caracteres inteiros e verifique se a senha informada equivale a senha predefinida no programa. Se for válida informe na tela "Acesso Autorizado. Caso a senha não estiver correta informe "Acesso negado".
package aulaProg3.exerciciosAula3;

import java.util.Scanner;

public class exer3 {
    public static void main(String[] args){
        Scanner ReadLine =  new Scanner(System.in);

        System.out.print("Insira sua senha: ");
        String senha = ReadLine.nextLine();

        if (senha.equals("admin")){
            System.out.println("Acesso Autorizado, Bem-vindo!");
        }else
            System.out.println("Acesso Negado");

    }
}
