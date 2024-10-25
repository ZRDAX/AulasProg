package aulasProgs2Tri.aula34.src;

import java.sql.*;
import java.util.Scanner;

public class DeletarConexao {
    public static void main(String[] args) {
        try {
            Scanner ler = new Scanner(System.in);

            // Carregar o driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Tentar conectar
            Connection conexao = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/prog2sexta", "prog2sexta", "123456"
            );
            System.out.println("Conectado ao banco de dados.");

            // Seleção de contatos
            String sql = "SELECT contato_id, nome, e_mail, telefone, now() AS now, time_to_sec(curtime()) AS sec FROM tb_contato;";
            PreparedStatement requisicao = conexao.prepareStatement(sql);
            ResultSet resultado = requisicao.executeQuery();

            // Exibir contatos
            while (resultado.next()) {
                int idContato = resultado.getInt("contato_id");
                String nome = resultado.getString("nome");
                String email = resultado.getString("e_mail");
                String telefone = resultado.getString("telefone");
                String data = resultado.getString("now");
                String segundos = resultado.getString("sec");

                System.out.println("Id: " + idContato);
                System.out.println("Nome: " + nome);
                System.out.println("E-mail: " + email);
                System.out.println("Telefone: " + telefone);
                System.out.println("Hora requisição: " + data);
                System.out.println("Segundos: " + segundos);
                System.out.println("---------------------------------------");
            }

            // Deletar contato
            System.out.print("Qual id deseja excluir: ");
            int id = ler.nextInt();
            sql = "DELETE FROM tb_contato WHERE contato_id = ?";
            requisicao = conexao.prepareStatement(sql);
            requisicao.setInt(1, id);

            int res = requisicao.executeUpdate();
            if (res > 0) {
                System.out.println("Exclusão realizada com sucesso.");
            } else {
                System.out.println("Não foi possível realizar a exclusão.");
            }

            // Fechar recursos
            ler.close();
            conexao.close();
            System.out.println("Conexão encerrada.");

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao carregar o driver!");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ou executar operação no banco de dados: " + e.getMessage());
        }
    }
}
