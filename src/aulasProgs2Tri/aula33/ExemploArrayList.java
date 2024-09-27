package aulasProgs2Tri.aula33;

import java.util.ArrayList;
import java.util.List;
public class ExemploArrayList {
    public static void main(String[] args) {
        List<String> Lista = new ArrayList<String>();

    Lista.add("A");
    Lista.add("B");
    Lista.add("U");
    Lista.add("D");
    Lista.add("L");
    Lista.add("P");
    Lista.add("J");

    Lista.add ( 3, "D");
    System.out.println(Lista);
    Lista.sort(null);
    System.out.println(Lista);

    System.out.printf("A lista contém um 'T'? "+Lista.contains("T"));
    System.out.printf("Onde está o 'T' na lista? "+Lista.indexOf("T"));

    System.out.printf("Onde está a ultima ocorrencia de 'T' na lista? "+Lista.lastIndexOf("T"));

    Lista.add("T");
    System.out.printf("Onde está a ultima ocorrencia de 'J' na lista? "+Lista.indexOf("T"));

    System.out.println("Removendo o elemento da posição 2 "+Lista.remove(2));
    System.out.println("Removendo o elemento 'D' da lista "+Lista.remove("D"));
    System.out.println(Lista);
    System.out.println("A lista está vazia?"+Lista.isEmpty());
    Lista.clear();
        System.out.println("A lista está vazia? "+Lista.isEmpty());


    }

}
