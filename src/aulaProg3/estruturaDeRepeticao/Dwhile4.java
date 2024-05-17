import java.util.Scanner;

public class Dwhile4 {

    public static void main(String[] args){
        Scanner readline = new Scanner(System.in);

        char res;
        do {
            System.out.print("Deseja continuar[s/n]? ");
            res = readline.next().charAt(0);
        }
        while (res=='s' || res=='S');

    }
}
