package aulasProgs2Tri.aula22.exempoPolimorfismo;

public class Pessoa {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    private String nome;
    private String sobrenome;

    public String obterdados(){
        return "Nome: "+nome+ " Sobrenome:"+sobrenome;
    }

    @Override
    public String toString(){
        return "Nome: "+nome+" Sobrenome: "+sobrenome;
    }
}
