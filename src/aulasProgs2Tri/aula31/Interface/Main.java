package aulasProgs2Tri.aula31.Interface;

public class Main {

    public static void main(String[] args) {
        Vetor v1 = new Vetor(10);
        v1.adiciona("a");
        v1.adiciona("b");
        v1.adiciona("c");
        v1.adiciona("d");

        System.out.println("Qual o Tamanho de v1"+ v1.getTamanho());
        System.out.println(v1);
        System.out.println("apagando o elementos"+v1.remove());
        System.out.println(v1);

        Lista l1 = new Vetor(5);

        l1.adiciona("teste");
        l1.remove();
        //getTamanho existe somente em vetor e não em Lista, portando não está disponivel

        Vetor v2 = new Vetor(10);
    }
}
