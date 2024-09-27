package aulasProgs2Tri.aula33.Hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hosp {

    public static void main(String[] args) {
        List<Paciente> pajente = new ArrayList<>();
        Scanner readline = new Scanner(System.in);
        String resp;
        do {

            System.out.println("I- Incluir paciente");
            System.out.println("A- Alterar paciente ");
            System.out.println("R- Realizar um atendimento ");
            System.out.println("L- Listar os pacientes ");
            System.out.println("M- Mostrar paciente ");
            System.out.println("D- Deletar paciente ");
            System.out.println("S- Sair");

            System.out.print("\nopção? ");
            resp = readline.next();
            switch (resp){
                case "I" -> System.out.println("a");
                case "A" -> System.out.println("9");
                case "R" -> System.out.println("t");
                case "L" -> System.out.println("r");
                case "M" -> System.out.println("e");
                case "D" -> System.out.println("s");

                default -> System.out.println("Entrada inválida");
            }
        }while (!resp.equals("S"));


    }
}
