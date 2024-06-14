package aulasProgs2Tri.atvs;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner readline = new Scanner(System.in);
        Conta pers = new Conta();

        int sair = 0;

        do {
            System.out.println(" ⏜  ⏜  ⏜  ⏜  ⏜  ⏜  ⏜  ⏜  ⏜  ⏜  ⏜  ⏜  ⏜  ⏜  ⏜ ");
            System.out.println("⎜ 1 - Realizar  um  saque     ⎜");
            System.out.println("⎜ 2 - Realizar  um  deposito  ⎜");
            System.out.println("⎜ 3 - Verificar um  saldo     ⎜");
            System.out.println("⎜ 4 - Sair      do  programa  ⎜");
            System.out.println(" ⏝  ⏝  ⏝  ⏝  ⏝  ⏝  ⏝  ⏝  ⏝  ⏝  ⏝  ⏝  ⏝  ⏝  ⏝  ");
            int opc = readline.nextInt();
            switch (opc){
                case 1 ->{
                    System.out.println("valor do saque que desejas:");
                    float saque = readline.nextFloat();
                    if(saque >= pers.saldoConta) {
                        System.out.println("saldo insuficiente");
                    }else
                        pers.Sacar(saque);
                }
                case 2 ->{
                    System.out.println("valor do deposito que desejas:");
                    float deposito = readline.nextFloat();
                    pers.Depositar(deposito);
                }
                case 3 ->{
                    System.out.println("Seu saldo: ");

                    float saldos = pers.VerificarSaldo();
                    System.out.println(saldos);

                }
                case 4 ->{System.out.println("Tchau!");
                    sair++;
                }
            }

        }while (sair == 0);

    }
}
