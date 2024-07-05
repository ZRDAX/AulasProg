package aulasProgs2Tri.aula20.ExemploStatic;
import java.util.Random;

public class Conta {

    float valor;
    float saldoConta;
    String nomeTitular;
    String identificador;
    String senha;

    static String nomeBanco;

    public Conta(String nomeTitular, String senha, float deposito){
        this.nomeTitular = nomeTitular;
        this.senha = senha;
        saldoConta = deposito;
        //geraIdentificador();
    }

    public void Depositar(float valor){
        saldoConta += valor;
        System.out.println("você depositou!");
    }

    public void Sacar(float valor){
        saldoConta -= valor;
        System.out.println("você sacou!");
    }
/*
    void geraIdentificador(){
        Random aleatorio = new Random();
        String identificador = "";
        for (int i=0; i<4; i++){
            identificador+=(char)aleatorio.nextInt(65,90);
        }
        identificador+=aleatorio.nextInt(1000, 2000);
        this.identificador = identificador;
    }
*/
    public float VerificarSaldo(){

        return saldoConta;
    }
}
