package aulasProgs2Tri.aula34.src;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Contato {

    private Integer idContato;
    private String nome;
    private String email;
    private String telefone;
    private Connection conexao;

    private final Scanner entrada = new Scanner(System.in);

    public Contato(Connection conexao) {
        this.conexao = conexao;
    }


    public Contato() {
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }
    public Connection getConexao() {
        return conexao;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getIdContato() {
        return idContato;
    }

    public void setIdContato(Integer idContato) {
        this.idContato = idContato;
    }

    public void setConexao(Connection conexao) {
        this.conexao = conexao;
    }

    // Métodos de CRUD
    public void salvarContato() throws SQLException {
        String sql = "INSERT INTO tb_contato (nome, e_mail, telefone) VALUES (?, ?, ?)";
        PreparedStatement stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

        stmt.setString(1, nome);
        stmt.setString(2, email);
        stmt.setString(3, telefone);

        stmt.execute();
        ResultSet resultado = stmt.getGeneratedKeys();
        if (resultado.next()) {
            this.idContato = resultado.getInt(1);
            System.out.println("Contato " + nome + " gravado com ID " + this.idContato);
        }

        if (conexao == null) {
            throw new SQLException("Erro: contato não possui conexão");
        }
    }

    public void atualizarContato() throws SQLException {
        String sql = "UPDATE tb_contato SET nome = ?, e_mail = ?, telefone = ? WHERE contato_id = " + this.idContato;
        PreparedStatement stmt = conexao.prepareStatement(sql);

        System.out.print("Nome: ");
        nome = entrada.next();
        System.out.print("E-mail: ");
        email = entrada.next();
        System.out.print("Telefone: ");
        telefone = entrada.next();

        stmt.setString(1, nome);
        stmt.setString(2, email);
        stmt.setString(3, telefone);

        int resultado = stmt.executeUpdate();
        System.out.println(resultado > 0 ? "Atualização realizada" : "Atualização falhou");
    }

    public void atualizarContatoPorId() throws SQLException {
        String sql = "UPDATE tb_contato SET nome = ?, e_mail = ?, telefone = ? WHERE contato_id = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);

        System.out.print("Digite o ID para atualização: ");
        int id = entrada.nextInt();

        System.out.print("Nome: ");
        nome = entrada.next();
        System.out.print("E-mail: ");
        email = entrada.next();
        System.out.print("Telefone: ");
        telefone = entrada.next();

        stmt.setString(1, nome);
        stmt.setString(2, email);
        stmt.setString(3, telefone);
        stmt.setInt(4, id);

        int resultado = stmt.executeUpdate();
        System.out.println(resultado > 0 ? "Atualização realizada" : "Atualização falhou");
    }

    public void deletarContato() throws SQLException {
        String sql = "DELETE FROM tb_contato WHERE contato_id = " + this.idContato;
        PreparedStatement stmt = conexao.prepareStatement(sql);

        int resultado = stmt.executeUpdate();
        System.out.println(resultado > 0 ? "Exclusão realizada" : "Falha na exclusão");
    }

    public void deletarContatoPorId() throws SQLException {
        String sql = "DELETE FROM tb_contato WHERE contato_id = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);

        System.out.print("Digite o ID para exclusão: ");
        int id = entrada.nextInt();
        stmt.setInt(1, id);

        int resultado = stmt.executeUpdate();
        System.out.println(resultado > 0 ? "Exclusão realizada" : "Falha na exclusão");
    }

    public ResultSet buscarContatoPorId(int idContato) throws SQLException {
        String sql = "SELECT contato_id, nome, e_mail, telefone FROM tb_contato WHERE contato_id = " + idContato;
        return conexao.prepareStatement(sql).executeQuery();
    }

    public ResultSet buscarContato() throws SQLException {
        String sql = "SELECT contato_id, nome, e_mail, telefone FROM tb_contato WHERE contato_id = " + this.idContato;
        return conexao.prepareStatement(sql).executeQuery();
    }

    public List<Contato> listarContatos() throws SQLException {
        List<Contato> lista = new ArrayList<>();
        String sql = "SELECT contato_id, nome, e_mail, telefone FROM tb_contato";

        ResultSet rs = conexao.prepareStatement(sql).executeQuery();
        while (rs.next()) {
            Contato contato = new Contato();
            contato.setIdContato(rs.getInt("contato_id"));
            contato.setNome(rs.getString("nome"));
            contato.setEmail(rs.getString("e_mail"));
            contato.setTelefone(rs.getString("telefone"));
            lista.add(contato);
        }
        return lista;
    }

    public List<Contato> pesquisarContato(String termo) throws SQLException {
        List<Contato> lista = new ArrayList<>();
        String sql = "SELECT contato_id, nome, e_mail, telefone FROM tb_contato WHERE nome LIKE ? OR e_mail LIKE ? OR telefone LIKE ?";

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, "%" + termo + "%");
        stmt.setString(2, "%" + termo + "%");
        stmt.setString(3, "%" + termo + "%");

        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Contato contato = new Contato();
            contato.setIdContato(rs.getInt("contato_id"));
            contato.setNome(rs.getString("nome"));
            contato.setEmail(rs.getString("e_mail"));
            contato.setTelefone(rs.getString("telefone"));
            lista.add(contato);
        }
        return lista;
    }

    @Override
    public String toString() {
        return "Contato{id=" + idContato + ", nome='" + nome + '\'' + ", email='" + email + '\'' + ", telefone='" + telefone + '\'' + '}';
    }
}
