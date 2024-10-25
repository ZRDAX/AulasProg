package aulasProgs2Tri.aula34.src;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner entrada = new Scanner(System.in);

        Banco bancoConexao = null;
        Contato registroContato = null;
        List<Contato> listaContatos;

        Class.forName("com.mysql.cj.jdbc.Driver");

        String escolha;
        do {
            System.out.println("==========================");
            System.out.println("1 - Conectar ao banco de dados");
            System.out.println("2 - Conectar ao banco de dados local");
            System.out.println("3 - Adicionar novo contato");
            System.out.println("4 - Vincular conexão ao contato");
            System.out.println("5 - Atualizar informações de contato");
            System.out.println("6 - Remover contato");
            System.out.println("7 - Buscar contato");
            System.out.println("8 - Exibir todos os contatos");
            System.out.println("9 - Procurar contatos por termo");
            System.out.println("0 - Sair");
            System.out.println("===============================");
            System.out.print("Escolha uma opção: ");
            escolha = entrada.next();

            switch (escolha) {
                case "1" -> {
                    System.out.print("Informe o servidor: ");
                    String servidor = entrada.next();
                    System.out.print("Informe a porta: ");
                    String porta = entrada.next();
                    System.out.print("Informe o usuário: ");
                    String usuario = entrada.next();
                    System.out.print("Informe a senha: ");
                    String senha = entrada.next();
                    bancoConexao = new Banco(servidor, porta, usuario, senha);
                    System.out.println(bancoConexao.conectar());
                }
                case "2" -> {
                    System.out.print("Informe o usuário: ");
                    String usuario = entrada.next();
                    System.out.print("Informe a senha: ");
                    String senha = entrada.next();
                    bancoConexao = new Banco(usuario, senha);
                    System.out.println(bancoConexao.conectar());
                }
                case "3" -> {
                    String subEscolha;

                    do {
                        System.out.println("++++++++++++++++++++++++++++++");
                        System.out.println("1 - Criar contato com conexão");
                        System.out.println("2 - Criar contato sem conexão");
                        System.out.println("3 - Voltar");
                        System.out.println("++++++++++++++++++++++++++++++");
                        System.out.print("Escolha uma opção: ");
                        subEscolha = entrada.next();

                        switch (subEscolha) {
                            case "1" -> {
                                if (bancoConexao != null) {
                                    registroContato = new Contato(bancoConexao.conectar());
                                } else {
                                    System.out.println("Nenhuma conexão com banco estabelecida.");
                                }
                            }
                            case "2" -> {
                                registroContato = new Contato();
                                System.out.println("[ALERTA] Criando contato sem conexão. Lembre-se de usar a opção 4 antes de criar outro.");
                            }
                        }

                        if (subEscolha.equals("1") || subEscolha.equals("2")) {
                            entrada.nextLine(); // limpar o buffer do Scanner
                            System.out.print("Nome: ");
                            registroContato.setNome(entrada.nextLine());
                            System.out.print("E-mail: ");
                            registroContato.setEmail(entrada.next());
                            System.out.print("Telefone: ");
                            registroContato.setTelefone(entrada.next());

                            if (registroContato.getConexao() != null) {
                                registroContato.salvarContato();
                            }
                            subEscolha = "3";
                        }

                    } while (!subEscolha.equals("3"));
                }
                case "4" -> {
                    if (bancoConexao != null && registroContato != null) {
                        registroContato.setConexao(bancoConexao.conectar());
                        System.out.println("Conexão associada com sucesso.");
                        registroContato.salvarContato();
                    } else {
                        System.out.println("Banco de dados ou contato não definidos.");
                    }
                }
                case "5" -> {
                    String alterarOpcao;

                    do {
                        System.out.println("++++++++++++++++++++++++++++++");
                        System.out.println("1 - Atualizar contato por ID");
                        System.out.println("2 - Atualizar último contato");
                        System.out.println("3 - Voltar");
                        System.out.println("++++++++++++++++++++++++++++++");
                        System.out.print("Escolha uma opção: ");
                        alterarOpcao = entrada.next();

                        if (alterarOpcao.equals("1")) {
                            if (registroContato != null) {
                                registroContato.atualizarContatoPorId();
                            } else {
                                System.out.println("Nenhum contato registrado.");
                            }
                            alterarOpcao = "3";
                        } else if (alterarOpcao.equals("2")) {
                            if (registroContato != null) {
                                registroContato.atualizarContato();
                                System.out.println(registroContato.getIdContato());
                            } else {
                                System.out.println("Nenhum contato registrado.");
                            }
                            alterarOpcao = "3";
                        }

                    } while (!alterarOpcao.equals("3"));
                }
                case "6" -> {
                    String deletarOpcao;

                    do {
                        System.out.println("++++++++++++++++++++++++++++++");
                        System.out.println("1 - Deletar contato por ID");
                        System.out.println("2 - Deletar último contato");
                        System.out.println("3 - Voltar");
                        System.out.println("++++++++++++++++++++++++++++++");
                        System.out.print("Escolha uma opção: ");
                        deletarOpcao = entrada.next();

                        if (deletarOpcao.equals("1")) {
                            if (registroContato != null) {
                                registroContato.deletarContatoPorId();
                            } else {
                                System.out.println("Nenhum contato registrado.");
                            }
                            deletarOpcao = "3";
                        } else if (deletarOpcao.equals("2")) {
                            if (registroContato != null) {
                                registroContato.deletarContato();
                                System.out.println(registroContato.getIdContato());
                            } else {
                                System.out.println("Nenhum contato registrado.");
                            }
                            deletarOpcao = "3";
                        }

                    } while (!deletarOpcao.equals("3"));
                }
                case "7" -> {
                    String buscarOpcao;

                    do {
                        System.out.println("++++++++++++++++++++++++++++++");
                        System.out.println("1 - Buscar contato por ID");
                        System.out.println("2 - Buscar último contato");
                        System.out.println("3 - Voltar");
                        System.out.println("++++++++++++++++++++++++++++++");
                        System.out.print("Escolha uma opção: ");
                        buscarOpcao = entrada.next();

                        if (buscarOpcao.equals("1")) {
                            if (registroContato != null) {
                                System.out.print("Informe o ID do contato: ");
                                int id = entrada.nextInt();
                                ResultSet resultado = registroContato.buscarContatoPorId(id);
                                while (resultado.next()) {
                                    System.out.println("++++++++++++++++++++++++++++++");
                                    System.out.println("ID: " + resultado.getInt("contato_id"));
                                    System.out.println("Nome: " + resultado.getString("nome"));
                                    System.out.println("E-mail: " + resultado.getString("e_mail"));
                                    System.out.println("Telefone: " + resultado.getString("telefone"));
                                    System.out.println("++++++++++++++++++++++++++++++");
                                }
                            } else {
                                System.out.println("Nenhum contato registrado.");
                            }
                        } else if (buscarOpcao.equals("2")) {
                            if (registroContato != null) {
                                ResultSet resultado = registroContato.buscarContato();
                                while (resultado.next()) {
                                    System.out.println("++++++++++++++++++++++++++++++");
                                    System.out.println("ID: " + resultado.getInt("contato_id"));
                                    System.out.println("Nome: " + resultado.getString("nome"));
                                    System.out.println("E-mail: " + resultado.getString("e_mail"));
                                    System.out.println("Telefone: " + resultado.getString("telefone"));
                                    System.out.println("++++++++++++++++++++++++++++++");
                                }
                            } else {
                                System.out.println("Nenhum contato registrado.");
                            }
                        }
                    } while (!buscarOpcao.equals("3"));
                }
                case "8" -> {
                    if (registroContato != null) {
                        listaContatos = registroContato.listarContatos();
                        for (Contato contato : listaContatos) {
                            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
                            System.out.println("ID: " + contato.getIdContato());
                            System.out.println("Nome: " + contato.getNome());
                            System.out.println("E-mail: " + contato.getEmail());
                            System.out.println("Telefone: " + contato.getTelefone());
                        }
                    } else {
                        System.out.println("Nenhum contato registrado.");
                    }
                }
                case "9" -> {
                    if (registroContato != null) {
                        entrada.nextLine();
                        System.out.print("Informe o termo de busca: ");
                        String termoBusca = entrada.nextLine();
                        listaContatos = registroContato.pesquisarContato("termoDeBusca");
                        for (Contato contato : listaContatos) {
                            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
                            System.out.println("ID: " + contato.getIdContato());
                            System.out.println("Nome: " + contato.getNome());
                            System.out.println("E-mail: " + contato.getEmail());
                            System.out.println("Telefone: " + contato.getTelefone());
                        }
                    } else {
                        System.out.println("Nenhum contato registrado.");
                    }
                }
                case "0" -> {
                    if (bancoConexao != null) {
                        System.out.println(bancoConexao.fecharConexao());
                    } else {
                        System.out.println("Nenhuma conexão ativa.");
                    }
                }
            }
        } while (!escolha.equals("0"));
    }
}
