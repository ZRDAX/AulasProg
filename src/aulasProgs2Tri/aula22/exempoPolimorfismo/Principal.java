package aulasProgs2Tri.aula22.exempoPolimorfismo;

public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setNome("Jonas");
        p1.setSobrenome("silva");

        Aluno p2 = new Aluno();
        p2.setNome("Ana");
        p2.setSobrenome("silva");
        p2.setMatricula("1234");

        System.out.printf("");
    }
}
