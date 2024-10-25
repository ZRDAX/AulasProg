package aulasProgs2Tri.aula34.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CriarConexao {
    public static void main(String[] args) {
        try {
            // Carregar o driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Tentar conectar
            Connection conexao = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/prog2sexta", "prog2sexta", "123456"
            );
            System.out.println("Conectado ao banco de dados.");

            // Fechar a conexão
            conexao.close();
            System.out.println("Conexão encerrada.");

        } catch (ClassNotFoundException e) {
            System.out.println("Erro ao carregar o driver!");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }
}
