package aulasProgs2Tri.aula23.arquivosDeObjeto;

import java.io.Serializable;

    public class Pessoa implements Serializable{
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

        @Override
        public String toString(){
            return "nome: "+nome+" "+sobrenome;
        }
    }
