// A calculadora de Luciana pifou, justo quando ela precisa fazer vários cálculos. Ela tem um computador, mas não sabe que um dos acessórios do Windows é uma calculadora. Sendo estudante de programação, Luciana resolveu fazer um programa. A especificação que bolou prevê que programa leia dois números inteiros (o que atende suas necessidades) e em seguida um símbolo de operação. Se este for '+', o programa soma os números, se '-', subtrai, se '*' multiplica e se '/' divide. Se o símbolo for diferente desses, é mostrada uma mensagem de erro. O programa, antes de dividir, critica se o divisor é zero e mostra uma mensagem de erro. Implemente um programa que construa essa calculadora para Luciana
package aulaProg3.exerciciosAula3;

import java.util.Scanner;

public class exer8 {
    public static void main(String[] args){
        Scanner readLine =  new Scanner(System.in);

        System.out.print("Insira primeiro numero: ");
        float ent1 = readLine.nextFloat();
        System.out.print("Insira segundo numero: ");
        float ent2 = readLine.nextFloat();
        System.out.println("Insira um sinal de operação(+-*/): ");

        char ope = readLine.next().charAt(0);
        switch (ope){
            case '+'->System.out.println(ent1 + ent2);
            case '-'->System.out.println(ent1 - ent2);
            case '*'->System.out.println(ent1 * ent2);
            case '/'->System.out.println(ent1 / ent2);
            default -> System.out.println("Valor incorreto");

        }
    }
}
