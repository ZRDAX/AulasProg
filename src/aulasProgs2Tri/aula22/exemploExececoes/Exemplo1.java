package aulasProgs2Tri.aula22.exemploExececoes;

import javax.xml.transform.Source;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {

        try {
            Scanner readline = new Scanner(System.in);
            System.out.printf("Digite um numero: ");
            int n1 = readline.nextInt();
            System.out.printf("Digite outro numero: ");
            int n2 = readline.nextInt();
            int resultado = n1 / n2;
            System.out.println(resultado);
        }catch (InputMismatchException erro){
            System.out.printf("N1 e N2 precisam ser numeros");
            //erro.
        }catch (ArithmeticException erro){
            System.out.printf("Não é possivel dividir por zero");
        }
    }
}
