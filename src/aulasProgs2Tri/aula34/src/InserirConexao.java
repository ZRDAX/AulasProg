package aulasProgs2Tri.aula34.src;

import java.sql.*;
import java.util.Scanner;

public class InserirConexao {
    public static void main(String[] args) {
        try {
            // Carregar o driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Tentar conectar
            Connection conexao = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/prog2sexta", "prog2sexta", "123456"
            );
            System.out.println("Conectado ao banco de dados.");

            // Comando SQL para inserção
            String sql = "INSERT INTO tb_contato(nome, e_mail, telefone) VALUES (?, ?, ?)";
            PreparedStatement requisicao = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            // Solicitar dados do contato
            Scanner ler = new Scanner(System.in);
            System.out.print("Nome: ");
            String nome = ler.nextLine();
            System.out.print("E-mail: ");
            String email = ler.next();
            System.out.print("Telefone: ");
            String telefone = ler.next();

            // Definir parâmetros da requisição
            requisicao.setString(1, nome);
            requisicao.setString(2, email);
            requisicao.setString(3, telefone);

            // Executar a requisição e obter o ID gerado
            requisicao.execute();
            ResultSet resultado = requisicao.getGeneratedKeys();
            if (resultado.next()) {
                int idContato = resultado.getInt(1);
                System.out.println("Contato " + nome + " gravado com o ID " + idContato);
            }

            // Fechar scanner e conexão
            ler.close();
            conexao.close();
            System.out.println("Conexão encerrada.");

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao carregar o driver!");
        } catch (SQLException e) {
            System.out.println("Erro na operação de banco de dados: " + e.getMessage());
        }
    }
}
