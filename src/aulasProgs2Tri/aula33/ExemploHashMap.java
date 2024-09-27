package aulasProgs2Tri.aula33;

import java.util.HashMap;

public class ExemploHashMap {
    public static void main(String[] args) {
        HashMap<String, String> capitais = new HashMap<>();
        capitais.put("RS", "Porto Alegre");
        capitais.put("PR", "Curitiba");
        capitais.put("SC", "Florianopolis");
        capitais.put("SP", "São Paulo");
        capitais.put("RJ", "Rio de Janeiro");
        System.out.println(capitais);

        System.out.println("Lista de estados");
        for (String estado:capitais.keySet())
            System.out.println(estado+" ");

        System.out.println("\nLista de cidades");
        for (String cidades:capitais.values())
            System.out.println(cidades+" ");

        System.out.println("\nApagando a chave 'RJ' da lista "+capitais.remove("RJ"));
        System.out.println("\nLista de estados");
        for (String estado:capitais.keySet())
            System.out.println(estado+" ");

        System.out.println("A lista contem uma chave 'RS' "+ capitais.containsKey("RS"));
        System.out.println("A lista contem uma Cidade 'Porto Alegre' "+ capitais.containsValue("Porto Alegre"));
    }
}
