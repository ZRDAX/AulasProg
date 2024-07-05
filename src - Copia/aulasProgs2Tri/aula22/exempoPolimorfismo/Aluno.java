package aulasProgs2Tri.aula22.exempoPolimorfismo;

public class Aluno extends Pessoa {

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    private String matricula;


    public String obterdados(){
        return "Nome: "+getNome()+ " Sobrenome:"+getSobrenome()+" Matricula"+getMatricula();
    }


}
