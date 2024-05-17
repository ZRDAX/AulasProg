package aulaOnze.exemploOO;

public class Lamp {

    String marca;
    String modelo;
    String cor;
    String local;
    Boolean estaLigada;

    void ligar(){
        estaLigada = true;
    }

    void desligar(){
        estaLigada = false;
    }

    String estaLigada(){
        return estaLigada?"sim":"não";
    }
    String obterInformacoe(){
        String obInfo = "Marca: "+marca+", "+"Modelo: "+modelo+", "+"Local: "+local+" e "+"cor "+cor;
        return obInfo;
    }



}
