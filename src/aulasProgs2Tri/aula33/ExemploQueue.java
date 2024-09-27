package aulasProgs2Tri.aula33;

import java.util.ArrayDeque;
import java.util.Queue;

public class ExemploQueue {
    public static void main(String[] args) {
        Queue<String> fila = new ArrayDeque<>();

        fila.add("João");
        fila.add("Marcia");
        fila.add("Pedro");
        fila.add("Ana");
        fila.add("Lucas");
        System.out.println("O proximo da fila é "+fila.peek());
        System.out.println("Atendendo "+fila.remove());
        System.out.println(fila);
    }
}
