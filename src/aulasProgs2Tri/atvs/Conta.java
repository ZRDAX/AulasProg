package aulasProgs2Tri.atvs;

import java.util.Scanner;

public class Conta {
    Scanner readline = new Scanner(System.in);
    float valor;
    float saldoConta;
    String nomeTitular;
    String identificador;
    String senha;

    public Conta(){
        saldoConta=1;
    }

    public void Depositar(float valor){
        saldoConta += valor;
        System.out.println("você depositou!");
    }
    
    public void Sacar(float valor){
        saldoConta -= valor;
        System.out.println("você sacou!");
    }

    public float VerificarSaldo(){

        return saldoConta;
    }
}
