package aulasProgs2Tri.aula33.Hospital;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Atendimento {
    private LocalDate data;
    private String descricao;
    public String getDescricao() {
        return descricao;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString(){
        DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String data = formatoBr.format(this.data);
        String retorno = "Descrição: " + descricao;
        retorno+= ", Data: "+data;
        return retorno;
    }
}
