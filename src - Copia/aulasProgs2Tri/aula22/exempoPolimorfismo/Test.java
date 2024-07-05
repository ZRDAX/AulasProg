package aulasProgs2Tri.aula22.exempoPolimorfismo;

public class Test {

    public static void main(String[] args) {
        Operacoes op = new Operacoes();
        System.out.println("Soamando dois numeros"+op.soma(5,7));
        System.out.println("Soamando tres numeros"+op.soma(7,2,1));
        System.out.println("Soamando duas strings"+op.soma("Palavra", "teste"));
    }
}
