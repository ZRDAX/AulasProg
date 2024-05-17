package aulaOnze.exemploOO;

import java.util.Random;
import java.util.Scanner;

public class alunoTest {
    public static void main(String[] args) {
        Scanner writeline = new Scanner(System.in);
        Random ale = new Random();

        alunoN aluno1 = new alunoN();
        System.out.println("Seu nome: ");
        aluno1.nome = writeline.next();
        System.out.println("Seu sobrenome: ");
        aluno1.sobrenome = writeline.next();
        System.out.println("Seu email: ");
        aluno1.eMail = writeline.next();
        aluno1.codigo = ale.nextInt(1,10000);
        System.out.println("Sua nota um: ");
        aluno1.n1 = writeline.nextFloat();
        System.out.println("Sua nota dois: ");
        aluno1.n2 = writeline.nextFloat();
        System.out.println("informações do "+aluno1.nome+"\n"+aluno1.nino());
        System.out.println("media: "+aluno1.Meedia());
        System.out.print("Situação: ");
        aluno1.aprovacao();


        alunoN aluno2 = new alunoN();
        aluno2.nome = "fernanda";
        aluno2.sobrenome = "rosa";
        aluno2.eMail = "frosa@educar";
        aluno2.codigo = 358;
        aluno2.n1 = 8;
        aluno2.n2 = 7;
        System.out.println("\ninformações da "+aluno2.nome+"\n"+aluno2.nino());
        System.out.println("media: "+aluno2.Meedia());
        System.out.print("Situação: ");
        aluno2.aprovacao();

    }

}
