package aulasProgs2Tri.aula31.Interface;

/**
 * @version 1
 * @author Rodrigo
 */
public class Vetor implements Lista {

    private String[] elementos;

    private int tamanho;

    /**
     * cria uma instancia
     * @param capacidade capacidade inicial da lista
     */

    public Vetor(int capacidade){
        elementos = new String[capacidade];
        tamanho = 0;
    }


    /**
     *
     * @param elemento elemento que será adicionado
     */
    public void adiciona(String elemento){
        elementos[tamanho] = elemento;
        tamanho++;
    }


    @Override
    public String remove(){
        if (tamanho>0){
            return elementos[--tamanho];
        }
        return null;
    }


    /**
     *
     * @return inteiro contendo a quantidade de elementos
     */
    public int getTamanho(){
        return tamanho;
    }

    /**
     *
     * @return um conjunto vazio para listas vazias = [] ou conjunto com os
     * elementos da lista = ['A' 'B' 'n']
     */
    @Override
    public String toString(){
        String resultado = "[";
        if (tamanho>0){
            for (int i=0; i < tamanho; i++){
                resultado+=elementos[i]+" ";
            }
        }
        resultado+="]";
        return resultado;
    }

}
