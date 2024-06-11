package br.com.fintech.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fintech.Conta;
import br.com.fintech.jdbc.FintechDBManager;

public class ContaDAO {
	private Connection conexao;
	
	public void cadastrar(Conta conta, int id_usuario) {
	      PreparedStatement stmt = null;
	  
	      try {
	        conexao = FintechDBManager.obterConexao();
	        String sql = "INSERT INTO T_CONTA(NM_CONTA, DS_DESCRICAO_CONTA, T_USUARIO_ID_USUARIO, ID_CONTA) VALUES (?, ?, ?, SQ_conta.NEXTVAL)";
	        stmt = conexao.prepareStatement(sql);
	        stmt.setString(1, conta.getNome());
	        stmt.setString(2, conta.getDescricao());
	        stmt.setInt(3, id_usuario);

	        stmt.executeUpdate();
	      } catch (SQLException e) {
	        e.printStackTrace();
	      } catch (Exception e) {
	    	  e.printStackTrace();
	      } finally {
	        try {
	          stmt.close();
	          conexao.close();
	        } catch (SQLException e) {
	          e.printStackTrace();
	        }
	      }
	    }
	
	public List<Conta> getAll() {

	    List<Conta> lista = new ArrayList<Conta>();
	    PreparedStatement stmt = null;
	    ResultSet rs = null;
	    try {
	      conexao = FintechDBManager.obterConexao();
	    stmt = conexao.prepareStatement("SELECT * FROM T_CONTA");
	    rs = stmt.executeQuery();
	  
	    while (rs.next()) {
	    int ID = rs.getInt("ID_CONTA");
	    String nome = rs.getString("NM_CONTA");
	    String descricao = rs.getString("DS_DESCRICAO_CONTA");
	        
	        Conta conta = new Conta(ID, nome, descricao);
	        
	        lista.add(conta);
	      }
	    } catch (SQLException e) {
	      e.printStackTrace();
	    }finally {
	      try {
	        stmt.close();
	        rs.close();
	        conexao.close();
	      } catch (SQLException e) {
	        e.printStackTrace();
	      }
	    }
	    return lista;
	  }
}
