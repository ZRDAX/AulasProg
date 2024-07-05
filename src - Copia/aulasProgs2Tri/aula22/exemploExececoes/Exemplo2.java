package aulasProgs2Tri.aula22.exemploExececoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo2 {

    public static int leNumero(String mensagem){
        Scanner readline = new Scanner(System.in);
        boolean correto = false;
        int numero = 0;
        do {
            try {
                System.out.println(mensagem+": ");
                numero = readline.nextInt();
                correto = true;
            }catch (InputMismatchException erro){
                System.out.printf("Valor não é numerico");
                readline.next();
                correto = false;
            }
        }while (!correto);
        return numero;
    }
    public static void main(String[] args) {
        int n1 = leNumero("\nDigite um número ");
    }
}
