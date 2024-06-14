package aulasProgs2Tri.exemploOO;

public class Teste {

    public static void main(String[] args) {

        pessoa pessoaum = new pessoa();
        pessoaum.nome = "Ana";
        pessoaum.sobrenome = "Silva";
        pessoaum.altura = 170;
        pessoaum.dataNasc = "25/10/1999";
        pessoaum.idade = 24;
        pessoaum.andar();
        pessoaum.correr();
        pessoaum.falar();

        pessoa pessoadois = new pessoa();
        pessoadois.nome = "Arthur";
        pessoadois.sobrenome = "Brigmann";
        pessoadois.altura = 176;
        pessoadois.dataNasc = "25/10/1999";
        pessoadois.idade = 24;
        pessoadois.andar();
        pessoadois.correr();
        pessoadois.falar();




    }
}
