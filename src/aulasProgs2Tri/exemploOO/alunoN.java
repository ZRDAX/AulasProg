package aulasProgs2Tri.exemploOO;

import java.util.Scanner;

public class alunoN {
    String nome;
    String sobrenome;
    String eMail;
    int codigo;
    float n1;
    float n2;
    float media;

    Float Meedia(){
        media = (n1+n2)/2;
        return media;
    }

    void aprovacao(){
        if (media>=8){
            System.out.println("aprovado");
        } else if (media>=6) {
            System.out.println("recuperação");
        }else{
            System.out.println("reprovado");
        }
    }
    String nino(){
        String ipo = "nome: "+nome+" "+sobrenome+"\n"+"email: "+eMail+"\n"+"codigo de aluno: "+codigo;
        return ipo;
    }
}
