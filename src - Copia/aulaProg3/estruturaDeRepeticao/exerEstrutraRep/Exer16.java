package exerEstrutraRep;

import java.util.Scanner;

public class Exer16 {
/*O mesmo exercício anterior, mas agora não será informado o número de mercadorias em estoque. Então o funcionamento deverá ser da seguinte forma: ler o valor da mercadoria e perguntar “MAIS MERCADORIAS (S/N)?”. Ao final, imprimir o valor total em estoque e a média de valor das mercadorias em estoque.

 */
    public static void main(String[] args){
        Scanner readline = new Scanner(System.in);

        int valorM;
        int contV = 0;
        int contEstoque = 0;
        char res;
        do {
            System.out.print("Valor do produto:");
            valorM = readline.nextInt();
            contEstoque++;
            contV = contV + valorM;

            System.out.print("\nmais mercadorias?[s/n]? ");
            res = readline.next().charAt(0);
        }while (res=='s' || res=='S');
        int contM = contV/contEstoque;
        System.out.print("estoque total = "+contEstoque+" media de valor das mercadorias "+contM);
    }
}
