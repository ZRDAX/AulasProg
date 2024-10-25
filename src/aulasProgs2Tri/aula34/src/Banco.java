package aulasProgs2Tri.aula34.src;

import java.sql.*;

public class Banco {

    private Connection conexao;
    private boolean estaConectado;
    private String mensagemErro;

    private String servidor;
    private String porta;
    private String usuario;
    private String senha;

    public Banco(String servidor, String porta, String usuario, String senha) {
        this.servidor = servidor;
        this.porta = porta;
        this.usuario = usuario;
        this.senha = senha;
    }

    public Banco(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public Connection conectar() {
        try {
            String url = servidor != null
                    ? "jdbc:mysql://" + servidor + ":" + porta + "/" + usuario
                    : "jdbc:mysql://127.0.0.1:3306/" + usuario;

            conexao = DriverManager.getConnection(url, usuario, senha);
            estaConectado = true;

        } catch (SQLException e) {
            mensagemErro = "Erro ao conectar ao banco de dados.";
        }
        return conexao;
    }

    public String obterMensagemErro() {
        return mensagemErro;
    }

    public String fecharConexao() throws SQLException {
        if (conexao != null) {
            conexao.close();
            estaConectado = false;
        }
        return "Status da conexão com o banco (" + conexao + "): Encerrado";
    }
}
