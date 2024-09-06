package aulasProgs2Tri.aula31.classesAbstratas;

public class Main {
    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        c1.setRaio(4);
        System.out.println("A area da figura "+c1.getNomeFigura()+ " vale "+ c1.calculaArea());
        System.out.println("A area da figura "+c1.getNomeFigura()+ " vale "+ c1.calculaArea());

        Retangulo r1 = new Retangulo();
        r1.setAltura(3);
        r1.setBase(5);
        System.out.println("A area da figura "+r1.getNomeFigura()+ " vale "+ r1.calculaArea());
        System.out.println("A perimetro da figura "+r1.getNomeFigura()+ " vale "+ r1.calculaPerimetro());
    }
}
