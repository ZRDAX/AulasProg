package aulaOnze.exemploOO;

public class lampTest {
    public static void main(String[] args) {

        Lamp lampada = new Lamp();
        lampada.marca = "Crisol";
        lampada.modelo = "Branca";
        lampada.cor = "Amarela";
        lampada.local = "Sala";
        System.out.println(lampada.obterInformacoe());
        lampada.ligar();
        lampada.desligar();
        System.out.println(lampada.modelo+" Está ligada? "+lampada.estaLigada());





    }
}
