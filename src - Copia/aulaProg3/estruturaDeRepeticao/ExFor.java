import java.util.Scanner;

public class ExFor {
    public static void main(String[] args){
        Scanner readline = new Scanner(System.in);

        for(int i=0; i<=10; i++){
            System.out.print(i+" ");
        }

        System.out.println("\n\nExemplo Dois ");
        int i;
        for (i=0; i<20;i++){
            System.out.print(i+" ");
        }

        System.out.println("\n\nExemplo Tres ");
        for (int j=0, l=9; j<10 && l>=0; j++, l++){
            System.out.print(" j = "+j+" l = "+l);
        }

        System.out.println("\n\nExemplo Quatro ");
        int t=10;
        for (;t<=20;t++){
            System.out.print(" t = "+t);
        }

        System.out.println("\n\nExemplo Cinco ");
        t=0;
        for (;t<10;){
            System.out.print(" t = "+t+";");
            t++;
        }
    }
}
