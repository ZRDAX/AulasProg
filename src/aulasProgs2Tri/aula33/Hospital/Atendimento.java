package aulasProgs2Tri.aula33.Hospital;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Atendimento {
    private LocalDate data;
    private String descricao;
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString(){
        DateTimeFormatter formartoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String data = formartoBr.format(this.data);
        String retorno = "Data: "+data;
        retorno += "\nInformações: "+descricao;
        return retorno;
    }
}
