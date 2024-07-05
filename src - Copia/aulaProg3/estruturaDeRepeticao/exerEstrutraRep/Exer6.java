package exerEstrutraRep;

import java.util.Scanner;

public class Exer6 {
/*Escreva um algoritmo que leia três notas de um aluno e calcule sua média. Ao final do algoritmo pergunte se deseja efetuar o cálculo para mais algum aluno. Se o usuário receber digitar S, leia novamente as três notas até que o usuário responda não.
 */
    public static void main(String[] args){
        Scanner readline = new Scanner(System.in);
        float nota1a, nota2a, nota3a;
        float med;
        char res;
        do {
            System.out.print("sua nota 1°:");
            nota1a = readline.nextFloat();
            System.out.print("sua nota 2°:");
            nota2a = readline.nextFloat();
            System.out.print("sua nota 3°:");
            nota3a = readline.nextFloat();
            if (nota1a<0.0 ||  nota1a>10.0 && nota2a<0.0 || nota2a>10.0
                    && nota3a<0.0 || nota3a>10.0) {
                System.out.println("Nota inválida!");
            }

            med= (nota1a+nota2a+nota3a)/3;
            System.out.println("Sua media foi de "+med);

            System.out.print("efetuar o cálculo para mais algum aluno?[s/n]? ");
            res = readline.next().charAt(0);
        }while (res=='s' || res=='S');

    }
}
