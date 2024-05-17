package exerEstrutraRep;

import java.util.Scanner;

public class Exer5 {
/*Escreva um algoritmo para ler as notas da 1a. e 2a. avaliações de um aluno, calcular e imprimir a média (simples) desse aluno. Só devem ser aceitos valores válidos durante a leitura de cada nota (notas válidas: 0.0 a 10.0).
 */
    public static void main(String[] args){
        Scanner readline = new Scanner(System.in);
        float nota1a;
        float nota2a;
        do {
            System.out.print("sua nota 1°:");
            nota1a = readline.nextFloat();
            System.out.print("sua nota 2°:");
            nota2a = readline.nextFloat();
            if (nota1a<0.0 ||  nota1a>10.0 && nota2a<0.0 || nota2a>10.0)
                System.out.println("Nota inválida!");
        }while (nota1a<0.0 ||  nota1a>10.0 && nota2a<0.0 || nota2a>10.0);
        float med= (nota1a+nota2a)/2;
        System.out.println("Sua media foi de "+med);

    }

}
