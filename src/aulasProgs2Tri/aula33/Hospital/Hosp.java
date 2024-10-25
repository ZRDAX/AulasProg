package aulasProgs2Tri.aula33.Hospital;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hosp {
    static List<Paciente> pajente = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String resposta;
        do {
            System.out.println("I - Incluir paciente");
            System.out.println("A - Alterar paciente");
            System.out.println("R - Realizar um atendimento");
            System.out.println("L - Listar os pajente");
            System.out.println("M - Mostrar paciente");
            System.out.println("D - Deletar paciente");
            System.out.println("S - Sair");

            System.out.print("\nselecionar: ");
            resposta = scanner.next();
            switch (resposta.toUpperCase()) {
                case "I" -> incluirPaciente();
                case "A" -> alterarPaciente();
                case "R" -> realizarAtendimento();
                case "L" -> listarPacientes();
                case "M" -> mostrarPaciente();
                case "D" -> deletarPaciente();
                case "S" -> System.out.println("Obrigado e tenha um ótimo dia!\nsaindo....");
                default -> System.out.println("Entrada inválida");
            }
        } while (!resposta.equalsIgnoreCase("S"));
    }

    public static void incluirPaciente() {
        System.out.print("Digite o primeiro nome do paciente: ");
        String nome = scanner.next();
        scanner.nextLine();
        System.out.print("Digite o sobrenome do paciente: ");
        String sobrenome = scanner.nextLine();
        System.out.print("Digite a data de nascimento (dd mm aaaa): ");
        int dia = scanner.nextInt();
        int mes = scanner.nextInt();
        int ano = scanner.nextInt();
        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);

        Paciente paciente = new Paciente(nome, sobrenome);
        paciente.setDataNascimento(dataNascimento);
        paciente.setAtivo(true);
        pajente.add(paciente);
        System.out.println("Paciente incluído: " + paciente);
    }

    public static void alterarPaciente() {
        String nomeCompleto = pegarNomePaciente("alterar");
        Paciente paciente = encontrarPaciente(nomeCompleto);
        if (paciente != null) {

            System.out.print("Digite o novo primeiro nome do paciente: ");
            paciente.setNome(scanner.next());
            scanner.nextLine();
            System.out.print("Digite o novo sobrenome do paciente: ");
            paciente.setSobrenome(scanner.nextLine());
            System.out.println("Paciente alterado: " + paciente);
        } else {
            System.out.println("Paciente não encontrado!");
        }
    }

    public static void realizarAtendimento() {
        String nomeCompleto = pegarNomePaciente("atendimento");
        Paciente paciente = encontrarPaciente(nomeCompleto);
        if (paciente != null) {
            Atendimento atendimento = new Atendimento();
            System.out.print("Digite a descrição do atendimento: ");
            atendimento.setDescricao(scanner.next());
            System.out.print("Digite a data do atendimento (dd mm aaaa): ");
            int dia = scanner.nextInt();
            int mes = scanner.nextInt();
            int ano = scanner.nextInt();
            LocalDate dataAtendimento = LocalDate.of(ano, mes, dia);
            atendimento.setData(dataAtendimento);

            paciente.adicionarConsulta(atendimento);
            System.out.println("Atendimento realizado para: " + paciente);
        } else {
            System.out.println("Paciente não encontrado!");
        }
    }

    public static void listarPacientes() {
        for (Paciente paciente : pajente) {
            if (paciente.isAtivo()) {
                System.out.println(paciente);
            }
        }
        System.out.println("────────────────────────────");
    }

    public static void mostrarPaciente() {
        String nomeCompleto = pegarNomePaciente("mostrar");
        Paciente paciente = encontrarPaciente(nomeCompleto);
        if (paciente != null) {
            System.out.println(paciente);
            int i = 1;
            for (Atendimento a : paciente.getAtendimentos()) {
                if (a != null) {
                    System.out.println(a);
                    if (i++ % 5 == 0) {
                        System.out.println("───────────────────────────────────────────────────────────");
                    }
                } else {
                    System.out.println("Paciente não marcou consulta");
                }
            }
        } else {
            System.out.println("Paciente não encontrado!");
        }
    }

    public static void deletarPaciente() {
        String nomeCompleto = pegarNomePaciente("apagar");
        Paciente paciente = encontrarPaciente(nomeCompleto);
        if (paciente != null) {
            pajente.remove(paciente);
            System.out.println("Paciente removido: " + paciente);
        } else {
            System.out.println("Paciente não encontrado!");
        }
    }

    public static String pegarNomePaciente(String acao) {
        scanner.nextLine();
        System.out.printf("Digite o nome completo do paciente que deseja %s: ", acao);
        return scanner.nextLine();
    }

    private static Paciente encontrarPaciente(String nomeCompleto) {
        for (Paciente paciente : pajente) {
            if (paciente.getNomeCompleto().equalsIgnoreCase(nomeCompleto)) {
                return paciente;
            }
        }
        return null;
    }
}
