package aulasProgs2Tri.aula23.arquivosDeObjeto;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Scanner;
import java.util.TreeMap;

public class EscreverObjeto {
    public static void main(String[] args) {
        //Objeto para manipular o caminho do arquivo.
        File caminho = new File("C:\\Users\\Cimol\\Documents\\aula23_tarde");

        if (caminho.exists()){
            //caminho existe
            System.out.println("A pasta existe");
        }else {
            //caminho não existe então cria os direto
            caminho.mkdirs();
            System.out.println("Caminho criado");
        }

        File arquivo = new File(caminho,"pessoa.db");

        System.out.println(arquivo.getAbsolutePath());

        try {
            ObjectOutputStream arquivoObj = new ObjectOutputStream(new FileOutputStream(arquivo.getAbsolutePath()));

            Pessoa[] lista = new Pessoa[10];
            Scanner readline = new Scanner(System.in);
            String opc;
            int cont = 0;
            do {
                System.out.println("Lendo informações da pessoa"+(cont+1));
                System.out.println("Qual o nome: ");
                String nome = readline.next();
                System.out.println("Qual o sobrenome: ");
                String sobrenome = readline.next();
                lista[cont] = new Pessoa();
                lista[cont].setNome(nome);
                lista[cont].setSobrenome(sobrenome);
                System.out.println("Tem mais pessoas (S/n): ");
                opc = readline.next().toLowerCase();
                cont++;
            }while (opc.equals("s"));

            // Pessoa p1 = new Pessoa();
           //  p1.setNome("Jonas");
          //   p1.setSobrenome("Silva");

            arquivoObj.writeObject(lista);
            arquivoObj.close();
        }catch (IOException e){
            System.out.println("Erro ao criar um arquivo!");
        }

    }
}
