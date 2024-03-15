//A partir de 3 notas fornecidas de um aluno, informe se ele foi aprovado, ficou de recuperação ou foi reprovado. A média de aprovação é >= 7.0; a média de recuperação é >= 5.0 e < 7.0; e a média do reprovado é < 5.0
package aulaProg3.exerciciosAula3;

import java.util.Scanner;

public class exer10 {
    public static void main(String[] args){
        Scanner readLine =  new Scanner(System.in);

        System.out.print("Insira primeira nota: ");
        float n1 = readLine.nextFloat();
        System.out.print("Insira segunda nota: ");
        float n2 = readLine.nextFloat();
        System.out.print("Insira terceira nota: ");
        float n3 = readLine.nextFloat();
        float soma = (n1+n2+n3)/3;
        if(soma >= 7){
            System.out.println("média de aprovação");
        }else if(soma >= 5 && soma < 7){
            System.out.println("média de recuperação");
        }else
            System.out.println("Reprovado");
    }
}
