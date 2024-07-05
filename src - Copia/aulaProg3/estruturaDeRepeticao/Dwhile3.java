import java.util.Scanner;

public class Dwhile3 {

    public static void main(String[] args){
        Scanner readline = new Scanner(System.in);

        System.out.println("Digite uma nota: ");
        int nota = readline.nextInt();

        while (nota<0 || nota>10){
            System.out.println("Nota inválida, Digite uma nota: ");
            nota = readline.nextInt();
        }


        int notaDois;
        do {
            System.out.println("Digite uma nota: ");
            notaDois = readline.nextInt();
            if (notaDois<0 || notaDois>10)
                System.out.println("Nota inválida!");
        }
        while (notaDois<0 || notaDois>10);

    }
}
