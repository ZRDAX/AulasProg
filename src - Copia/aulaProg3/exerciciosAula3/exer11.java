//Solicite o nome e a idade de duas pessoas. Em seguida exiba o nome da pessoa mais velha e o nome da pessoa mais nova.
package aulaProg3.exerciciosAula3;

import java.util.Scanner;

public class exer11 {
    public static void main(String[] args){
        Scanner readLine =  new Scanner(System.in);

        System.out.print("Insira primeira pessoa: ");
        String nome1 = readLine.nextLine();
        System.out.print("Insira primeira idade: ");
        int idade1 = readLine.nextInt();
        System.out.print("Insira segunda pessoa: ");
        String nome2 = readLine.next();
        System.out.print("Insira segunda idade: ");
        int idade2 = readLine.nextInt();

        if(idade1 > idade2){
            System.out.println("essa pessoa é mais velha: "+nome1+" "+idade1);
        }else if(idade1 < idade2){
            System.out.println("essa pessoa é mais velha: "+nome2+" "+idade2);
        }else
            System.out.println("Ambos tem a mesma idade");
    }
}
