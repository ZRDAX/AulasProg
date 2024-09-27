package aulasProgs2Tri.aula33;

public class ExemploString {
    public static void main(String[] args) {
        String nome = "Jonas";
        String sobrenome = "Silva";
        String nomeCompleto = nome.concat(sobrenome);
        System.out.println("Nome completo: "+nomeCompleto);

        nomeCompleto = nomeCompleto.toUpperCase();
        System.out.println("Nome: "+nomeCompleto);
        nomeCompleto = nomeCompleto.toLowerCase();
        System.out.println("Qual a posição da letra a na string "+ nomeCompleto.indexOf("a"));
        System.out.println("Qual a ultima posição da letra a na string "+ nomeCompleto.lastIndexOf("a"));
        System.out.println("A string inicia com a letra J "+nomeCompleto.startsWith("J"));
        System.out.println("A string inicia com a letra a "+nomeCompleto.endsWith("a"));

        String frase = "Aula de Programação";
        System.out.println(frase);
        frase = frase.replace("Programação", "Programação II");
        System.out.println(frase);
        String[] vetor = frase.split(" ");
        for (String palavra:vetor){
            System.out.println(palavra);
        }
    }
}
