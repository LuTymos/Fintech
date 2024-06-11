package br.com.fintech.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.fintech.Post;
import br.com.fintech.jdbc.FintechDBManager;

public class PostDAO {
    private Connection conexao;

    public void cadastrar(Post post, int id_usuario) {
        PreparedStatement stmt = null;

        try {
            conexao = FintechDBManager.obterConexao();
            String sql = "INSERT INTO T_POST(NM_TITULO, TX_CONTENT, T_USUARIO_ID_USUARIO, DT_PUBLISHDATE, ID_POST) VALUES (?, ?, ?, ?,  SQ_POST.NEXTVAL)";
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, post.getTitulo());
            stmt.setString(2, post.getContent());
            stmt.setInt(3, id_usuario);
            java.sql.Date data = new java.sql.Date(post.getPublishDate().getTimeInMillis());
            stmt.setDate(4, data);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null)
                    stmt.close();
                if (conexao != null)
                    conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public List<Post> getAll() {
        List<Post> lista = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conexao = FintechDBManager.obterConexao();
            stmt = conexao.prepareStatement("SELECT * FROM T_POST");
            rs = stmt.executeQuery();

            while (rs.next()) {
                int id_post = rs.getInt("ID_POST");
                String titulo = rs.getString("NM_TITULO");
                String content = rs.getString("TX_CONTENT");
                Calendar publishDate = Calendar.getInstance();
                publishDate.setTime(rs.getDate("DT_PUBLISHDATE"));

                Post post = new Post(id_post, titulo, content, publishDate);
                lista.add(post);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null)
                    stmt.close();
                if (rs != null)
                    rs.close();
                if (conexao != null)
                    conexao.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return lista;
    }
}
