package aulasProgs2Tri.aula33;

import java.util.HashSet;

public class ExemploHashSet {
    public static void main(String[] args) {
        HashSet<String> compras = new HashSet<>();
        System.out.println("Adicionando arroz a lista "+compras.add("Arroz"));
        System.out.println("Adicionando pastel a lista "+compras.add("Pastel"));
        System.out.println("Adicionando queijo a lista "+compras.add("Queijo"));
        System.out.println("Adicionando chocolate a lista "+compras.add("Chocolate"));
        System.out.println(compras);
        System.out.println("Adicionando Coca-Cola zero a lista "+compras.add("Coca-Cola zero"));
    }
}