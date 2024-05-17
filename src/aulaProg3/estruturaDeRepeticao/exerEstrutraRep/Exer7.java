package exerEstrutraRep;

import java.util.Scanner;

public class Exer7 {
/*Escreva um algoritmo para ler uma senha. Se o usuário não digitar a senha correta que é 12345, o algoritmo deve ler novamente, até que seja a senha correta. O algoritmo deve também contar quantas vezes o usuário tentou digitar a senha incorreta, ou seja, quantas tentativas de acerto aconteceram. Escrever essa informação na tela.
 */
    public static void main(String[] args){
        Scanner readline = new Scanner(System.in);
         int cont = 0;
         int senha = 12345;
         int senhaRes;

        do {
            System.out.print("Insira a senha: ");
            senhaRes = readline.nextInt();
            if (senha != senhaRes){
                System.out.println("senha errada! tente novamente!");
                cont++;
            }
        }while (senha != senhaRes);
        System.out.println(cont+" tentativas");

    }
}
