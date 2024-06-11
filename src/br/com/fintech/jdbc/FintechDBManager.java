package br.com.fintech.jdbc;
  
  import java.sql.Connection;
  import java.sql.DriverManager;
  
  public class FintechDBManager {
  
    public static Connection obterConexao() {
    	Connection conexao = null;
      try {

        Class.forName("oracle.jdbc.driver.OracleDriver");
  

        conexao = DriverManager.getConnection(
            "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM552954", "060604");
        
        

        
        
      } catch (Exception e) {
          e.printStackTrace();
        }
      System.out.println("Conectado!");
      return conexao;
    }
  }